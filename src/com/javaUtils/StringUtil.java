package com.javaUtils;

import com.logs.StringsProperties;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PackageName javaUtils
 * Created by mhafidi on 29/08/2016.
 */
public class StringUtil implements ObjectNature
{
    protected String lStringEx;

    public StringUtil(String aInString)
    {
        lStringEx = aInString;
    }

    public void replace(String aInTarget, String aInReplacement)
    {
        Pattern p = Pattern.compile(aInTarget);
        Matcher m = p.matcher(lStringEx);
        lStringEx = m.replaceAll(aInReplacement);
    }

    public String getlStringEx()
    {
        return lStringEx;
    }

    public void setlStringEx(String aInString)
    {
        lStringEx = aInString;
    }



    public static String getSubstringInBetween(String in, String begin, String end)
    {
        String ret = "";

        try
        {
            if (!"".equals(begin) && !"".equals(end))
            {
                int indexBegin = in.indexOf(begin);
                int indexEnd = in.indexOf(end, indexBegin);

                ret = in.substring(indexBegin + begin.length(), indexEnd);
            }
        } catch (Throwable t)
        {
            // System.out.println("StringUtil.getSubstringInBetween(), any of {begin,end} are not contained");
        }

        return ret.trim();
    }

    /*
    * Description: computes number of regex within a sample string
    * date: 02/07/2016
    * auth: mhafidi
    * */

    public int computeRegexString(String aInRegex)
    {
        int $nb = 0;
        String tmp = lStringEx;
        Pattern p = Pattern.compile(aInRegex);
        Matcher m = p.matcher(tmp);
        while (m.find())
        {
            tmp = tmp.replaceFirst(aInRegex, "");
            m = p.matcher(tmp);
            $nb++;

        }

        return $nb;
    }

    /*
    *Description: from a sample string extract all the words and ignoring all the punctuations and the spaces
     *  and store them into an arrayList
    * date 30/08/2016
    * auth:mhafidi
     */
    public ArrayList<String> collectWordsFromStringIgnorePunctuationAndSpace()
    {

        ArrayList<String> lWords = new ArrayList<>();
        Pattern p = Pattern.compile("[\\w']+");
        Matcher m = p.matcher(lStringEx);

        while (m.find())
        {
            lWords.add(lStringEx.substring(m.start(), m.end()));

        }
        return lWords;
    }

    /*
    *Description: from a sample string extract all the words and ignoring space and punctuation
     *  and store them into an arrayList
     *  But the word in this case can include a kind of punctuation that we can set as parameter of this method
    * date 31/08/2016
    * auth:mhafidi
     */
    public ArrayList<String> collectWordsFromStringIgnorePunctuationAndSpaceRegardless(String aInPunctuation)
    {

        ArrayList<String> lWords = new ArrayList<>();
        Pattern p = Pattern.compile("[\\w" + aInPunctuation + "']+");
        Matcher m = p.matcher(lStringEx);

        while (m.find())
        {
            lWords.add(lStringEx.substring(m.start(), m.end()));

        }
        return lWords;
    }

    static public void copyString(String aInTarget, String aInOrigin)
    {
        aInTarget = aInOrigin;
    }

    @Override
    public boolean isItUsable(Object o)
    {
         try
         {
             StringUtil testNature= (StringUtil) o;
         }
         catch (Exception ex)
         {
             logger.logWarning(CLASS_NAME,
                     StringsProperties.MSG_OBJECT_NATURE_IS_NOT_APPROPRIATE.toString());
             return false;

         }
        return true;
    }

    //converting strings to the right typo

}