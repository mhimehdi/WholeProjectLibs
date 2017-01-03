package com.tests;

import com.maths.numbersTheory.ImpIntegerUtil;

import java.util.ArrayList;

/**
 * Created by mhafidi on 19/09/2016.
 */
public class testPrimeNumberDistribution
{
    public static java.lang.Integer MAX_VALUE= java.lang.Integer.valueOf(2000);
    public static ArrayList<Integer> lArrayList;

    public void testPrimeNumbersDistribution()
    {
        lArrayList = ImpIntegerUtil.getSortedIntegerListLowerThan(MAX_VALUE);


    }


}
