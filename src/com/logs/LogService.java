package com.logs;

import com.javaUtils.time.DateUtil;
import com.sun.xml.internal.stream.buffer.stax.StreamWriterBufferCreator;
import org.jetbrains.annotations.Contract;

import javax.xml.stream.XMLStreamException;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * PackageName com.logs
 * Created by mhafidi on 04/10/2016.
 */
public class LogService extends FilterLogs
{
    private static LogService instance = null;


    private LogService()
    {
        super(Level.ALL,"");

    }

    static public LogService getInstance()
    {
        if (instance == null)
        {
            instance = new LogService();
        }
        return instance;
    }

    //FormatLog
    @Contract(pure = true)
    private String FormatLog(String aInTag, String aInLocalCode, String aInLogDetails, String aInDate)
    {
        String message = "";
        if (aInLocalCode == null || aInLogDetails == null)
        {
            message = (aInLocalCode == null) ? "" : (aInLocalCode + ":");
            message += (aInLogDetails == null) ? GENERIC_ERROR_MSG : aInLogDetails;
        } else
        {
            message = aInTag + "[" + aInDate + "]:" + aInLocalCode + ":" + aInLogDetails;
        }


        return message;

    }

    public void logError(String aInLocalCode, String aInLogDetails)
    {

        System.out.println(FormatLog(LOG_ERROR_TAG,aInLocalCode, aInLogDetails, DateUtil.getStartDate()));
    }

    public void logInfo(String aInLocalCode, String aInLogDetails)
    {
        System.out.println(FormatLog(LOG_INFO_TAG,aInLocalCode, aInLogDetails, DateUtil.getStartDate()));
    }
    public void logWarning(String aInLocalCode, String aInLogDetails)
    {
        System.out.println(FormatLog(LOG_WARNING_TAG,aInLocalCode, aInLogDetails, DateUtil.getStartDate()));
    }
    public void logTestFailed(String aInLocalCode, String aInLogDetails)
    {
        System.out.println(FormatLog(LOG_TEST_FAILED_TAG,aInLocalCode, aInLogDetails, DateUtil.getStartDate()));
    }

    public void logTestSucceeded(String aInLocalCode, String aInLogDetails)
    {
        System.out.printf(FormatLog(LOG_TEST_SUCCEEDED_TAG,aInLocalCode, aInLogDetails, DateUtil.getStartDate()));
    }
    public void logError(String aInErrorToLog, StreamWriterBufferCreator aInStreamWriterBufferCreator)
            throws Exception
    {
        String message = LOG_ERROR_TAG + "[" + DateUtil.getStartDate() + "]:" + aInErrorToLog + "\n";
        if (aInStreamWriterBufferCreator == null)
        {
            System.out.printf(message);
        } else
        {
            try
            {
                aInStreamWriterBufferCreator.writeCData(message);
            } catch (XMLStreamException e)
            {
                e.printStackTrace();
            }
        }
    }


    //LogInfo
    public void logInfo(String aInInfoToLog)
    {
        String message = LOG_INFO_TAG + "[" + DateUtil.getStartDate() + "]:" + aInInfoToLog + "\n";
        System.out.printf(message);
    }

    public void logInfo(String aInInfoToLog, StreamWriterBufferCreator aInStreamWriterBufferCreator)
    {
        String message = LOG_INFO_TAG + "[" + DateUtil.getStartDate() + "]:" + aInInfoToLog + "\n";

        if (aInStreamWriterBufferCreator == null)
        {
            System.out.printf(message);
        } else
        {
            try
            {
                aInStreamWriterBufferCreator.writeCData(message);
            } catch (XMLStreamException e)
            {
                e.printStackTrace();
            }
        }
    }


    //LogWarnning
    public void logWarning(String aInWarningToLog)
    {
        String message = LOG_WARNING_TAG + "[" + DateUtil.getStartDate() + "]:" + aInWarningToLog + "\n";
        System.out.printf(message);
    }

    public void setLogWarning(String aInWarningToLog, StreamWriterBufferCreator aInStreamWriterBufferCreator)
    {
        String message = LOG_WARNING_TAG + "[" + DateUtil.getStartDate() + "]:" + aInWarningToLog + "\n";

        if (aInStreamWriterBufferCreator == null)
        {
            System.out.printf(message);
        } else
        {
            try
            {
                aInStreamWriterBufferCreator.writeCData(message);
            } catch (XMLStreamException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isLoggable(LogRecord record)
    {

        return false;
    }
}
