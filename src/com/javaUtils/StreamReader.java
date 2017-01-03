package com.javaUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mhafidi on 17/06/2016.
 */
public class StreamReader
{
    protected File file;

    public StreamReader(String aInFullFilePath)
    {
        file = new File(aInFullFilePath);
    }
    public List convertFileToLineList() throws FileNotFoundException
    {
        List lList;
        String lLineToRead = null;
        if(file!=null && file.isFile())
        {
            FileReader lFileReader = new FileReader(file);
            BufferedReader lBufferedReader = new BufferedReader(lFileReader);
            lList = lBufferedReader.lines().collect(Collectors.toList());
        }
        else
            lList= new ArrayList<>();
        return lList;

    }
    public List convertStringToLineList(String aInString)
    {
        List<String> lList=null;

        return lList;
    }
    //will be used for files with small size
    public  String  readFromFile(String aInFileName) throws IOException
    {
        String content = null;
        File file = new File(aInFileName);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader !=null){reader.close();}
        }
        return content;
    }

}
