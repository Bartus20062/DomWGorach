package com.example.domekwgorach;

import androidx.lifecycle.ViewModel;

public class CountView extends ViewModel {
    private static int count =0;

    public static int getCount() {
        return count;
    }
    public static void incrementCount() {
        count ++;
    }
}