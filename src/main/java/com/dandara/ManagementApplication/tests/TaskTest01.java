package main.java.com.dandara.ManagementApplication.tests;

import main.java.com.dandara.ManagementApplication.model.Task;
import main.java.com.dandara.ManagementApplication.service.TaskService;

import java.time.Duration;

public class TaskTest01 {
    public static void main(String[] args) {
        Task tarefa_teste = new Task("criar um novo layout", Duration.ofHours(1), false);
        Task tarefa_teste2 = new Task("separar os pngs", Duration.ofMinutes(20), false);
        Task tarefa_teste3 = new Task( "salvar o arquivo em pdf", Duration.ofSeconds(20), true);
        Task tarefa_teste4 = new Task( "participar do evento", Duration.ofDays(1), false);
        TaskService taskService = new TaskService();

        /*System.out.println("-----lista 1--------");
        taskService.addTask(tarefa_teste);
        taskService.addTask(tarefa_teste2);
        taskService.showTasksList();
        System.out.println("-------------");
        taskService.deleteTask(tarefa_teste2);
        taskService.showTasksList();*/

        /*System.out.println("------lista 2-------");
        taskService.addTask(tarefa_teste);
        taskService.addTask(tarefa_teste2);
        taskService.addTask(tarefa_teste3);
        taskService.addTask(tarefa_teste4);

        taskService.showTasksList();
        taskService.showPendingTasks();*/


    }
}
