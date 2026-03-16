package main.java.com.dandara.ManagementApplication.repository;

import main.java.com.dandara.ManagementApplication.model.Project;
import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.service.TaskService;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {
    List<Project> projects = new ArrayList<>();

    public void save(Project project){
        projects.add(project);
    }
    public Project findById(String id){
        for(Project p : projects){
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    public List<Project> findAll(){
        return projects;
    }
    public void delete(String id){
        projects.remove(findById(id));
    }

}
