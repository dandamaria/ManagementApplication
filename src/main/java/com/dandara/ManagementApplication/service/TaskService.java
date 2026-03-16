package main.java.com.dandara.ManagementApplication.service;

import main.java.com.dandara.ManagementApplication.model.Project;
import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.repository.TaskRepository;

import java.time.Duration;
import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository = new TaskRepository();

    public void createTask(String name, Duration duration, Boolean complete){
        Task task = new Task(name, duration, complete);
        taskRepository.save(task);
    }

    public void deleteTask(Task task){
        taskRepository.delete(task);
    }

    public void changeStatusTask(){

    }

    public void showTasksList(){
        System.out.println("lista de tarefas:");
        for (Task task : taskRepository.getTasks()) {
            System.out.println(task.getName());
        }
    }

    public List<Task> getTasks() {
        return taskRepository.getTasks();
    }

    public void showPendingTasks(){
        System.out.println("lista de tarefas pendentes:");
        for(Task task: taskRepository.getTasks()){
            if(!task.getComplete()){
                System.out.println(task.getName());
            }
        }
    }



}
