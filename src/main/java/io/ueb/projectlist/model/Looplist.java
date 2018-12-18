package io.ueb.projectlist.model;

import java.util.ArrayList;
import java.util.List;

public class LoopList {
    private String name;

    private List<ListItem> ChecklistItems = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ListItem> getChecklistItems() {
        return ChecklistItems;
    }

    public void setChecklistItems(List<ListItem> checklistItems) {
        ChecklistItems = checklistItems;
    }
}
