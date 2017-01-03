package com.maths.numbersTheory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * PackageName maths
 * Created by mhafidi on 14/09/2016.
 */
public class ImpIntegerUtil implements IntegerUtil
{
    java.lang.Integer t;

    public ImpIntegerUtil(int aInAtomicInteger)
    {
        t=aInAtomicInteger;
    }
    @Override
    public boolean isContainedInCollection(Collection<java.lang.Integer> aInCollection)
    {
        return (aInCollection!=null && !aInCollection.isEmpty())&& aInCollection.contains(t);

    }

    @Override
    public boolean isContainedInTheIntersectionOfSeveralCollections(Collection<Collection<java.lang.Integer>> aInCollections)
    {
        return (aInCollections!=null && !aInCollections.isEmpty()) &&
                (aInCollections.parallelStream().
                        filter(collection->!collection.contains(t)).
                        findAny().isPresent());

    }

    public ImpIntegerUtil(java.lang.Integer aInInteger)
    {
        t= aInInteger;
    }

    @Override
     public boolean isEvenNumber()
    {
            return (t!=null )&& (t%(2)==0);
    }

    @Override
     public boolean isOddNumber()
    {
            return (t!=null) && !isEvenNumber();
    }

    public static boolean isEvenNumber(Integer p)
    {
        return (p!=null )&& (p%(2)==0);
    }
    public static boolean isOddNumber(Integer p)
    {
        return   (p!=null) && !isEvenNumber(p);
    }


    public static ArrayList<java.lang.Integer> getSortedIntegerListLowerThan(java.lang.Integer aInInteger)
    {
        ArrayList<java.lang.Integer> list = new ArrayList<java.lang.Integer>(aInInteger!=null?aInInteger:0);

        if(aInInteger!=null) {
            for (int i = 0; i < aInInteger; i++)
                list.add(i);
        }
        return list;
    }
     public boolean isPrime()
    {
        return (t!=null && isOddNumber())&&
                !(IntegerUtil.getListBetween(1,t/2).
                        parallelStream().
                        filter(l->t%(l)==0)).
                        findFirst().
                        isPresent();
    }

    public static boolean isPrime(Integer p)
    {
        return (p!=null && isOddNumber(p))&&
                !(IntegerUtil.getListBetween(1,p/2).
                        parallelStream().
                        filter(l->p%(l)==0)).
                        findFirst().
                        isPresent();
    }

    public java.lang.Integer getT() {
        return t;
    }

    public void setT(java.lang.Integer t) {
        this.t = t;
    }
}
