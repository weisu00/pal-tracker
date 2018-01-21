package io.pivotal.pal.tracker;

import java.util.*;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    long id = 100;
    List<TimeEntry> list = new ArrayList();
    public TimeEntry create(TimeEntry timeEntry) {
        if(timeEntry.getId()==0){
            timeEntry.setId(id++);
        }
        list.add(timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        for(TimeEntry e: list){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }

    public List<TimeEntry> list() {
        return list;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        for(TimeEntry e: list){
            if(e.getId() == id){
                e.setEntry(timeEntry);
            }
        }
        return timeEntry;
    }

    public TimeEntry delete(long id) {
        TimeEntry entry = null;
        Iterator<TimeEntry> i = list.iterator();
        while(i.hasNext()){
            entry = i.next();
            if(entry.getId() == id){
                i.remove();
            } else {
                entry = null;
            }
        }
        return entry;
    }
}
