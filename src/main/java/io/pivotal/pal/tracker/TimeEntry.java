package io.pivotal.pal.tracker;

import java.time.LocalDate;

public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long id, long projectId, int userId, LocalDate parse, int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }
    public void setEntry(TimeEntry timeEntry) {
        id = timeEntry.id;
        projectId = timeEntry.projectId;
        userId = timeEntry.userId;
        date = timeEntry.date;
        hours = timeEntry.hours;
    }
    public TimeEntry(long projectId, int userId, LocalDate parse, int hours) {
        this.userId = userId;
        this.projectId = projectId;
        this.date = parse;
        this.hours = hours;
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
