package timus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class t1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());

        List<Integer> solutions = new ArrayList<>();

        // Перебираем все возможные X в диапазоне [0, M - 1]
        for (int x = 0; x < m; x++) {
            // Используем BigInteger для безопасного и быстрого вычисления (X^N) mod M
            BigInteger bigX = BigInteger.valueOf(x);
            BigInteger bigN = BigInteger.valueOf(n);
            BigInteger bigM = BigInteger.valueOf(m);

            if (bigX.modPow(bigN, bigM).intValue() == y) {
                solutions.add(x);
            }
        }

        // Выводим результат
        if (solutions.isEmpty()) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < solutions.size(); i++) {
                sb.append(solutions.get(i));
                if (i < solutions.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}