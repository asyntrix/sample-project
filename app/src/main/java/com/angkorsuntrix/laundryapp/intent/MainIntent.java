package com.angkorsuntrix.laundryapp.intent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

import com.angkorsuntrix.laundryapp.ui.MainActivity;

/**
 * Created by borrom on 2/22/16.
 */
@SuppressLint("ParcelCreator")
public class MainIntent extends Intent {

    public MainIntent(Context context){
        setClass(context, MainActivity.class);
    }

}
