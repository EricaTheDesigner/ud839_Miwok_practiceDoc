package com.example.android.miwok;

public class Word {

    //Line one Default translation for the word
    private String mDefaultTranslation;

    //Line two Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Create a new Word Object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (English)
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     */
    //constructor name has to match Class "Word"
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //test

}
