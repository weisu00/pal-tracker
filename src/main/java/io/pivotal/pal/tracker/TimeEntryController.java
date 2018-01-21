package io.pivotal.pal.tracker;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time-entries")
public class TimeEntryController {
    private TimeEntryRepository timeEntryRepository;
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }


    public String timeentry() {
        return "hello";
    }

    @PostMapping
    public ResponseEntity<TimeEntry> create(@RequestBody TimeEntry timeEntry) {
        System.out.println("create");
        TimeEntry temp = timeEntryRepository.create(timeEntry);
        System.out.println(temp.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(temp);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TimeEntry> read(@PathVariable("id") long l) {
        TimeEntry entry = timeEntryRepository.find(l);
        if(entry ==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(entry);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(entry);
        }
    }
    @GetMapping()
    public ResponseEntity<List<TimeEntry>> list() {
        return ResponseEntity.status(HttpStatus.OK).body(timeEntryRepository.list());
    }
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") long l, @RequestBody TimeEntry expected) {
        return ResponseEntity.status(HttpStatus.OK).body(timeEntryRepository.update(l, expected));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<TimeEntry> delete(@PathVariable("id") long l) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(timeEntryRepository.delete(l));
    }
}
