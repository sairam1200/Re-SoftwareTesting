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
    //Author: Daniel Pliego Gonzalez
    //Description: This test count the letters of the string that the user give as an input. Function: lengthWord(String word)
    @Test
    public void testLengthWord() {
        main = new Main();
        assertEquals(5, main.lengthWord("music"));
    }
    //Author: Daniel Pliego Gonzalez
    //Description: This test count the Vowels of the string that the user give as an input. Function: countVowels(String word)
    @Test
    public void testCountVowels() {
       main = new Main();
       assertEquals(3, main.countVowels("magenta"));
    }
    //Author: Daniel Pliego Gonzalez
    //Description: This test count the consonants of the string that the user give as an input. Function: countConsonants(String word)
    @Test
    public void testCountConsonants() {
        main = new Main();
        assertEquals(4, main.countConsonants("magenta"));
    }
    //INTEGRATION TEST
    //Author: Daniel Pliego Gonzalez
    //Description: This Test returns if the lenght of the word is the same os the consonant+vowels
    @Test
    public void testVowelsAndConsonants() {
        main = new Main();
        assertEquals(main.lengthWord("great"), main.countConsonants("great") + main.countVowels("great"));
    }

    //sai ram chikkala
    // test case on the count uppercase
    @Test
    public void testCountUpperCase(){
        main =new Main();
        assertEquals(2,main.countUpperCase("Hello Man"));
    }
    //test case 2
    //this test case consits of the count of lower cases
    @Test
    public void testCountLowerCase(){
        main =new Main();
        assertEquals(4,main.countLowerCase("SaiRam"));
    }
   //test case 3
    //this test case consits of the count of the alphabet only A and a
    @Test
    public void testCountOnlyA(){
        main= new Main();
        assertEquals(2,main.countOnlyA("Hello man where are you?"));
    }
    //integration testcases
    //test case 1
    //Description :test on both lower and upper case
    @Test
    public void testlowerAndUpperCase(){
        main =new Main();
        assertEquals(main.lengthWord("Hello"),main.countUpperCase("SaiRam")+ main.countLowerCase("Sail"));
    }
    //lakshmi srinidh
    //test case 1
    //count the numbers in the string
    @Test
    public void testcountNumber(){
        main= new Main();
        assertEquals(5,main.countNumbers("alpha12345"));
    }
    //test case 2
    // count the spaces in the given string
    @Test
    public void testcountSpaces(){
        main=new Main();
        assertEquals(3,main.countSpaces("i am lakshmi srinidh"));
    }
    //test case 3
    //count the special symbols in the given string
    @Test
    public void testSpecialSymbols(){
        main=new Main();
        assertEquals(4,main.countSpecialSymbols("alpha,sre,@/"));
    }
    //integration test case 1
    // test the spaces and numbers
    @Test
    public void testSpacesandNumbers(){
        main=new Main();
        assertEquals(main.lengthWord("hello"),main.countSpaces("hello world ")+main.countNumbers("srinidh999"));
    }
}