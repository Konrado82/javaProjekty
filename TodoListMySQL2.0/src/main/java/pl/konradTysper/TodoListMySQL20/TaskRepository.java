package pl.konradTysper.TodoListMySQL20;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Integer> {
}
//integer- tym klucza gł
