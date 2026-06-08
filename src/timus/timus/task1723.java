package timus.timus;

import java.util.Scanner;

public class task1723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String answer = "";
        int maxPower = 0;

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; j <= s.length(); j++)
            {
                String sub = s.substring(i, j);

                int count = 0;

                for (int k = 0; k + sub.length() <= s.length(); k++)
                {
                    if (s.substring(k, k + sub.length()).equals(sub))
                    {
                        count++;
                    }
                }

                int power = count * sub.length();

                if (power > maxPower)
                {
                    maxPower = power;
                    answer = sub;
                }
            }
        }

        System.out.println(answer);
    }
}