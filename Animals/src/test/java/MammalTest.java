import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void setUp(){
        mammal = new Mammal();
    }

    @Test
    public void canEat() {
        assertEquals("I'm eating", mammal.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("I'm breathing", mammal.breathe());
    }

    @Test
    public void canTalk() {
        assertEquals("I'm talking", mammal.talk());
    }
}
