package pl.konradTysper.TodoListMySQL1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class TodoListMySql1Application {

	public static void main(String[] args) {
		SpringApplication.run(TodoListMySql1Application.class, args);
	}

	@Bean
	public CommandLineRunner runApp(JdbcTemplate jdbcTemplate) {
		return (args -> {
			String sql = "SELECT id,tekst, important_scale FROM task";

			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
			for (var row:rows) {
				System.out.println(row.get("id"));
				System.out.println(row.get("tekst"));
				System.out.println("ważnoŚć: "+ row.get("important_scale"));
				System.out.println();
			}




		});

	}
}
