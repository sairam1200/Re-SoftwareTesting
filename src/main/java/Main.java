import java.nio.charset.StandardCharsets;
///
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    //Author: Daniel Pliego Gonzalez
    //Description: This function count the length of the string that the user give as an input. Test: testLengthWord()
    public int lengthWord(String word) {
        return word.length();
    }

    //Author: Daniel Pliego Gonzalez
    //Description: This function count the vowels of the string that the user give as an input. Test: testCountVowels()
    public int countVowels(String word) {

    }

    //Author: Daniel Pliego Gonzalez
    //Description: This Function count the consonants of the string that the user give as an input. Test: testCountConsonants()
    public int countConsonants(String word) {
        int count = 0;

        char[] wordChars = word.toCharArray();

        for (char chr : wordChars) {
            if (chr != 'a' && chr != 'A' && chr != 'e' && chr != 'E' && chr != 'i' && chr != 'I' && chr != 'o' && chr != 'O' && chr != 'u' && chr != 'U') {
                count = count + 1;
            }
        }

        return count;
    }
    //sairam chikkala
    // description: count the uppercases here
    public int countUpperCase(String word){
        int count=0;
        char[] wordChars=word.toCharArray();
        for(char chr: wordChars){
            if(Character.isUpperCase(chr)){
                count=count+1;
            }
        }
        return count;
    }
    //description : this method  counts the number of lowercases in a string
    public int countLowerCase(String word){
        int count=0;
        char[] wordChars=word.toCharArray();
        for(char chr: wordChars){
            if(Character.isLowerCase(chr)){
                count=count+1;
            }
        }
        return count;
    }
    //description: this method counts the number of alphabet A and a
    public int countOnlyA(String word){
        //temp storing string
        String _word =word;
        //intial count
        int count=0;
        //temp char type to hold value
        char tempChar;
        for (int i=0;i< _word.length();i++){
            //getting value @ index of i and storing it
            tempChar = _word.charAt(i);
            //comparing and counting
            if (tempChar=='A'||tempChar=='a')
                count++;
        }
        return count;
    }
    //lakshmi srinidh
    //method 1
    //description: count the number in the given string
    public int countNumbers(String word){
        int count =0;
        char[] wordChars=word.toCharArray();
        for(char chr: wordChars){
            if(chr=='1'||chr=='2'||chr=='3'||chr=='4'||chr=='5'||chr=='6'||chr=='7'||chr=='8'||chr=='9'||chr=='0') {
                count = count + 1;

            }
        }
        return count;
    }
    //method 2
    //description: count the Spaces in the given string
    public int countSpaces(String word){
        String _word=word;
        int count=0;
        char tempChar;
        for(int i=0;i< _word.length();i++){
            tempChar= _word.charAt(i);
            if(tempChar==' ')
                count++;
        }
        return count;
    }
    //method 3
    //description: count the special character in the given string
    public int countSpecialSymbols(String word){
        int count=0;
        char[] wordChars = word.toCharArray();
        for (char chr: wordChars){
                if(chr =='@'||chr=='!'||chr=='&'||chr==','||chr==':'||chr=='"'||chr==';'||chr=='?'||chr=='/'){
                    count=count+1;
                }
            }
            return count;
        }
    }
