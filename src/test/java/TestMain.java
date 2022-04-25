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
    // test case on the count uppercase test: testCountUpperCase()
    @Test
    public void testCountUpperCase(){
        main =new Main();
        assertEquals(2,main.countUpperCase("Hello Man"));
    }
    //test case 2
    //this test case consits of the count of lower cases test: testCountLowerCase()
    @Test
    public void testCountLowerCase(){
        main =new Main();
        assertEquals(4,main.countLowerCase("SaiRam"));
    }
   //test case 3
    //this test case consits of the count of the alphabet only A and a   test:testCountOnlyA()
    @Test
    public void testCountOnlyA(){
        main= new Main();
        assertEquals(2,main.countOnlyA("Hello man where are you?"));
    }
    //integration testcases
    //test case 1
    //Description :test on both length word and upper case  Test: testLengthAndUpperCase
    @Test
    public void testLengthAndUpperCase(){
        main =new Main();
        assertEquals(1,main.lengthWord(main.countUpperCaseINT("Sai")));
    }
    //lakshmi srinidh
    //test case 1
    //count the numbers in the string test: testcountNumber()
    @Test
    public void testcountNumber(){
        main= new Main();
        assertEquals(5,main.countNumbers("alpha12345"));
    }

    //test case 2
    // count the spaces in the given string test : testcountSpaces()
    @Test
    public void testcountSpaces(){
        main=new Main();
        assertEquals(3,main.countSpaces("i am lakshmi srinidh"));
    }
    //test case 3
    //count the special symbols in the given string test : testSpecialSymbols()
    @Test
    public void testSpecialSymbols(){
        main=new Main();
        assertEquals(4,main.countSpecialSymbols("alpha,sre,@/"));
    }
    //integration test case 1
    // test the integration numbers test: testintNumbers()
    @Test
    public void testintNumbers(){
        main=new Main();
        assertEquals(2,main.countNumbers(main.countNumbersINT("123455678912233456")));
    }
    //nikhil test case 1
    //count words starting with vowel
    @Test
    public void testCountWordsStartingWithVowels(){
        main = new Main();
        assertEquals(1, main.countWordsStartingWithVowels("The quick brown fox jumps over the lazy dog"));
    }
    // nikhil test case 2
    //reverse vowel count test
    @Test
    public void testReverseVowelCount(){
        main = new Main();
        assertEquals(5,main.reverseVowelCount("aeiou"));
    }
    //nikhil test case 3
    //count only 'b' test
    @Test
    public void testCountOnlyB(){
        main = new Main();
        assertEquals(1,main.countOnlyB("bat"));
    }
    //Integration test
    @Test
    public void testNumbersAndSpecialSymbols(){
        main = new Main();
        assertEquals(main.lengthWord("hewill"), main.countNumbers("1234")+main.countSpecialSymbols("@#,"));
    }
}