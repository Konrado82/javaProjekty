package pl.konradTysper.JobAppCRUD.RestApi.job;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.konradTysper.JobAppCRUD.RestApi.job.Job;

public interface JobRepository extends JpaRepository <Job, Long> {
}
