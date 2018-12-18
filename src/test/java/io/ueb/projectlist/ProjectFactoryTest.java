package io.ueb.projectlist;

import io.ueb.projectlist.model.Project;
import io.ueb.projectlist.model.TaskStatus;
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
        assertThat(project.getlooplists().get(0).getLooplistItems().get(0).getName()).isEqualTo("some looplist item");
        assertThat(project.getTasks().get(0).getName()).isEqualTo("some task");
        assertThat(project.getTasks().get(0).getStatus()).isEqualTo(TaskStatus.NEXT);
        assertThat(project.getTasks().get(1).getStatus()).isEqualTo(TaskStatus.WAITING);
        assertThat(project.getTasks().get(1).getTradeoffs().get(0)).isEqualTo("some tradeoff");
        assertThat(project.getResources().get(0).getName()).isEqualTo("some resource");
        assertThat(project.getOutcomes()).contains("some outcome");
        assertThat(project.getInbox().getInboxItems().get(0).getName()).isEqualTo("some inbox item");

    }
}
