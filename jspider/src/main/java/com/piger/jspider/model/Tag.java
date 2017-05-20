package com.piger.jspider.model;

/**
 * Created by pigercc.liang on 2017/5/20.
 */
public class Tag {

    private long id;

    private String hashId;

    private String name;

    public Tag(String hashId,String name)
    {
        this.hashId =hashId;
        this.name =name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
