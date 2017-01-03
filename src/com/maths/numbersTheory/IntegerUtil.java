package com.maths.numbersTheory;

import com.sun.deploy.util.ArrayUtil;
import com.sun.javafx.collections.IntegerArraySyncer;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import com.sun.xml.internal.fastinfoset.algorithm.IntegerEncodingAlgorithm;
import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Created by mhafidi on 13/09/2016.
 */
public interface IntegerUtil {


    public boolean isEvenNumber();
    public boolean isOddNumber();
    static public ArrayList<java.lang.Integer> getListBetween(java.lang.Integer aInLow, java.lang.Integer aInHigh) {
        if (aInLow >= aInHigh)
            return new ArrayList<java.lang.Integer>();
        else {
            ArrayList<java.lang.Integer> l =
                    new ArrayList<java.lang.Integer>();
            for (int i = aInLow + 1; i < aInHigh; i++) {
                l.add(i);
            }
            return l;
        }
    }
    public boolean isPrime();
    public boolean isContainedInCollection(Collection<java.lang.Integer> aInCollection);
    public boolean isContainedInTheIntersectionOfSeveralCollections(Collection<Collection<java.lang.Integer>>aInCollections);



}
