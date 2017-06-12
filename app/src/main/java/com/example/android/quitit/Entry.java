package com.example.android.quitit;

/**
 * Created by Ayush vaid on 12-06-2017.
 */
public class Entry {

    private String mName;
    private int mAge;
    private String mDate;

    public Entry(String name, int age, String date)
    {
        mName = name;
        mAge = age;
        mDate = date;
    }

    public int getAge() {
        return mAge;
    }
    public String getName(){
        return mName;
    }
    public String getDate(){
        return mDate;
    }
}
