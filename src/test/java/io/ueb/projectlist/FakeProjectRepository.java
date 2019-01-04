package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;

public class FakeProjectRepository implements ProjectRepository {

    public Project projectCreateCalledWith;

    public Project saveProject(Project project){
        this.projectCreateCalledWith = project;
        return projectCreateCalledWith;
    }

    public Project findById(String name){
        return projectCreateCalledWith;
    }
}
