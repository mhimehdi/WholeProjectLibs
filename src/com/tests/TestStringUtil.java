package com.tests;

import com.javaUtils.StringUtil;

/**
 * Created by mhafidi on 29/08/2016.
 */
public class TestStringUtil extends AbstractTest
{
    protected String testName;

    static public final String TEST_STRING= "2012.06.06,00:00,6027.55,6130.60,5993.22,6129.35,13658";
    static public final String PUNC_NOT_TO_IGNORE=":.";

    public TestStringUtil(String aInTestName) {
        testName = aInTestName;
    }

    public  void testCollectWordsFromStringIgnorePunctuationAndSpaceRegardless()
    {
        StringUtil stringUtil = new StringUtil(TEST_STRING);
        if(stringUtil.collectWordsFromStringIgnorePunctuationAndSpaceRegardless(PUNC_NOT_TO_IGNORE).
                stream().filter(t->!t.contains(PUNC_NOT_TO_IGNORE)).findAny().orElse(null).equals(null))
        {
            System.out.println("Test [testCollectWordsFromStringIgnorePunctuationAndSpaceRegardless] ----[SUCCESSFUL]");

        }
        else
        {
            System.out.println("Test [testCollectWordsFromStringIgnorePunctuationAndSpaceRegardless] ----[FAILED]");
        }

    }
    @Override
    public void run() {
        super.run();
    }
}
