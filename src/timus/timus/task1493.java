package timus.timus;

import java.util.Scanner;

    public class task1493 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int n = Integer.parseInt(s);

            if (isLucky(n + 1) || isLucky(n - 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        private static boolean isLucky(int n) {

            if (n < 0 || n > 999999) return false;


            String s = String.format("%06d", n);

            int sum1 = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
            int sum2 = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');

            return sum1 == sum2;
        }
    }

