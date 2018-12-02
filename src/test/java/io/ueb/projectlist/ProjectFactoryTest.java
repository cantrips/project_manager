package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;
import io.ueb.projectlist.util.ProjectFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectFactoryTest {

    @Test
    public void whenProjectFactoryBuildMethodIsCalled_aProjectObjectIsReturned() {

        Project project = ProjectFactory.buildProject();

        assertThat(project.getName()).isEqualTo("some project name");
        assertThat(project.getChecklists().get(0).getChecklistItems().get(0).getName()).isEqualTo("some checklist item");
        assertThat(project.getLooplists().get(0).getChecklistItems().get(0).getName()).isEqualTo("some looplist item");
        assertThat(project.getTasks().get(0).getName()).isEqualTo("some task");
        assertThat(project.getTasks().get(0).getStatus()).isEqualTo(TaskStatus.Next);
        assertThat(project.getTasks().get(1).getStatus()).isEqualTo(TaskStatus.Waiting);
        assertThat(project.getResources().get(0).getName()).isEqualTo("some resource");
        assertThat(project.getOutcomes().get(0).getName()).isEqualTo("some outcome");
        assertThat(project.getInbox().get(0).getName()).isEqualTo("some inbox item");

    }
}
