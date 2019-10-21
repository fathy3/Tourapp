package com.example.tourapp;

public class locationclass {

    private String mLoctionDescribtion;
    private String mLoctionName;
    private int mLoctionRecosurceId;

    public locationclass(String mLoctionDescribtion, String mLoctionName, int mLoctionRecosurceId) {
        this.mLoctionDescribtion = mLoctionDescribtion;
        this.mLoctionName = mLoctionName;
        this.mLoctionRecosurceId = mLoctionRecosurceId;
    }

    public String getmLoctionDescribtion() {
        return mLoctionDescribtion;
    }

    public String getmLoctionName() {
        return mLoctionName;
    }

    public int getmLoctionRecosurceId() {
        return mLoctionRecosurceId;
    }
}
