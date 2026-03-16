package main.java.com.dandara.ManagementApplication.tests;

import main.java.com.dandara.ManagementApplication.model.Project;
import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.service.ProjectService;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class ProjectTest {
    public static void main(String[] args) {
        ProjectService projectService = new ProjectService();
        Task tarefa1 = new Task("mudar cor do fundo", Duration.ofSeconds(3),false);
        Task tarefa2 = new Task("separar elementos", Duration.ofMinutes(50),false);
        Scanner scanner = new Scanner(System.in);

        projectService.createProject("Portifolio X", "atualização do portifólio da empresa x", 1099.99, LocalDateTime.now());
        projectService.createProject("Site Manegement", "esse site aqui", 3000, LocalDateTime.now());
        projectService.showAllProjects();

        System.out.println("insira o id do projeto1: ");
        String proj = scanner.nextLine();
        System.out.println("id de outro projeto: ");
        String proj2 = scanner.nextLine();


        projectService.addTaskOnProject(proj,tarefa1);
        projectService.addTaskOnProject(proj, tarefa2);
        projectService.addTaskOnProject(proj2, tarefa1);
        projectService.showAllProjectsAndTask();


    }
}
