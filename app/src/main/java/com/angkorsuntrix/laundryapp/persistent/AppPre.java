package com.angkorsuntrix.laundryapp.persistent;


import android.content.Context;
import android.content.SharedPreferences;

public final class AppPre {

    private static final String  NAME = AppPre.class.getSimpleName();
    private static SharedPreferences mPreferences;
    private static SharedPreferences.Editor mEditor;
    private static final String FIRST_START_KEY = "first_start_key";

    public AppPre(Context context){
        mPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        mEditor = mPreferences.edit();
    }

    public static void firstStart() {
        mEditor.putBoolean(FIRST_START_KEY, true).apply();
    }

    public static boolean isFirstStart() {
        return !mPreferences.getBoolean(FIRST_START_KEY,false);

    }

}
