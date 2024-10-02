package pl.konradTysper.TodoListMySQL20;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner runApp(TaskRepository taskRepository){

		return (args -> {
			taskRepository.findAll().forEach(task->{
				System.out.println(task.getId());
				System.out.println(task.getTekst());
				System.out.println(task.getImportant_scale());
					}
			);


		});
	}


}
