package com.javaUtils;

import java.io.File;

/**
 * PackageName com.javaUtils
 * Created by mhafidi on 04/10/2016.
 */
public class StreamWriter
{
    protected File file;

    public StreamWriter(String aInFullFilePath)
    {
        file = new File(aInFullFilePath);
    }
}
