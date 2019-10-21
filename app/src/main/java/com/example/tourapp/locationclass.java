package com.example.tourapp;

public class locationclass {

    ///custom class to store data for locations and its photos
    private String mLoctionName;
    private String mLoctionDescribtion;
    private int mImageRecsourceId;


    public locationclass(String mLoctionName, String mLoctionDescribtion) {
        this.mLoctionName = mLoctionName;
        this.mLoctionDescribtion = mLoctionDescribtion;

    }

    public locationclass(int mImageRecsourceId) {
        this.mImageRecsourceId = mImageRecsourceId;
    }

    public int getmImageRecsourceId() {
        return mImageRecsourceId;
    }

    public String getmLoctionName() {
        return mLoctionName;
    }

    public String getmLoctionDescribtion() {
        return mLoctionDescribtion;
    }
}
