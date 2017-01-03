package com.javaUtils.parser;

import com.javaUtils.ArraysUtil;
import com.javaUtils.ObjectNature;
import com.logs.LogService;
import com.logs.StringsProperties;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Created by mhafidi on 29/08/2016.
 */
public class XmlDomParser implements ObjectNature
{

    private LogService logger = LogService.getInstance();
    final private String CLASS_NAME= this.getClass().getName().toString();
    protected final String xmlFilePath;
    protected Document document;


    public XmlDomParser(String xmlFilePath)
    {

        this.xmlFilePath = xmlFilePath;
        File fXmlFile = new File(xmlFilePath);
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try
        {


            final DocumentBuilder builder = factory.newDocumentBuilder();
            try
            {
                try
                {
                    document = (org.w3c.dom.Document) builder.parse(fXmlFile);
                }
                catch (SAXException e)
                {
                    logger.logError(this.getClass().toString(), e.getMessage());

                }
                catch (IOException iOe)
                {
                    logger.logError(this.getClass().toString(),iOe.getMessage());
                }
            }
            catch (DOMException ex)
            {
                throw ex;
            }
        } catch (final ParserConfigurationException e)
        {

            e.printStackTrace();

        }

    }

    public String getXmlFilePath()
    {
        return xmlFilePath;
    }

    public Document getDocument()
    {
        return document;
    }

    public void setDocument(Document document)
    {
        this.document = document;
    }


    public ArrayList<Node> getElementsByTagName(String aInTagName)
    {
        ArrayList<Node> lListRet = new ArrayList<>();
        if(document==null)
        {
            logger.logWarning(CLASS_NAME, StringsProperties.MSG_NO_XML_FILE_INITIALIZED.toString());
        }
        else if(aInTagName==null)
        {
            logger.logError(CLASS_NAME,StringsProperties.MSG_NULL_PARAMETER.toString());
        }
        else
        {

          lListRet =  ArraysUtil.getInstance().convertNodeListToNodeArrayList
                    (document.getElementsByTagName(aInTagName));
        }
        return lListRet;

    }

    @Override
    public boolean isItUsable(Object o)
    {
        try
        {
            XmlDomParser testNature= (XmlDomParser) o;
        }
        catch (Exception ex)
        {
            logger.logWarning(CLASS_NAME,
                    StringsProperties.MSG_OBJECT_NATURE_IS_NOT_APPROPRIATE.toString());
            return false;

        }
        return true;
    }
}
