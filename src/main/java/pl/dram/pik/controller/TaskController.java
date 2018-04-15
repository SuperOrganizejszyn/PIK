package pl.dram.pik.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dram.pik.entity.Task;
import pl.dram.pik.repository.TaskRepository;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class TaskController {
    private TaskRepository taskRepository;
    public TaskController(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @GetMapping("/tasks/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Task> tasks(){
        return taskRepository.findAll().stream().collect(Collectors.toList());
    }
}
