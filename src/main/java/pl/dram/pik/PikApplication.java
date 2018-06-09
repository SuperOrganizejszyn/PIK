package pl.dram.pik;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.dram.pik.entity.Task;
import pl.dram.pik.repository.TaskRepository;

import java.util.stream.Stream;

@SpringBootApplication
public class PikApplication {

	public static void main(String[] args) {
		SpringApplication.run(PikApplication.class, args);
	}

	@Bean
	ApplicationRunner init(TaskRepository repository){
		return args -> {
			Stream.of("Test-task-1", "Test-task-2", "Test-task-3").forEach(name -> {
				Task task = new Task();
				task.setName(name);
				repository.save(task);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
