package main.java.com.dandara.ManagementApplication.model;

import java.time.Duration;

public class Task {
    private int id;
    private String name;
    private Duration duration;
    private Boolean complete;

    public Task(int id, String name, Duration duration, Boolean complete) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.complete = complete;
    }

    public int getId() {
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
