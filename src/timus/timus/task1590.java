package timus.timus;

import java.util.*;

public class task1590
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        long P = 31;
        long[] pow = new long[n + 1];
        long[] h = new long[n + 1];

        pow[0] = 1;

        for (int i = 1; i <= n; i++) {pow[i] = pow[i - 1] * P;}

        for (int i = 0; i < n; i++)
        {
            h[i + 1] = h[i] * P + (s.charAt(i) - 'a' + 1);
        }

        HashSet<Long> set = new HashSet<>();

        for (int l = 0; l < n; l++)
        {
            for (int r = l; r < n; r++)
            {
                long hash = h[r + 1] - h[l] * pow[r - l + 1];set.add(hash);
            }
        }

        System.out.println(set.size());
    }
}