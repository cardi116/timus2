package timus.timus;

import java.util.*;

public class task1295 {

    static long pow(long a, long b, long mod)
    {
        long r = 1;
        a %= mod;
        while (b > 0)
        {

            if ((b & 1) == 1) r = (r * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return r;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long mod = 1000000000000L;

        long s = 0;

        s += pow(1, n, mod);
        s += pow(2, n, mod);
        s += pow(3, n, mod);
        s += pow(4, n, mod);

        int count = 0;
        while (s % 10 == 0)
        {
            s /= 10;
            count++;
        }

        System.out.println(count);
    }
}