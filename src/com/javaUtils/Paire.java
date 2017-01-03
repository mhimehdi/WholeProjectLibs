package com.javaUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * PackageName com.javaUtils
 * Created by mhafidi on 27/11/2016.
 */
public class Paire<X>
{
    X t1;
    X t2;

    public Paire(X aInT1, X aInT2)
    {
        t1 = aInT1;
        t2 = aInT2;
    }

    public X getT1()
    {
        return t1;
    }

    public void setT1(X t1)
    {
        this.t1 = t1;
    }

    public X getT2()
    {
        return t2;
    }

    public void setT2(X t2)
    {
        this.t2 = t2;
    }

    public List<Paire> generatePaires(ArrayList<X> aInlist)
    {
        return IntStream.range(1, aInlist.size()).mapToObj(i -> new Paire(aInlist.get(i - 1), aInlist.get(i)))
                .collect(Collectors.toList());

    }

    /**
     *A HashMap of pairs groupped by T1
     */

    public Map convertListOfPairesToHashMap(ArrayList<Paire> aInList)
    {
        Function<Paire, X> functionMapping = p -> (X) p.getT1();

        return (Map) aInList.stream().collect(Collectors.groupingBy(functionMapping));

    }

}