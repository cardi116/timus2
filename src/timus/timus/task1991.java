package timus.timus;

import java.util.Scanner;

public class task1991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long totalLeftoverBooms = 0;
        long totalSurvivedDroids = 0;

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt(); 

            if (ai > k) {
                totalLeftoverBooms += (ai - k);
            } else {
                totalSurvivedDroids += (k - ai);
            }
        }

        System.out.println(totalLeftoverBooms + " " + totalSurvivedDroids);
    }
}