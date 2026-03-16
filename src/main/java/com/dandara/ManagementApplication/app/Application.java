package main.java.com.dandara.ManagementApplication.app;

import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.repository.ProjectRepository;
import main.java.com.dandara.ManagementApplication.service.ProjectService;
import main.java.com.dandara.ManagementApplication.service.TaskService;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ProjectRepository repository = new ProjectRepository();

        ProjectService projectService = new ProjectService(repository);
        TaskService taskService = new TaskService(repository);

        Task tarefa1 = new Task("mudar cor do fundo", Duration.ofSeconds(3),false);
        Task tarefa2 = new Task("separar elementos", Duration.ofMinutes(50),false);
        Task tarefa_teste = new Task("criar um novo layout", Duration.ofHours(1), true);
        Task tarefa_teste2 = new Task("separar os pngs", Duration.ofMinutes(20), false);
        Task tarefa_teste3 = new Task( "salvar o arquivo em pdf", Duration.ofSeconds(20), true);
        Task tarefa_teste4 = new Task( "participar do evento", Duration.ofDays(1), false);

        Scanner scanner = new Scanner(System.in);

        projectService.createProject("Portifolio X", "atualização do portifólio da empresa x", 1099.99, LocalDateTime.now());
        projectService.createProject("Site Manegement", "esse site aqui", 3000, LocalDateTime.now());
        projectService.listProjects();

        System.out.println("insira o id do projeto1: ");
        String proj = scanner.nextLine();
        System.out.println("id de outro projeto: ");
        String proj2 = scanner.nextLine();

        taskService.addTaskOnProject(proj,tarefa1);
        taskService.addTaskOnProject(proj,tarefa_teste2);
        taskService.addTaskOnProject(proj,tarefa_teste3);

        taskService.addTaskOnProject(proj2,tarefa2);
        taskService.addTaskOnProject(proj2,tarefa_teste4);
        taskService.addTaskOnProject(proj2,tarefa_teste);

        projectService.listProjects();

        projectService.listTaskOnProject(proj);
        projectService.listTaskOnProject(proj2);


    }
}
