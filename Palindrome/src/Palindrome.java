import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter String to check for Palindrome:");
    String str = br.readLine();


    checkPalindrome(str);
}

    private static void checkPalindrome(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        if (sb.toString().equalsIgnoreCase(str))
            System.out.println(str + " is palindrome.");
        else
            System.out.println(str + " is not palindrome");
    }
}
