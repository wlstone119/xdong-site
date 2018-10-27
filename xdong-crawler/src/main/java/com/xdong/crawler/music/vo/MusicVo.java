package com.xdong.crawler.music.vo;

/**
 * @description
 * @author stone
 * @date 2017年8月18日
 */
public class MusicVo {

    // 歌名
    private String name;

    // 歌曲播放连接
    private String link;

    // 歌手
    private String singer;

    // 专辑
    private String album;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
