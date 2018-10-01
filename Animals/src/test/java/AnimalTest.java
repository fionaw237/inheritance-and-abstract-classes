import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void setUp(){
        animal = new Animal();
    }

    @Test
    public void canEat() {
        assertEquals("I'm eating", animal.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("I'm breathing", animal.breathe());
    }
}
