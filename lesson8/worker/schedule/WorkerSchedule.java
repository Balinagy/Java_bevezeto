package worker.schedule;
import java.util.*;
import java.io.*;

public class WorkerSchedule
{
    private HashMap<Integer, HashSet<String>> weekToWorkers;

    public WorkerSchedule()
    {
        weekToWorkers = new HashMap<Integer, HashSet<String>>();
    }

    public void add(int week, HashSet<String> workers)
    {
        if(weekToWorkers.containsKey(week)){
            weekToWorkers.put(week, new HashSet<String>());
        }
        weekToWorkers.get(week).addAll(workers);
    }

    public void add(HashSet<Integer> weeks, ArrayList<String> workers)
    {
        HashSet<String> working = new HashSet<String>();
        for(String s : workers)
        {
            working.add(s);
        }
    }

    public boolean isWorkingOnWeek(String worker, int week)
    {
        return weekToWorkers.containsKey(week) && weekToWorkers.get(week).contains(worker);
    }

    public HashSet<Integer> getWorkWeeks(String worker)
    {
        HashSet<Integer> workWeeks = new HashSet<Integer>();
        for(Map.Entry<Integer, HashSet<String>> entry : weekToWorkers.entrySet())
        {
            if(entry.getValue().contains(worker))
            {
                workWeeks.add(entry.getKey());
            }
        }
        return workWeeks;
    }
}