package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long l, int i, int i1, LocalDate parse, int i2) {
    }
    public void setEntry(TimeEntry timeEntry) {
        id = timeEntry.id;
        projectId = timeEntry.projectId;
        userId = timeEntry.userId;
        date = timeEntry.date;
        hours = timeEntry.hours;
    }
    public TimeEntry(int i, int i1, LocalDate parse, int i2) {
        id = i;
        projectId = i1;
        date = parse;
        hours = i2;
    }

    public TimeEntry() {

    }
    public void setId(long id){
        this.id = id;
    }
    public long getId() {
        return 1L;
    }
}
