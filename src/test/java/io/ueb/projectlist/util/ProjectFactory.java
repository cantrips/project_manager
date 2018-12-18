package io.ueb.projectlist.util;

import io.ueb.projectlist.model.*;

import java.util.ArrayList;
import java.util.List;

public class ProjectFactory {

    public static Project buildProject(){
        Project project = new Project();
        List<Checklist> checklists = new ArrayList<>();
        checklists.add(ChecklistFactory.buildChecklist());

        List<Looplist> looplists = new ArrayList<>();
        looplists.add(LooplistFactory.buildLooplist());

        List<String> outcomes = new ArrayList<>();
        outcomes.add("some outcome");

        project.setName("some project name");
        project.setChecklists(checklists);
        project.setlooplists(looplists);
        project.setTasks(TaskListFactory.buildTaskList());
        project.setOutcomes(outcomes);
        project.setResources(ResourcesFactory.buildResourceList());
        project.setInbox(InboxFactory.buildInbox());

        return project;
    }
}
