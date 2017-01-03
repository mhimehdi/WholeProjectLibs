package com.javaUtils;

import org.w3c.dom.*;

import java.util.*;
import java.util.stream.*;

/**
 * Created by mhafidi on 19/09/2016.
 */
public class ArraysUtil {

    static ArraysUtil instance=null;

    private ArraysUtil()
    {

    }
    static public ArraysUtil getInstance()
    {
        if(instance==null)
        {
            instance = new ArraysUtil();
        }
        return instance;
    }

    /*grouping  every element by the value of the quotient of the euclidean division of its index by the size of the
     sub-lists*/

    public  HashMap convertArrayListToSeveralEquiSizedLists(List aInList, Integer aInSize)
    {
        HashMap finalRetHashMap = null;

        if (aInList!=null && !aInList.isEmpty() && aInList.size()%(aInSize)==0)
        {

            finalRetHashMap = (HashMap) aInList.stream().collect(Collectors.groupingBy(t->aInList.indexOf(t)/aInSize));

        }


        return finalRetHashMap;
    }


    public ArrayList<Node> convertNodeListToNodeArrayList(NodeList aInNodeList)
    {
        ArrayList<Node> lNodeList = new ArrayList<>();
        if(aInNodeList!=null)
        {

            for (int i = 0; i < aInNodeList.getLength(); i++)
            {
                if (aInNodeList.item(i).getNodeType() == Node.ELEMENT_NODE)
                {
                    lNodeList.add(aInNodeList.item(i));
                }
            }
        }
        else
        {


        }

        return lNodeList;
    }

}
