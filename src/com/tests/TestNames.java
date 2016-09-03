package com.tests;

/**
 * Created by mhafidi on 03/09/2016.
 */
public enum TestNames

{
    CollectWordsFromStringIgnorePunctuationAndSpaceRegardless("CollectWordsFromStringIgnorePunctuationAndSpaceRegardless");
    private String testName;

    private TestNames(String aInString)
    {
        this.testName =aInString;
    }
    public String toString(){return this.testName;}
}
