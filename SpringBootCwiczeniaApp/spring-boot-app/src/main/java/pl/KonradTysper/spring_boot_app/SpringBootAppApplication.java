package pl.KonradTysper.spring_boot_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

	@Autowired
	private Userservice userservice;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userservice.registerUser("Kamil");
	}
}
