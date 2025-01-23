import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.println(isPalindrome(input));
    }

    private static String isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();

        if (string.equals(reversed))
            return "Palindrome";
        else
            return "Not Palindrome";

    }
}
