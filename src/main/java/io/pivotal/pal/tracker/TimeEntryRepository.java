package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry timeEntry);

    public TimeEntry find(Object id) ;

    public List<TimeEntry> list() ;

    public TimeEntry update(Object id, TimeEntry timeEntry) ;

    public void delete(Object id) ;
}
