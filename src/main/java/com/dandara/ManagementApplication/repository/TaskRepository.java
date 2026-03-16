package main.java.com.dandara.ManagementApplication.repository;

import main.java.com.dandara.ManagementApplication.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    List<Task> tasks = new ArrayList<>();

    public void save(Task task) {
        tasks.add(task);
    }
    public void delete(Task task) {
        tasks.remove(task);
    }
    public List<Task> getTasks() {
        return tasks;
    }

    public Task findById(String idTask){
        for (Task t : tasks){
            if (t.getId().equals(idTask)){
                return t;
            }
        }
        return null;
    }
}
