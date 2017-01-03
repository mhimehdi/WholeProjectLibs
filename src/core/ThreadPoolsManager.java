package core;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * PackageName core
 * Created by mhafidi on 06/12/2016.
 */
public class ThreadPoolsManager
{
    //we associate each threadPoolExecutor to a core

    private final int NBR_CORES = 4;
    private ArrayList<ThreadPoolExecutor> threadPoolExecutors;




    private static ThreadPoolsManager ourInstance = new ThreadPoolsManager();

    public static ThreadPoolsManager getInstance()
    {
        return ourInstance;
    }

    private ThreadPoolsManager()
    {
        threadPoolExecutors.ensureCapacity(NBR_CORES);
    }
}
