package com.javaUtils;

import com.logs.LogService;
import com.sun.xml.internal.stream.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * PackageName com.javaUtils
 * Created by mhafidi on 28/09/2016.
 */
public class HashMapsUtils
{

    public static void print(HashMap<Integer,List<String>> aInHashmap)
    {
        if(aInHashmap!=null && !aInHashmap.isEmpty())
        {
            aInHashmap.keySet().stream().
                    forEach(lIndex->{
                        LogService.getInstance().logInfo("**********"+lIndex+"*********");
                        System.out.println((String)aInHashmap.get(lIndex).stream().collect(Collectors.joining(", ")));
                    });

        }
    }


    public static HashMap MergingMaps(final Collection<HashMap>aInMapsCollection)
    {
        Function<Map.Entry,String> groupingFunction = l-> (String) l.getKey();

        return (HashMap) aInMapsCollection.stream().
                flatMap(hashMap->hashMap.entrySet().stream()).
                collect(Collectors.groupingBy(groupingFunction));

    }


}
