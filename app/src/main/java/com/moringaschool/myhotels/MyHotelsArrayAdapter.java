package com.moringaschool.myhotels;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyHotelsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mHotels;
    private String[] mCuisines;

    public MyHotelsArrayAdapter(Context mContext, int resource, String[] mHotels, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mHotels = mHotels;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mHotels[position];
        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s", restaurant, cuisine);
    }

    @Override
    public int getCount() {
        return mHotels.length;
    }
}