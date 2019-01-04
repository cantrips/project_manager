package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;
import io.ueb.projectlist.util.ProjectFactory;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public abstract class ProjectRepositoryTest {

    protected ProjectRepository projectRepository;

    @Test
    public void projectRepositoryCanSave_andRetrieve_a_Project(){
        Project project = ProjectFactory.buildProject();

        projectRepository.saveProject(project);

        assertThat(projectRepository.findById(project.getName())).isEqualToComparingFieldByFieldRecursively(project);
    }
}
