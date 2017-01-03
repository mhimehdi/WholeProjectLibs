package com.maths.geometry;

import com.javaUtils.ObjectNature;
import com.logs.LogService;

import java.util.Vector;
import java.util.stream.Collectors;

/**
 * PackageName com.maths.geometry
 * Created by mhafidi on 09/10/2016.
 */
public class VectorProp
{
    static private VectorProp instance= null;
    LogService logger = LogService.getInstance();

    private VectorProp()
    {

    }
    static public VectorProp getInstance()
    {
        if(instance==null)
        {
            instance = new VectorProp();
        }
        return instance;
    }

     public Double computeModule(Vector aInVector) throws Exception
    {
        Double ret = 0.0;

        if(aInVector==null || aInVector.isEmpty())
        {
            logger.logError(this.getClass().toString()+".computeModule","The given parameter refers to a" +
                    " Null Pointer");
            throw new Exception("The given parameter refers to a Null Pointer");

        }
        else
        {
            logger.logInfo(this.getClass().toString(),"Start computing the module the vector sized:["+aInVector.size()+"]");
            ret= (Double) aInVector.stream().filter(ObjectNature::isDouble).
                 collect(Collectors.summingDouble(l->Double.valueOf((Double) Math.pow((Double) l,2))));
            ret = ret/aInVector.size();
            ret=Math.sqrt(ret);

        }
        return ret;
    }

}
