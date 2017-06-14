package com.example.android.miwok;

import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Toby on 04/06/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundFileResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundFileResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundFileResourceId = soundFileResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, int soundFileResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundFileResourceId = soundFileResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId(){return mImageResourceId; }

    public int getSoundFileResourceId(){ return mSoundFileResourceId; }

    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED; }

}
