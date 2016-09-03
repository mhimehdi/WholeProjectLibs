import com.javaUtils.StringUtil;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mhafidi on 29/08/2016.
 */
public class Main {

    static public final String TEST_STRING= "Some people live for the fortune Some people live for the fortune";
    static public final String TEST_STRING2= "2012.06.06,00:00,6027.55,6130.60,5993.22,6129.35,13658";
    static public final String TEST_STRING3= "Input text, with words, punctuation, etc. Well, it's rather short.";
    public static void main(String args[])
    {
        System.out.println("******************************************");
        System.out.println("Tests Start:");
        System.out.println("******************************************");
        StringUtil stringUtil = new StringUtil(TEST_STRING2);
        stringUtil.collectWordsFromStringIgnorePunctuationAndSpaceRegardless(":.").
                stream().forEach(t->{System.out.println(t);});

    }

}
