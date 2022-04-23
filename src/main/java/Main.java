public class Main {

    public static void main(String[] args) {
        System.out.println("BYEEE!!!");
    }


    public int lengthWord(String word) {
        return word.length();
    }

    public int countVowels(String word) {
        int count = 0;

        char[] wordChars = word.toCharArray();

        for (char chr : wordChars) {
            if (chr == 'a' || chr == 'A' || chr == 'e' || chr == 'E' || chr == 'i' || chr == 'I' || chr == 'o' || chr == 'O' || chr == 'u' || chr == 'U') {
                count = count + 1;
            }
        }

        return null;
    }

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

    public int countUpperCase(String word) {
        int count = 0;

        char[] wordChars = word.toCharArray();

        for (char chr : wordChars) {
            if (Character.isUpperCase(chr)) {
                count = count + 1;
            }
        }

        return count;
    }

    public int countLowerCase(String word) {
        int count = 0;

        char[] wordChars = word.toCharArray();

        for (char chr : wordChars) {
            if (Character.isLowerCase(chr)) {
                count = count + 1;
            }
        }

        return count;
    }
}