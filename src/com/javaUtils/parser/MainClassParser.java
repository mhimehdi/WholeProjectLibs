package com.javaUtils.parser;

import com.javaUtils.ObjectNature;
import com.javaUtils.Paire;
import com.logs.LogService;
import com.logs.StringsProperties;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * PackageName com.parser
 * Created by mhafidi on 20/10/2016.
 */
public class MainClassParser
{




    public static void main(String[] args) throws ParserConfigurationException
    {


        String xMLFileParh = "C:\\Users\\mhafidi\\Documents\\Projects\\WholeProjectLibs\\src\\com\\javaUtils\\parser\\filetest.xml";
        XmlDomParser lDomXmlParse = new XmlDomParser(xMLFileParh);
       /* System.out.println(lDomXmlParse.getElementsByTagName("param.defs").stream()
                .count());
        System.out.println(lDomXmlParse.getElementsByTagName("testSuite").stream()
                .count());
        System.out.println(lDomXmlParse.getElementsByTagName("test").stream()
                .count());*/

       /* uFunction<List,Paires> F= l -> {

        }

        list.stream().collect()*/


    }


}
