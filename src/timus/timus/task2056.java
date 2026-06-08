package timus.timus;
import java.util.Scanner;

public class task2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        boolean hasThree = false;
        boolean hasOnlyFives = true;

        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            sum += grade;

            if (grade == 3) {
                hasThree = true;
            }
            if (grade != 5) {
                hasOnlyFives = false;
            }
        }

        double average = (double) sum / n;

        if (hasThree) {
            System.out.println("None");
        } else if (hasOnlyFives) {
            System.out.println("Named");
        } else if (average >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }

        scanner.close();
    }
}