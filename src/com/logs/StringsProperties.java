package com.logs;

/**
 * PackageName com.logs
 * Created by mhafidi on 23/11/2016.
 */
public enum StringsProperties
{
    MSG_OBJECT_NATURE_IS_NOT_APPROPRIATE("The Object Nature is Not Appropriate"),
    MSG_NULL_PARAMETER("Null Parameter"),
    MSG_NO_XML_FILE_INITIALIZED("No Xml File was Initialized"),
    DATE_FORMAT_YYYY_DD_HH_MM_SS_MS_NS("DATE_FORMAT_YYYY_DD_HH_MM_SS_MS_NS");

    private String name;

    StringsProperties(String aInName)
    {
        name=aInName;
    }
    @Override
    public String toString()
    {
        return name;
    }

}
