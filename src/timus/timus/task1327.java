package timus.timus;
import java.util.Scanner;

public class task1327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = countOdds(b) - countOdds(a - 1);

            System.out.println(result);
        }
    }

    private static int countOdds(int n) {
        if (n < 0) return 0;
        return (n + 1) / 2;
    }
}