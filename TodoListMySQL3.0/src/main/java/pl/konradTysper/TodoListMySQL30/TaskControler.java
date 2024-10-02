package pl.konradTysper.TodoListMySQL30;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class TaskControler {

    private final TaskRepository taskRepository;

    public TaskControler(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @GetMapping("todo")

    public ResponseEntity <Iterable<Task>>getAllTasks(){
        Iterable<Task> all = taskRepository.findAll();

        return ResponseEntity.ok(all);


    }

    @PostMapping("todo")
    public ResponseEntity<Task>addTask(@RequestBody Task task){
        Task saved = taskRepository.save(task);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saved.getId())
                .toUri();


        return ResponseEntity.created(location).body(saved);
    }
    @PutMapping("todo/{id}")
    public ResponseEntity<Task>update(@PathVariable Integer id, @RequestBody Task task){

        return taskRepository.findById(id)
                .map(e->{
                    e.setTekst(task.getTekst());
                    e.setImportant_scale(task.getImportant_scale());

                    return taskRepository.save(e);
                })
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());

    }
    @DeleteMapping("todo/{id}")

    public ResponseEntity<Void>delete(@PathVariable Integer id){
        if (!taskRepository.existsById(id)){
        return ResponseEntity.notFound().build();
        }

        taskRepository.deleteById(id);

        return ResponseEntity.noContent().build();


    }









}
