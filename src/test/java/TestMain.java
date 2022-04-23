import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMain {

    public static Main main;

    @BeforeClass
    public static void setUp() {
        main = new Main();
        assertNotEquals(main, null);
    }

    // UNIT TESTS

    @Test
    public void testLengthWord() {
        main = new Main();
        assertEquals(5, main.lengthWord("music"));
    }

    @Test
    public void testCountVowels() {
        main = new Main();
        assertEquals(3, main.countVowels("magenta"));
    }

    @Test
    public void testCountConsonants() {
        main = new Main();
        assertEquals(4, main.countConsonants("magenta"));
    }
    //these are unit tests
    //sairam chikkala
    @Test
    public void testCountUpperCase(){
        main= new Main();
        assertEquals(2,main.countUpperCase("SpiderBoy"));
    }
    @Test
    public void testCountlowerCase(){
        main = new Main();
        assertEquals(3,main.countLowerCase("SPIDERBoy"));
    }
    @Test
    public void testCountOnlyA(){
        main = new Main();
        assertEquals(3,main.countOnlyA("AAAhello"));
    }
}