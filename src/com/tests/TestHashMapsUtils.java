package com.tests;

import com.javaUtils.HashMapsUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * PackageName com.tests
 * Created by mhafidi on 04/10/2016.
 */
public class TestHashMapsUtils extends AbstractTest
{
    private static HashMap lHashMapHashMap = new HashMap();
    private void InitTest()
    {

        HashMap<String, Integer> tempHashMap = new HashMap<>();
        tempHashMap.put("eNB1",33);tempHashMap.put("eNB2",3);tempHashMap.put("eNB3",1);

        HashMap<String, java.lang.Integer> tempHashMap1 = new HashMap<>();
        tempHashMap1.put("eNB4",33);tempHashMap1.put("eNB5",3);tempHashMap1.put("eNB6",2);
        lHashMapHashMap.put("OMS1",tempHashMap);lHashMapHashMap.put("OMS2",tempHashMap1);


    }
    public static void TestMergingMaps() throws Exception
    {
        try
        {
            ArrayList<HashMap> hashMaps =
                    (ArrayList<HashMap>) lHashMapHashMap.values().stream().collect(Collectors.toList());

            HashMap ltmp = HashMapsUtils.MergingMaps(hashMaps);
        }
        catch (Exception e)
        {
            throw e;
        }




    }
}
