package com.maths.numbersTheory;

import com.maths.numbersTheory.Couple;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by mhafidi on 05/09/2016.
 */
public class SetsUtil<T>
{
    protected Set<T> mainSet;

    public SetsUtil()
    {
        mainSet = new HashSet<T>();
    }

    public SetsUtil(Set<T> aInMainSet) {
        this.mainSet = aInMainSet;
    }

    public Set<T> getMainSet() {
        return mainSet;
    }

    public void setMainSet(Set<T> mainSet) {
        this.mainSet = mainSet;
    }

    public static HashSet getIntersection(HashSet aInHashSet1,HashSet aInHashSet2)
    {
        if(aInHashSet1==null || aInHashSet2==null)
        {return new HashSet();}

        return (HashSet) aInHashSet1.stream().
                filter(t->aInHashSet2.contains(t)).collect(Collectors.toSet());
    }
    public static Boolean isSetIncludedInOtherSet(HashSet aInHashSet1,HashSet aInHashSet2)
    {

        return (aInHashSet1==null || aInHashSet2==null)?
                false:!(aInHashSet1.stream().filter(t->!aInHashSet2.contains(t)).findAny().isPresent());
    }
    public static HashSet getUnionOfTwoSets(HashSet aInHashSet1,HashSet aInHashSet2)
    {
        if(aInHashSet1 == null && aInHashSet2 ==null)
        {
            return new HashSet();
        }
        else if (aInHashSet1 == null && aInHashSet2 !=null)
        {
            return aInHashSet2;
        }
        else if (aInHashSet1 !=null && aInHashSet2 ==null)
        {
            return aInHashSet1;
        }
        HashSet lResSet = new HashSet();
        lResSet.addAll(aInHashSet1);
        lResSet.addAll(aInHashSet2);
        return lResSet;

    }

    public static HashSet<Couple> createPossibleCouples(HashSet aInHashSet)
    {
        HashSet<Couple> lHashSet = new HashSet<Couple>();

        if(aInHashSet.size()>=2)
        {
            for(int i=0;i<(aInHashSet.size());i++)
            {
                for(int j=i+1;j<aInHashSet.size();j++)
                {
                    Couple lCouple = new Couple(aInHashSet.toArray()[i],aInHashSet.toArray()[j]);
                    lHashSet.add(lCouple);
                }
            }

        }

        return lHashSet;

    }


}
