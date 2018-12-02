package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Checklist;
import io.ueb.projectlist.model.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectFactory {

    public static Project buildProject(){
        Project project = new Project();
        List<Checklist> checklists = new ArrayList<>();
        checklists.add(ChecklistFactory.buildChecklist());

        project.setName("some project name");
        project.setChecklists(checklists);

        return project;
    }
}
