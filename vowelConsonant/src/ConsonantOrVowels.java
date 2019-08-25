public class ConsonantOrVowels {


    public static boolean constantOrNot(char ch) {
        // isVowel = false;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'O':
            case 'U':
                System.out.println(" is a vowels " + ch);
                return true;

            default:
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    System.out.println(" is a  consonant " + ch);
                    return false;
                } else {
                    System.out.println("is not alphabet");
                    return false;
                }


        }

    }
}
