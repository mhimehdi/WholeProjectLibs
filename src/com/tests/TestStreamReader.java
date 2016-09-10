package com.tests;

import com.javaUtils.StreamReader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by mhafidi on 10/09/2016.
 */
public class TestStreamReader extends AbstractTest
{
    protected String testName;


    public TestStreamReader(String aInTestName) {
        testName = aInTestName;
    }

    public static void testConvertFileToLineList()
    {
        StreamReader lStreamReader = new StreamReader("C:\\Users\\mhafidi\\Documents\\Projects\\WholeProjectLibs\\filesForTest\\EURUSD1440.csv");

        try {
            List list = lStreamReader.convertFileToLineList();
            if(!list.isEmpty())
            {
                for(int i=0; i<((list.size()<=3)?list.size():3);i++)
                {
                    System.out.println(list.get(i));

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
