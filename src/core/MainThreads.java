package core;

import com.javaUtils.StringUtil;
import com.logs.LogService;
import com.maths.numbersTheory.ImpIntegerUtil;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * PackageName core
 * Created by mhafidi on 17/12/2016.
 */
public class MainThreads
{
    static private final String CLASS_NAME = MainThreads.class.getName();
    static private final String SKIP_LINE_LOG = "**************************************************************";
    static private final String TEST_STRING = "network:MRBTS-1";


    public static void main(String args[])
    {


        testStringParser(TEST_STRING);

        testOptional();
        System.out.println(SKIP_LINE_LOG);
        testTimer();
        System.out.println(SKIP_LINE_LOG);




    }

    static void testOptional()
    {
        LogService.getInstance().logInfo(CLASS_NAME, " Example of .ofNullable method Optional class");
        String x= null;
        Optional <String> p = Optional.ofNullable(x);
        p.ifPresent(System.out::println);
        LogService.getInstance().logInfo(CLASS_NAME," End Example .ofNullable method Optional class");
    }
    static void testTimer()
    {
        LogService.getInstance().logInfo(CLASS_NAME,"Example of timer in milliseconds");

        Long lcurrentTime =System.currentTimeMillis();


        System.out.println( "There are: "+
                IntStream.range(1,50000).mapToObj(Integer::new).
                        filter(ImpIntegerUtil::isPrime).count()+ " prime numbers" +
                " between 1 and 50000");

        System.out.println("process duration is: " + (System.currentTimeMillis()-lcurrentTime) +" ms.");
        LogService.getInstance().logInfo(CLASS_NAME,"End Example of timer in milliseconds");
    }


    static String testStringParser(String aInString)
    {
        String lString= aInString;
        String lRet="";
        int tmpIndex = 0;
        int count=0; // counts number of ":" if count>=2 then dn isn't a root else the entered dn is a root

        if(aInString!=null)
        {

            while (lString.contains(":"))
            {
                tmpIndex = lString.indexOf(":") + 1;
                lRet = lRet + lString.substring(0, tmpIndex);
                if (tmpIndex < lString.length())
                {
                    lString = lString.substring(tmpIndex, lString.length());
                }
                count++;
            }
            if (lRet.length() > 0)
            {
                lRet = lRet.substring(0, lRet.length() - 1);
            }
            else
                lRet = aInString;
        }
        if(count<2 && aInString!=null)
        {
            lRet = aInString;
        }


        return lRet;
    }
}
