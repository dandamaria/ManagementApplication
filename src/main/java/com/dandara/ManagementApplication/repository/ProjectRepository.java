package main.java.com.dandara.ManagementApplication.repository;

import main.java.com.dandara.ManagementApplication.model.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {
    List<Project> projects = new ArrayList<>();

    public void save(Project project){
        projects.add(project);
    }
    public void delete(Project project){
        projects.remove(project);
    }
    public void findById(){

    }
    public void findAll(){

    }

}
