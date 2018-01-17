package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    @GetMapping("/timeentry")
    public String timeentry() {
        return "hello";
    }

    public ResponseEntity create(TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(long l) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity update(long l, TimeEntry expected) {
        return null;
    }

    public ResponseEntity<TimeEntry> delete(long l) {
        return null;
    }
}
