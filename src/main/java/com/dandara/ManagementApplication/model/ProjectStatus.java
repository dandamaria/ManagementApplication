package main.java.com.dandara.ManagementApplication.model;

public enum ProjectStatus {
    COMPLETE("Tarefa completa"),
    INCOMPLETE("Tarefa incompleta");

    public final String status;

    ProjectStatus(String status) {
        this.status = status;
    }
}
