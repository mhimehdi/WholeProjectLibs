package com.maths.numbersTheory;

import com.javaUtils.ObjectNature;
import com.logs.LogService;
import com.logs.StringsProperties;

/**
 * Created by mhafidi on 10/09/2016.
 */
public class Couple<T> implements ObjectNature
{
    protected T l1;
    protected T l2;
    final private static String CLASS_NAME=Couple.class.toString();
    protected LogService logger= LogService.getInstance();

    public Couple(T l1, T l2)
    {
        this.l1 = l1;
        this.l2 = l2;
    }

    public T getL1()
    {
        return l1;
    }

    public void setL1(T l1)
    {
        this.l1 = l1;
    }

    public T getL2()
    {
        return l2;
    }

    public void setL2(T l2)
    {
        this.l2 = l2;
    }

    public void setCouple(T l1, T l2)
    {
        this.l1 = l1;
        this.l2 = l2;
    }

    public boolean equals(Couple aInElement)
    {
        return (aInElement == null || this == null) ? false : ((aInElement.getL1().equals(this.getL1()) && aInElement.getL2().equals(this.getL2())) ||
                (aInElement.getL1().equals(this.getL2()) && aInElement.getL2().equals(this.getL1())));

    }

    @Override
    public boolean isItUsable(Object o)
    {
        try
        {
            Couple testNature= (Couple) o;
        }
        catch (Exception ex)
        {
            logger.logWarning(CLASS_NAME,
                    StringsProperties.MSG_OBJECT_NATURE_IS_NOT_APPROPRIATE.toString());
            return false;

        }
        return true;
    }

    public Double module(Couple<T> aInCouple) throws Exception
    {
        Double module = 0.0;
        Double a, b;

        try
        {
            a = Math.sqrt(Double.valueOf((Double) l1));
            b = Math.sqrt(Double.valueOf((Double) l2));
        }
        catch (Exception e)
        {
            logger.logError(CLASS_NAME, e.getMessage());
            throw new Exception(e.getMessage());
        }
        module = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        return module;


    }
}
