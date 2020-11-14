package com.example.demo;

public class Response extends Model {
    private int degrre;
    private double max;
    private String type;
    public Response(double angry, double happy, double neutral, double sad, double surpries, String image,int degrre,double max,String type) {
        super(angry, happy, neutral, sad, surpries, image);
        this.degrre=degrre;
        this.max=max;
        this.type=type;
    }
    public int getDegrre() {
        return degrre;
    }
    public void setDegrre(int degrre) {
        this.degrre = degrre;
    }
    public double getMax() {
        return max;
    }
    public void setMax(double max) {
        this.max = max;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
