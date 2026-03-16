package main.java.com.dandara.ManagementApplication.model;

import main.java.com.dandara.ManagementApplication.repository.TaskRepository;

import java.time.Duration;
import java.util.UUID;

public class Task {

    private final String id;
    private String name;
    private Duration duration;
    private Boolean complete;

    public Task(String name, Duration duration, Boolean complete) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.duration = duration;
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", complete=" + complete +
                '}';
    }

    public void markAsCompleted(){
        setComplete(true);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
