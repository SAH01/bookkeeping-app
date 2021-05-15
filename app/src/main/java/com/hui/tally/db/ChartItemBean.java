package com.hui.tally.db;

public class ChartItemBean {
    int sImageId;
    String type;
    float ratio;   //所占比例
    float totalMoney;  //此项的总钱数

    public ChartItemBean() {
    }

    public void setsImageId(int sImageId) {
        this.sImageId = sImageId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getsImageId() {
        return sImageId;
    }

    public String getType() {
        return type;
    }

    public float getRatio() {
        return ratio;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public ChartItemBean(int sImageId, String type, float ratio, float totalMoney) {
        this.sImageId = sImageId;
        this.type = type;
        this.ratio = ratio;
        this.totalMoney = totalMoney;
    }
}
