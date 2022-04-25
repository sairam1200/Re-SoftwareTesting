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
        int count=0;
        char[] wordChars = word.toCharArray();

        for (char chr: wordChars){
            if(chr=='a'||chr=='A' || chr=='e'||chr=='E' || chr=='i'||chr=='I' || chr=='o'||chr=='O' || chr=='u'||chr=='U'){
                count=count+1;
            }
        }
        return  count;
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
    //method 1
    // description: count the uppercases here test: testCountUpperCase()
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
    //method 2
    // description: count the uppercases integer with return value StringValue(int)
    public String countUpperCaseINT(String word){
        int count=0;
        char[] wordChars=word.toCharArray();
        for(char chr: wordChars){
            if(Character.isUpperCase(chr)){
                count=count+1;
            }
        }
        return String.valueOf(count);
    }
    //method 3
    //description : this method  counts the number of lowercases in a string test: testCountLowerCase()
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
    //method 4
    //description: this method counts the number of alphabet A and a test:testCountOnlyA()
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
        //method 4
    // count number for the integration test gives the return value string value (int)
    public String countNumbersINT(String word){
        int count =0;
        char[] wordChars=word.toCharArray();
        for(char chr: wordChars){
            if(chr=='1'||chr=='2'||chr=='3'||chr=='4'||chr=='5'||chr=='6'||chr=='7'||chr=='8'||chr=='9'||chr=='0') {
                count = count + 1;

            }
        }
        return String.valueOf(count);
    }
    //Author: Sai Nikhil
    //Description: count words starting with vowels. Test: countWordsStartingWithVowels()
    //Method 1
    public int countWordsStartingWithVowels(String sentence){

        //initial count
        int count = 0;

        //storing value passed from testCase
        String str = sentence;

        //splitting the word after ever <space> and storing it in a string array
        String[] splitWord = str.split(" ");

        for (int i = 0; i < splitWord.length; i++) {

            //picking up word @ index i of array and storing first character of it to variable
            char firstCharactor = splitWord[i].charAt(0);

            switch(firstCharactor) {
                case 'A':
                    count++;
                    break;
                case 'a':
                    count++;
                    break;
                case 'E':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'I':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'O':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'U':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    count = count;

            }
        }

        return count;
    }
    // Method 2
    //Description: counting number of reverse vowels. Test: reverseVowelCount()
    public int reverseVowelCount(String vowels){

        String _vowels = vowels;

        //array of char to store every alphabet separately
        char ch[]=_vowels.toCharArray();

        //to store value in reverse
        String reverseVowel="";

        //initial value for i should be equal to length of char array length
        //checking if value of i >= 0 for (for loop) to finish looping
        //decrement value for i

        for(int i=ch.length-1;i>=0;i--){
            reverseVowel+=ch[i];
        }

        //System.out.print(reverseVowel.length());

        //returning the count for vowels string passed and reversed
        return reverseVowel.length();

    }
    //Method 3
    //Description: Returning the count of 'b' Test:countOnlyB()
    public int countOnlyB(String word){
       //temp storing string
       String _word = word;
       //initial count
        int count = 0;
        //temp char type to hold value
        char tempChar;

        for (int i = 0; i< _word.length(); i++){
            //getting value @ index of i and storing it
            tempChar = _word.charAt(i);

            //comparing and counting
            if(tempChar == 'B' || tempChar == 'b'){
                count++;
            }
        }
        return count;
    }
}

