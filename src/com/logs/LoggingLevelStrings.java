package com.logs;

import java.util.ListResourceBundle;

/**
 * PackageName com.logs
 * Created by mhafidi on 07/12/2016.
 */
public class LoggingLevelStrings extends ListResourceBundle
{
    public LoggingLevelStrings() {
    }

    protected final Object[][] getContents() {
        return new Object[][]{{"ALL", "All"}, {"CONFIG", "Config"}, {"FINE", "Fine"}, {"FINER", "Finer"}, {"FINEST", "Finest"}, {"INFO", "Info"}, {"OFF", "Off"}, {"SEVERE", "Severe"}, {"WARNING", "Warning"}};
    }
}
