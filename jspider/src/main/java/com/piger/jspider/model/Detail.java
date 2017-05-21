package com.piger.jspider.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by pigercc.liang on 2017/5/20.
 */
public class Detail implements Serializable {

    private long id;

    private String title;

    //识别码
    private String idCode;


    //类似于 javlikity4 访问方式 ?v=javlikity4
    private String videoId;

    private String bigImage;

    private List<String> smallImages;

    private String gmtCreate;

    private BigDecimal score;

    private int userWanted;

    private int userWatched;

    private int userOwned;

    private List<Tag> tags;

    private List<Star> stars;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }


    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public List<String> getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(List<String> smallImages) {
        this.smallImages = smallImages;
    }


    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public int getUserWanted() {
        return userWanted;
    }

    public void setUserWanted(int userWanted) {
        this.userWanted = userWanted;
    }

    public int getUserWatched() {
        return userWatched;
    }

    public void setUserWatched(int userWatched) {
        this.userWatched = userWatched;
    }

    public int getUserOwned() {
        return userOwned;
    }

    public void setUserOwned(int userOwned) {
        this.userOwned = userOwned;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return id+"\t"+title+"\t"+idCode+"\t"+videoId+"\t"+userWanted;
    }
}
