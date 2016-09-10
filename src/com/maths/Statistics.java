package com.maths;

import java.util.ArrayList;

/**
 * Created by mhafidi on 29/08/2016.
 */
public class Statistics
{
    protected double linearAverage;
    protected double variance;
    protected double error;
    protected ArrayList<Double> data;


    public static long binomial(int n, int k)
    {
        if (k>n-k)
            k=n-k;

        long b=1;
        for (int i=1, m=n; i<=k; i++, m--)
            b=b*m/i;
        return b;
    }

}
