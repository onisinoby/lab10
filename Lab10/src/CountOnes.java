import java.util.Scanner;

public class CountOnes {

    public static void main(String[] args) {
        int count = countOnes();
        System.out.println(count);
    }

    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                return 0;
            } else {
                return countOnes();
            }
        }

        if (number == 1) {
            return 1 + countOnes();
        } else {
            return countOnes();
        }
    }
}
