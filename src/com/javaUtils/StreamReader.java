package com.javaUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
        List lList = new ArrayList<String>();
        String lLineToRead = null;
        if(file!=null && file.isFile())
        {
            FileReader lFileReader = new FileReader(file);
            BufferedReader lBufferedReader = new BufferedReader(lFileReader);
            try {
                while((lLineToRead=lBufferedReader.readLine())!=null)
                {
                    lList.add(lLineToRead);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return lList;

    }
    public List convertStringToLineList(String aInString)
    {
        List<String> lList=null;

        return lList;
    }
    public  String  readFromFile( String aInFileName) throws IOException
    {
        String content = null;
        File file = new File(aInFileName); //for ex foo.txt
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
