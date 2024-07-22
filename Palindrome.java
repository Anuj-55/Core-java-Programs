package Practice;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (reversed == original) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is not a Palindrome number");
        }
    }
}
