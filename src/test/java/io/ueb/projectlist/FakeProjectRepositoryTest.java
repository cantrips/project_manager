package io.ueb.projectlist;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class FakeProjectRepositoryTest extends ProjectRepositoryTest {

    @Before
    public void setup(){
        this.projectRepository = new FakeProjectRepository();
    }
}
