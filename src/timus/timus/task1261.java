package timus.timus;

import java.util.*;

public class task1261 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int[] a = new int[40];

        int len = 0;
        while (n > 0) {a[len++] = (int)(n % 3);n /= 3;}

        for (int i = 0; i < len; i++)
        {
            if (a[i] == 2)
            {
                a[i] = -1;
                a[i + 1]++;
            }
            else if (a[i] == 3)
            {
                a[i] = 0;
                a[i + 1]++;
            }
        }

        long pay = 0, tip = 0;

        long p = 1;
        for (int i = 0; i < len + 5; i++)
        {
            if (a[i] == 1)
            {
                pay += p;
            }
            else if (a[i] == -1)
            {
                tip += p;
            }
            p *= 3;
        }

        if (tip == 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(pay + " " + tip);
        }
    }
}