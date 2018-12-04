package io.ueb.projectlist.model;

import java.util.ArrayList;
import java.util.List;

public class Checklist {

    private String name;

    private List<ListItem> ChecklistItems = new ArrayList<>();

    public List<ListItem> getChecklistItems() {
        return ChecklistItems;
    }

    public void setChecklistItems(List<ListItem> listItems) {
        this.ChecklistItems = listItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
