package com.javaUtils.time;

/**
 * PackageName com.javaUtils.time
 * Created by mhafidi on 21/12/2016.
 */
public interface TimerUtil
{

    public default Long getCurrentTimeInMilliseconds()
    {
        return System.currentTimeMillis();
    }
    public default Long getCurrenTimeInNanoSeconds()
    {
        return System.nanoTime();
    }
    //public default String ConvertTimeToReadableFormat()
}
