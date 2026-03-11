package main.java.com.dandara.ManagementApplication.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Project {
    ArrayList<Task> tasks = new ArrayList<>();
    private int id;
    private int idClient;
    private double price;
    private String name;
    private String description;
    private ProjectStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime deadline;

    public Project(ArrayList<Task> tasks, int id, int idClient, double price, String name, String description, ProjectStatus status, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime deadline) {

        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("entrada inválida - campo obrigatório");
        }
        if(price<0){
            throw new IllegalArgumentException("Preço negativo - entrada inválida");
        }

        this.tasks = tasks;
        this.id = id;
        this.idClient = idClient;
        this.price = price;
        this.name = name;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deadline = deadline;
    }


}

