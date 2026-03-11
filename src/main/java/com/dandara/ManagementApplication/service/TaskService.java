package main.java.com.dandara.ManagementApplication.service;

import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.repository.TaskRepository;

public class TaskService {

    TaskRepository taskRepository = new TaskRepository();

    public void addTask(Task task){
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

    public void showPendingTasks(){
        System.out.println("lista de tarefas pendentes:");
        for(Task task: taskRepository.getTasks()){
            if(!task.getComplete()){
                System.out.println(task.getName());
            }
        }
    }

}
