package com.example.a127107.p02_ps;

/**
 * Created by 127107 on 25/4/2017.
 */

public class holiday {
    private String holiday;
    private String date;
    private String desc;
    private int img;

    public holiday(String holiday, String date, String desc, int img) {
        this.desc = desc;
        this.date = date;
        this.holiday = holiday;
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
}
