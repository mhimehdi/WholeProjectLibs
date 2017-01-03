package com.maths.geometry;

import com.logs.LogService;

import java.util.Vector;

/**
 * PackageName com.maths.geometry
 * Created by mhafidi on 12/10/2016.
 */
public class GeometryMainClass
{
    static LogService logger = LogService.getInstance();

    public static void main(String args[])
    {
        testVectorPropComputeModule();

    }
    static void testVectorPropComputeModule()
    {
        logger.logInfo(GeometryMainClass.class.toString(),"Start Test VectorPropComputeModule ");

        Vector<Double> list= new Vector<>();
        list.add(1.0);list.add(2.0);list.add(3.0);
        final Double[] result = {0.0};

        Double expectedResult=0.0;
        Double testerCompute= 0.0;
        try
        {
            list.stream().forEach(t -> {
                result[0] = result[0] + t * t;
            });
            testerCompute= Math.sqrt(result[0] / list.size());

        }
        catch(Exception e)
        {
            throw e;
        }


    }

}
