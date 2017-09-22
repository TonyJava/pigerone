package com.piger.jspider.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by pigercc.liang on 2017/5/20.
 */
public class JsoupUtil {

    public static Document parse(String url) throws IOException {
        return Jsoup.connect(url).header("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2").get();
    }

    public static  Element getFirstElementByAttributeValue(Element node,String key,String value)
    {
        Elements es =node.getElementsByAttributeValue(key,value);
        if(es !=null && es.size()>0)
        {
            return es.get(0);
        }
        return null;
    }

    public static  Element getFirstElementByAttributeValueMatching(Element node,String key,String regex)
    {
        Elements es =node.getElementsByAttributeValueMatching(key,regex);
        if(es !=null && es.size()>0)
        {
            return es.get(0);
        }
        return null;
    }

}
