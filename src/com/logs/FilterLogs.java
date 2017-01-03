package com.logs;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * PackageName com.logs
 * Created by mhafidi on 24/11/2016.
 */
public abstract class FilterLogs extends LogRecord implements Filter
{
    protected final static String LOG_INFO_TAG = "[LogInfo]";
    protected final static String LOG_ERROR_TAG = "[LogError]";
    protected final static String LOG_WARNING_TAG = "[LogWarning]";
    protected final static String LOG_TEST_FAILED_TAG = "[TEST FAILED]";
    protected final static String LOG_TEST_SUCCEEDED_TAG = "[TEST SUCCEEDED]";
    protected final static String GENERIC_ERROR_MSG = "An Unknown Error Occured";

    protected final static String defaultBundle = "LoggingLevelStrings";



    /**
     * Construct a LogRecord with the given level and message values.
     * <p>
     * The sequence property will be initialized with a new unique value.
     * These sequence values are allocated in increasing order within a VM.
     * <p>
     * The millis property will be initialized to the current time.
     * <p>
     * The thread ID property will be initialized with a unique ID for
     * the current thread.
     * <p>
     * All other properties will be initialized to "null".
     *
     * @param level a logging level value
     * @param msg   the raw non-localized logging message (may be null)
     */
    public FilterLogs(Level level, String msg)
    {
        super(level, msg);
    }
}
