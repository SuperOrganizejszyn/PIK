package pl.dram.pik.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.dram.pik.entity.Task;
import pl.dram.pik.repository.TaskRepository;
import pl.dram.pik.service.TaskService;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    @CrossOrigin(origins = "http://localhost:4200")
    public Iterable<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<Task> getTask(@PathVariable String id){
        return taskService.getTask(id);
    }
}
