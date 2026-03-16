package main.java.com.dandara.ManagementApplication.service;

import main.java.com.dandara.ManagementApplication.model.Project;

import main.java.com.dandara.ManagementApplication.repository.ProjectRepository;

import java.time.LocalDateTime;


public class ProjectService {

    private ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public void createProject(String name, String description, double price, LocalDateTime startDate) {
        Project project = new Project(name, description, price, startDate);
        repository.save(project);
    }
    public Project getProject(String id){
        return repository.findById(id);
    }
    public void listProjects() {
        for (Project p : repository.findAll()) {
            System.out.println("-------Project id and name------");
            System.out.println(p.getId());
            System.out.println(p.getName());
        }
    }
    public void deleteProject(String id){
        repository.delete(id);
    }
    public void listTaskOnProject(String idProject) {
        Project p = repository.findById(idProject);
        System.out.println("-----Tasks----");
        p.listTasks();
    }

    /*public void editProject(){
        System.out.println("Qual campo você gostaria de editar?");
        System.out.println("1-nome, 2-preço, 3-descrição, 4-status, 5-data do início, 6-data do término, 7-prazo de entrega, 8-cliente associado");
        // falta arrumar essa lógica
    }*/

}
