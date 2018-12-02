package io.ueb.projectlist.model;

import java.util.ArrayList;
import java.util.List;

public class Checklist {

    private String name;

    private List<ChecklistItem> ChecklistItems = new ArrayList<>();

    public List<ChecklistItem> getChecklistItems() {
        return ChecklistItems;
    }

    public void setChecklistItems(List<ChecklistItem> ChecklistItems) {
        this.ChecklistItems = ChecklistItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
