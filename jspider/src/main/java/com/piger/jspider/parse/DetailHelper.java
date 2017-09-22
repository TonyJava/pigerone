package com.piger.jspider.parse;

import com.piger.jspider.model.Detail;
import com.piger.jspider.model.Star;
import com.piger.jspider.model.Tag;
import com.piger.jspider.util.JsoupUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pigercc.liang on 2017/5/20.
 */
public class DetailHelper {

    public static  Detail parseDetail(Document doc) {
        Detail detailPage = new Detail();
        Element e = null;
        String text = null;
        //标题
        e = JsoupUtil.getFirstElementByAttributeValue(doc,"id","video_title");

        if (e != null) {
            e = JsoupUtil.getFirstElementByAttributeValue(e, "rel", "bookmark");
            if(e!=null)
            {
                detailPage.setTitle(e.text());
            }
        }
        //识别码
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "id", "video_id");
        if (e != null) {
            e = JsoupUtil.getFirstElementByAttributeValue(e, "class", "text");
            if (e != null) {
                detailPage.setIdCode(e.text());
            }
        }
        //播放地址videoId
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "rel", "shortlink");
        if (e != null) {
            text = e.attr("href");
            if (!StringUtils.isEmpty(text) && text.indexOf("=") > 0) {
                detailPage.setVideoId(text.substring(text.indexOf("=")+1));
            }

        }
        //大图片
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "id", "video_jacket_img");
        if (e != null) {
            text = e.attr("src");
            if (!StringUtils.isEmpty(text)) {
                detailPage.setBigImage(text);
            }
        }

        //小图片 不是所有的都有
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "class", "previewthumbs");
        if (e != null) {
            Elements es = e.getElementsByTag("img");
            if (es != null && es.size() > 0) {
                List<String> imageList = new ArrayList<String>();
                for (Element tmpE : es) {
                    imageList.add(tmpE.attr("src"));
                }
                detailPage.setSmallImages(imageList);
            }
        }

        //发行时间
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "id", "video_date");
        if (e != null) {
            e = JsoupUtil.getFirstElementByAttributeValue(e, "class", "text");
            if (e != null) {
                detailPage.setGmtCreate(e.text());
            }
        }

        //打分
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "class", "score");
        if (e != null && !StringUtils.isEmpty(text = e.text())) {
            if (text.startsWith("(") && text.endsWith(")")) {
                String scoreStr = text.substring(1, text.length() - 1);
                try {
                    detailPage.setScore(new BigDecimal(scoreStr));
                } catch (Exception ex) {
                }
            }
        }
        //用户使用情况
        e = JsoupUtil.getFirstElementByAttributeValueMatching(doc, "href", "userswanted.*");
        if (e != null && !StringUtils.isEmpty(text = e.text())) {
            try {
                detailPage.setUserWanted(Integer.valueOf(text));
            } catch (Exception ex) {
            }
        }
        e = JsoupUtil.getFirstElementByAttributeValueMatching(doc, "href", "userswatched.*");
        if (e != null && !StringUtils.isEmpty(text = e.text())) {
            try {
                detailPage.setUserWatched(Integer.valueOf(text));
            } catch (Exception ex) {
            }
        }
        e = JsoupUtil.getFirstElementByAttributeValueMatching(doc, "href", "usersowned.*");
        if (e != null && !StringUtils.isEmpty(text = e.text())) {
            try {
                detailPage.setUserOwned(Integer.valueOf(text));
            } catch (Exception ex) {
            }
        }

        //类别
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "id", "video_genres");
        if (e != null) {
            e = JsoupUtil.getFirstElementByAttributeValue(e, "class", "text");
            if (e != null) {
                Elements es = e.getElementsByAttributeValueStarting("href", "vl_genre.php");
                if (es != null && es.size() > 0) {
                    List<Tag> tags = new ArrayList<Tag>();
                    for (Element tmpE : es) {
                        String href = tmpE.attr("href");
                        if(!StringUtils.isEmpty(href) && href.indexOf("=") >0)
                        {
                            tags.add(new Tag(href.substring(href.indexOf("=")+1),tmpE.text()));
                        }
                    }
                    detailPage.setTags(tags);
                }
            }
        }

        //演员
        e = JsoupUtil.getFirstElementByAttributeValue(doc, "id", "video_cast");
        if (e != null) {
            e = JsoupUtil.getFirstElementByAttributeValue(e, "class", "text");
            if (e != null) {
                Elements es = e.getElementsByAttributeValueStarting("href", "vl_star.php");
                if (es != null && es.size() > 0) {
                    List<Star> stars = new ArrayList<Star>();
                    for (Element tmpE : es) {
                        String href = tmpE.attr("href");
                        if(!StringUtils.isEmpty(href) && href.indexOf("=") >0)
                        {
                            stars.add(new Star(href.substring(href.indexOf("=")+1),tmpE.text()));
                        }
                    }
                    detailPage.setStars(stars);
                }
            }
        }

        return detailPage;
    }
}
