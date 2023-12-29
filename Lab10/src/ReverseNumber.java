import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        int reversedRemaining = reverse(remainingDigits);
        int reversedNumber = (int) (lastDigit * Math.pow(10, (int) Math.log10(remainingDigits) + 1) + reversedRemaining);
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int number = scaner.nextInt();
        int reversedNumber = reverse(number);
        System.out.println(reversedNumber);
    }
}