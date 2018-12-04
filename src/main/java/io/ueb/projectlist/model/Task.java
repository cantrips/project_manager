package io.ueb.projectlist.model;

import java.util.List;

public class Task {
    private String name;
    private TaskStatus status;
    private List<String> tradeoffs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public List<String> getTradeoffs() {
        return tradeoffs;
    }

    public void setTradeoffs(List<String> tradeoffs) {
        this.tradeoffs = tradeoffs;
    }
}
