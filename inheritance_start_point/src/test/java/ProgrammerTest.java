import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgrammerTest {

    private Programmer programmer;

    @Before
    public void setUp() {
        programmer = new Programmer("Ally", "G7");
    }

    @Test
    public void hasName(){
        assertEquals("Ally", programmer.getName());
    }

    @Test
    public void hasCohort() {
        assertEquals("G7", programmer.getCohort());
    }

    @Test
    public void canChangeName() {
        programmer.setName("Upul");
        assertEquals("Upul", programmer.getName());
    }

    @Test
    public void changeCohort() {
        programmer.setCohort("G9");
        assertEquals("G9", programmer.getCohort());
    }

    @Test
    public void canTalk() {
        assertEquals("I love Java", programmer.talk("Java"));
    }

}
