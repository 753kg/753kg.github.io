package com.carbonjava.app.tumblermileage.model;

public class TumblerModel {

    private int tumbler_id;
    private String tumbler_image;
    private String user_id;
    private int use_cnt;

    // getter, setter
    public int getTumbler_id() {
        return tumbler_id;
    }

    public void setTumbler_id(int tumbler_id) {
        this.tumbler_id = tumbler_id;
    }

    public String getTumbler_image() {
        return tumbler_image;
    }

    public void setTumbler_image(String tumbler_image) {
        this.tumbler_image = tumbler_image;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getUse_cnt() {
        return use_cnt;
    }

    public void setUse_cnt(int use_cnt) {
        this.use_cnt = use_cnt;
    }
}
