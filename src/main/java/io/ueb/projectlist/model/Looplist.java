package io.ueb.projectlist.model;

import java.util.ArrayList;
import java.util.List;

public class Looplist {
    private String name;

    private List<ListItem> listItems = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ListItem> getLooplistItems() {
        return listItems;
    }

    public void setChecklistItems(List<ListItem> looplistItems) {
        listItems = looplistItems;
    }
}
