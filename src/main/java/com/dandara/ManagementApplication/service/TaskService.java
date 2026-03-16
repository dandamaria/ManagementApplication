package main.java.com.dandara.ManagementApplication.service;

import main.java.com.dandara.ManagementApplication.model.Project;
import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.repository.ProjectRepository;
import main.java.com.dandara.ManagementApplication.repository.TaskRepository;

import java.time.Duration;
import java.util.List;

public class TaskService {

    private ProjectRepository repository;

    public TaskService(ProjectRepository repository) {
        this.repository = repository;
    }

    public void addTaskOnProject(String id, Task task) {
        Project project = repository.findById(id);

        if (project == null) {
            throw new RuntimeException("Projeto não encontrado");
        }

        project.addTask(task);

    }
    public void markTaskAsComplete(Task task){
        task.markAsCompleted();
    }

}
