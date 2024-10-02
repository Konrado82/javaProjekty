package pl.konradTysper.TodoListMySQL30;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Integer> {
}
