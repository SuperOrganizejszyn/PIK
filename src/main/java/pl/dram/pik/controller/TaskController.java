package pl.dram.pik.controller;

import org.springframework.web.bind.annotation.*;
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
    public Optional<Task> getTask(@PathVariable Long id){
        return taskService.getTask(id);
    }

    @PostMapping("/tasks")
    @CrossOrigin(origins = "http://localhost:4200")
    public void addTask(@RequestBody Task task, @PathVariable String id){
        taskService.addTask(task);
    }

    @PutMapping("/tasks/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void updateTask(@RequestBody Task task, @PathVariable String id){
        taskService.updateTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
