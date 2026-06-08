package timus.timus;

import java.util.*;
import java.math.BigInteger;

public class task1677 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        String s = sc.nextLine();

        int m = s.length();

        int[] pi = new int[m];

        for (int i = 1; i < m; i++)
        {
            int j = pi[i - 1];

            while (j > 0 && s.charAt(i) != s.charAt(j))
            {
                j = pi[j - 1];
            }

            if (s.charAt(i) == s.charAt(j))
            {
                j++;
            }

            pi[i] = j;
        }

        ArrayList<Integer> borders = new ArrayList<>();

        int k = m;
        while (k > 0)
        {
            borders.add(k);
            k = pi[k - 1];
        }

        BigInteger base = BigInteger.valueOf(N);
        BigInteger ans = BigInteger.ZERO;

        for (int len : borders)
        {
            ans = ans.add(base.pow(len));
        }

        System.out.println(ans);
    }
}