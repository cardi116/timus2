package timus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class t1196 {
    public static void main(String[] args) throws IOException {
        // Используем BufferedReader для быстрого чтения больших объемов данных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        StringTokenizer tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());

        // Считываем список преподавателя
        int[] teacherDates = new int[n];
        for (int i = 0; i < n; i++) {
            teacherDates[i] = Integer.parseInt(reader.readLine().trim());
        }

        // Так как в условии сказано, что список преподавателя отсортирован по неубыванию,
        // мы можем сразу использовать бинарный поиск.
        // (На всякий случай, если есть дубликаты, Arrays.binarySearch все равно вернет индекс >= 0, если элемент существует)

        line = reader.readLine();
        if (line == null) return;

        tokenizer = new StringTokenizer(line);
        int m = Integer.parseInt(tokenizer.nextToken());

        int matchCount = 0;

        // Построчно считываем даты студента и проверяем их наличие у преподавателя
        for (int i = 0; i < m; i++) {
            int studentDate = Integer.parseInt(reader.readLine().trim());

            // Если Arrays.binarySearch возвращает значение >= 0, значит элемент найден
            if (Arrays.binarySearch(teacherDates, studentDate) >= 0) {
                matchCount++;
            }
        }

        // Выводим итоговое количество совпадений
        System.out.println(matchCount);
    }
}