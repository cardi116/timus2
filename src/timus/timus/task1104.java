package timus.timus;

import java.util.Scanner;

public class task1104 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        long sum = 0;
        int maxDigit = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d;

            if (c >= '0' && c <= '9')
            {
                d = c - '0';
            }
            else
            {
                d = c - 'A' + 10;
            }

            sum += d;
            maxDigit = Math.max(maxDigit, d);
        }

        int minBase = Math.max(2, maxDigit + 1);

        for (int k = minBase; k <= 36; k++)
        {
            if (sum % (k - 1) == 0)
            {
                System.out.println(k);
                return;
            }
        }
    }
}