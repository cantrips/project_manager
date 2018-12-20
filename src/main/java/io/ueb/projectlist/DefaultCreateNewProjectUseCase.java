package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;

public class DefaultCreateNewProjectUseCase implements CreateNewProjectUseCase {
    private ProjectRepository projectRepository;

    public DefaultCreateNewProjectUseCase(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void execute(Project project){
        projectRepository.saveProject(project);
    }
}
