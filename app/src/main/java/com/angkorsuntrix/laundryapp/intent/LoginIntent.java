package com.angkorsuntrix.laundryapp.intent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

import com.angkorsuntrix.laundryapp.ui.LoginActivity;

/**
 * Created by borrom on 2/22/16.
 */
@SuppressLint("ParcelCreator")
public class LoginIntent extends Intent {

    public LoginIntent(Context context){
        setClass(context, LoginActivity.class);
    }
}
