package com.example.demo;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.Date;

public class Model {
    private String id;
    private double angry;
    private double happy;
    private double neutral;
    private double sad;
    private double surpries;
    private String image;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:MM")
    private Date time;

    public Model(double angry, double happy, double neutral, double sad, double surpries,String image) {
        this.angry = angry;
        this.happy = happy;
        this.neutral = neutral;
        this.sad = sad;
        this.surpries = surpries;
        this.time=new Date();
        this.image=image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAngry() {
        return angry;
    }

    public void setAngry(double angry) {
        this.angry = angry;
    }

    public double getHappy() {
        return happy;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public double getNeutral() {
        return neutral;
    }

    public void setNeutral(double neutral) {
        this.neutral = neutral;
    }

    public double getSad() {
        return sad;
    }

    public void setSad(double sad) {
        this.sad = sad;
    }

    public double getSurpries() {
        return surpries;
    }

    public void setSurpries(double surpries) {
        this.surpries = surpries;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Double> toList() {
            ArrayList data=new ArrayList();
            data.add(getAngry());
            data.add(getHappy());
            data.add(getNeutral());
            data.add(getSad());
            data.add(getSurpries());
            return data;
    }
}
