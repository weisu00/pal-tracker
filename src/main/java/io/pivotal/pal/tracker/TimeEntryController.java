package io.pivotal.pal.tracker;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {
    private TimeEntryRepository timeEntryRepository;
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    @GetMapping("/timeentry")
    public String timeentry() {
        return "hello";
    }

    public ResponseEntity<TimeEntry> create(TimeEntry timeEntry) {

        return ResponseEntity.accepted().body(timeEntryRepository.create(timeEntry));
    }

    public ResponseEntity<TimeEntry> read(long l) {
        return ResponseEntity.accepted().body(timeEntryRepository.find(l));
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return ResponseEntity.accepted().body(timeEntryRepository.list());
    }

    public ResponseEntity update(long l, TimeEntry expected) {
        return ResponseEntity.accepted().body(timeEntryRepository.update(l, expected));
    }

    public ResponseEntity<TimeEntry> delete(long l) {
        return ResponseEntity.accepted().body(timeEntryRepository.delete(l));
    }
}
