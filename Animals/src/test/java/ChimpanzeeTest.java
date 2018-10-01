import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {

    Chimpanzee chimpanzee;

    @Before
    public void setUp(){
        chimpanzee = new Chimpanzee();
    }

    @Test
    public void canEat() {
        assertEquals("I'm eating", chimpanzee.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("I'm breathing", chimpanzee.breathe());
    }

    @Test
    public void canTalk() {
        assertEquals("I'm talking", chimpanzee.talk());
    }

    @Test
    public void canWalk() {
        assertEquals("I'm walking", chimpanzee.walk());
    }
}
