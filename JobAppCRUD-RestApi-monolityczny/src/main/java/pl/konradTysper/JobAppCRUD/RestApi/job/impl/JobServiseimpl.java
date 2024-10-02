package pl.konradTysper.JobAppCRUD.RestApi.job.impl;

import org.springframework.stereotype.Service;
import pl.konradTysper.JobAppCRUD.RestApi.job.Job;
import pl.konradTysper.JobAppCRUD.RestApi.job.JobRepository;
import pl.konradTysper.JobAppCRUD.RestApi.job.JobService;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiseimpl implements JobService {

    //private List<Job>jobs=new ArrayList<>();
    JobRepository jobRepository;


    public JobServiseimpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job getJobById(Long id) {
       return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
       try {
           jobRepository.deleteById(id);
           return true;
       }catch (Exception e){
           return false;
       }
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRepository.findById(id);

            if (jobOptional.isPresent()){
                Job job= jobOptional.get();
                job.setDescription(updatedJob.getDescription());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setLocation(updatedJob.getLocation());
                jobRepository.save(job);
                return true;
            }
            return false;
    }
}
