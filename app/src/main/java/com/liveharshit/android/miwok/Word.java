package com.liveharshit.android.miwok;

/**
 * Created by harshit on 6/3/18.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word (String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public  String getMiwokTranslation () {
        return  mMiwokTranslation;
    }
}
