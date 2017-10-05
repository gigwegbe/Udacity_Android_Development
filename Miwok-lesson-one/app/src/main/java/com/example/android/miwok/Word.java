package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String mMiwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return  mMiwokTranslation;
    }


}
