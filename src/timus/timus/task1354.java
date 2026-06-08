package timus.timus;

import java.util.Scanner;

public class task1354 {

    static boolean isPalindrome(String s, int l, int r)
    {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int pos = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (isPalindrome(s, i, s.length() - 1))
            {
                pos = i;
                break;
            }
        }

        StringBuilder ans = new StringBuilder(s);

        for (int i = pos - 1; i >= 0; i--)
        {
            ans.append(s.charAt(i));
        }

        System.out.println(ans);
    }
}