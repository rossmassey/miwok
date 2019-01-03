package com.example.android.miwok;

/*
 *  Class to hold default translation and its miwok translation
 */
public class Word {

    private String mDefaultTranslation;
    private String mMikwokTranslation;
    private int mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMikwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource) {
        mDefaultTranslation = defaultTranslation;
        mMikwokTranslation = miwokTranslation;
        mImageResourceId = imageResource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMikwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
