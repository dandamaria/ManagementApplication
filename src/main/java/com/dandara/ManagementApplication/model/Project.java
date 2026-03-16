package main.java.com.dandara.ManagementApplication.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Project {
    List<Task> tasks = new ArrayList<>();
    private final String id;
    private int idClient;
    private double price;
    private String name;
    private String description;
    private ProjectStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime deadline;

    @Override
    public String toString() {
        return "Project{" +
                "tasks=" + tasks +
                ", id='" + id + '\'' +
                ", idClient=" + idClient +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", deadline=" + deadline +
                '}';
    }

    public Project(String name, String description, double price, LocalDateTime startDate) {

        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("entrada inválida - campo obrigatório");
        }
        if(price<0){
            throw new IllegalArgumentException("Preço negativo - entrada inválida");
        }

        this.name = name;
        this.description = description;
        this.price = price;
        this.startDate = startDate;
        //status do projeto começa como imcompleto
        this.status = ProjectStatus.INCOMPLETE;
        //gerando id aleatório
        this.id = UUID.randomUUID().toString();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void listTasks(){
        for (Task t : tasks){
            System.out.println(t.getName());
        }
    }

    public String getId() {
        return id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}

