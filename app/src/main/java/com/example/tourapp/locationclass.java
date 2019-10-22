package com.example.tourapp;

public class locationclass {

    ///custom class to store data for locations and its photos
    private int mLoctionName;
    private int mLoctionDescribtion;



    public locationclass(int mLoctionName, int mLoctionDescribtion) {
        this.mLoctionName = mLoctionName;
        this.mLoctionDescribtion = mLoctionDescribtion;

    }





    public int getmLoctionName() {
        return mLoctionName;
    }

    public int getmLoctionDescribtion() {
        return mLoctionDescribtion;
    }


}
