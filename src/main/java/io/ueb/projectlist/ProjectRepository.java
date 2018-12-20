package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;

public interface ProjectRepository {

    Project saveProject(Project project);
}
