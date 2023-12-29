import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number != 0) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            printOddNumbers();
        }
    }
}