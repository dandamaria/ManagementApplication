package main.java.com.dandara.ManagementApplication.service;

import main.java.com.dandara.ManagementApplication.model.Project;
import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.repository.ProjectRepository;
import main.java.com.dandara.ManagementApplication.repository.TaskRepository;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    private final ProjectRepository projectRepository = new ProjectRepository();
    TaskService taskService = new TaskService();

    public void createProject(String name, String description, double price, LocalDateTime startDate) {
        Project project = new Project(name, description, price, startDate);
        projectRepository.save(project);
    }

    public void deleteProjectOnList(String id) {
        projectRepository.delete(projectRepository.findById(id));
    }

    /*public void editProject(){
        System.out.println("Qual campo você gostaria de editar?");
        System.out.println("1-nome, 2-preço, 3-descrição, 4-status, 5-data do início, 6-data do término, 7-prazo de entrega, 8-cliente associado");
        // falta arrumar essa lógica
    }*/

    public void showAllProjects() {
        for (Project p : projectRepository.findAll()) {
            System.out.println("------Project------");
            System.out.println(p.getId());
            System.out.println(p.getName());
        }
    }

    public void showAllProjectsAndTask() {
        for (Project p : projectRepository.findAll()) {
            System.out.println("------Project------");
            System.out.println(p.getId());
            System.out.println(p.getName());
            taskList(p.getId());
        }
    }

    public void taskList(String idProject) {
        Project p = projectRepository.findById(idProject);
        System.out.println("-----Tasks----");
        taskService.showTasksList();
    }

    public void informationProjectById(String id) {
        Project p = projectRepository.findById(id);
        System.out.println(p);
        System.out.println("----Tasks----");
        taskService.showTasksList();
    }

    public void addTaskOnProject(String idProject, Task task){
        Project p = projectRepository.findById(idProject);
        taskService.createTask(task.getName(),task.getDuration(),task.getComplete());
        p.setTasks(taskService.getTasks());
    }

}
