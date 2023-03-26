package com.anas.gfgtiktokclone;

public class Model_Video {

    String DESC, TITLE,URL;

    Model_Video(){


    }

    public Model_Video(String DESC, String TITLE, String url) {
        this.DESC = DESC;
        this.TITLE = TITLE;
        URL = url;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getUrl() {
        return URL;
    }

    public void setUrl(String url) {
        URL = url;
    }
}
