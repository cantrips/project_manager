package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;
import io.ueb.projectlist.util.ProjectFactory;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DefaultCreateNewProjectUseCaseTest {

    private CreateNewProjectUseCase defaultCreateNewProjectUseCase;
    private FakeProjectRepository fakeProjectRepository;

    @Before
    public void setup(){
        fakeProjectRepository = new FakeProjectRepository();
        defaultCreateNewProjectUseCase = new DefaultCreateNewProjectUseCase(fakeProjectRepository);
    }

    @Test
    public void whenCreateNewProjectUseCaseIsCalled_theProjectIsSavedInARepository(){
        Project project = ProjectFactory.buildProject();

        defaultCreateNewProjectUseCase.execute(project);

        assertThat(fakeProjectRepository.projectCreateCalledWith).isEqualTo(project);
    }
}
