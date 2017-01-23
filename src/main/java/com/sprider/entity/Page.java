package com.sprider.entity;

/**
 * Created by Administrator on 2016/11/30.
 * 保存页面内容
 *
 */
public class Page {
    private String content;
    //总播放
    private String allnumber;
    //每日播放增量
    private String daynumber;
    //评论数
    private String commennumber;
    //收藏数
    private String collectnumber;
    //赞
    private String supportnumber;
    //踩
    private String againstnumber;


    //电视剧名称
    private String tvname;
    //页面url
    private String url;
    //子集数据
    private String episodenumber;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommennumber() {
        return commennumber;
    }

    public void setCommennumber(String commennumber) {
        this.commennumber = commennumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTvname() {
        return tvname;
    }

    public void setTvname(String tvname) {
        this.tvname = tvname;
    }

    public String getAgainstnumber() {
        return againstnumber;
    }

    public void setAgainstnumber(String againstnumber) {
        this.againstnumber = againstnumber;
    }

    public String getSupportnumber() {
        return supportnumber;
    }

    public void setSupportnumber(String supportnumber) {
        this.supportnumber = supportnumber;
    }

    public String getEpisodenumber() {
        return episodenumber;
    }

    public void setEpisodenumber(String episodenumber) {
        this.episodenumber = episodenumber;
    }

    public String getCollectnumber() {
        return collectnumber;
    }

    public void setCollectnumber(String collectnumber) {
        this.collectnumber = collectnumber;
    }

    public String getDaynumber() {
        return daynumber;

    }

    public void setDaynumber(String daynumber) {
        this.daynumber = daynumber;
    }



    public String getAllnumber() {
        return allnumber;
    }

    public void setAllnumber(String allnumber) {
        this.allnumber = allnumber;
    }
}
