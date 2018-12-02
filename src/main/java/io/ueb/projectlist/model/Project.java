package io.ueb.projectlist.model;

import java.util.List;

public class Project {
    private String name;
    private List<Checklist> checklists;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Checklist> getChecklists() {
        return checklists;
    }

    public void setChecklists(List<Checklist> checklists) {
        this.checklists = checklists;
    }
}
