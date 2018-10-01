import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;

    @Before
    public void setUp(){
        human = new Human();
    }

    @Test
    public void canEat() {
        assertEquals("I'm eating", human.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("I'm breathing", human.breathe());
    }

    @Test
    public void canTalk() {
        assertEquals("I'm talking", human.talk());
    }

    @Test
    public void canWalk() {
        assertEquals("I'm walking", human.walk());
    }

}
