package com.example.fud.mvpexample;

/**
 * Created by FuD on 15/7/10.
 */
public class MergeModelImpl implements MergeModel{
    @Override
    public String getMerge(String a, String b) {
        return a+b;
    }
}
