package com.javaUtils;

import com.logs.LogService;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/**
 * PackageName com.javaUtils
 * Created by mhafidi on 10/10/2016.
 */
public interface ObjectNature
{
    final static String CLASS_NAME = ObjectNature.class.toString();
    LogService logger = LogService.getInstance();


    static boolean isDouble(Object o)
    {
        if(o==null)
        {
            logger.logError(CLASS_NAME,"The given Object is Null");
            return false;
        }
        try
        {
            Double.valueOf((Double) o);
        }
        catch (Exception e)
        {
            logger.logWarning(CLASS_NAME,"The Entered Object ["
                    +o.getClass().toString()+"] isn't a Double");
            return false;
        }
        return true;
    }
    static boolean isInteger(Object o)
    {
        if(o==null)
        {
            logger.logError(CLASS_NAME,"The given Object is Null");
            return false;
        }
        try
        {
            Integer.valueOf((Integer) o);
        }
        catch (Exception e)
        {
            logger.logWarning(CLASS_NAME,"The Entered Object class ["
                    +o.getClass().toString()+"] isn't an Integer");
            return false;
        }
        return true;
    }

    static boolean isHashMap(Object o)
    {
        if(o==null)
        {
            logger.logError(CLASS_NAME,"The given Object is Null");
            return false;
        }
        try
        {
            ((HashMap) o).isEmpty();
        }
        catch (Exception e)
        {
            LogService.getInstance().logWarning(ObjectNature.class.toString(),"The Entered Object class ["
                    +o.getClass().toString()+"] isn't a HashMap");
            return false;
        }
        return true;
    }

    static boolean isDomNode(Object o)
    {
        try
        {
            ((Node) o).getNodeName();
        }
        catch (Exception e)
        {
            LogService.getInstance().logWarning(ObjectNature.class.toString(),"The Entered Object class ["
                    +o.getClass().toString()+"] isn't a DOM Node");
            return false;
        }
        return true;
    }

    default boolean isItUsable(Object o)
    {
        return false;
    }
    /*static boolean isNumber(Object o)
    {
        try
        {

        }
        return false;
    }*/
}
