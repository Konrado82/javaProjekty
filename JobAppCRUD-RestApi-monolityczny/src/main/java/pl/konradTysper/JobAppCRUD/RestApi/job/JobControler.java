package pl.konradTysper.JobAppCRUD.RestApi.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class JobControler {


    private JobService jobService;

    public JobControler(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity <List<Job>> findAll() {
        return ResponseEntity.ok(jobService.findAll()) ;
    }

    @PostMapping("/jobs")
    public ResponseEntity <String> createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return new ResponseEntity<>("New job added to list", HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity <Job>getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if (job != null)
            return new ResponseEntity<>(HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deletejob(@PathVariable Long id){
        boolean deleted = jobService.deleteJobById(id);
        if (deleted)
            return new ResponseEntity<>("job deleted succesfully", HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @PutMapping ("/jobs/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id,@RequestBody Job updatedJob){
     boolean updated =   jobService.updateJob(id, updatedJob);
     if (updated)
         return new ResponseEntity<>("Job updated succesfully", HttpStatus.OK);
     return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
