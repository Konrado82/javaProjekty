package pl.KonradTysper.spring_web_jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer>{
}
