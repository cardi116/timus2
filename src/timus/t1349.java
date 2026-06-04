package timus;
import java.util.Scanner;

public class t1349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println(-1);
            return;
        }

        int n = scanner.nextInt();

        // Быстрая проверка: теорема Ферма для n > 2 и невозможность равенства 1 + 1 = 1 для n = 0
        if (n <= 0 || n > 2) {
            System.out.println(-1);
            return;
        }

        // Тройной вложенный цикл для поиска a, b, c в диапазоне [1, 100]
        // Ищем в порядке возрастания, чтобы первое найденное решение было с минимальным `a`, а затем `b`
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                // Пропускаем, если числа не различны
                if (a == b) continue;

                for (int c = 1; c <= 100; c++) {
                    // Пропускаем, если числа не различны
                    if (a == c || b == c) continue;

                    // Проверяем условие задачи в зависимости от n
                    if (n == 1) {
                        if (a + b == c) {
                            System.out.println(a + " " + b + " " + c);
                            return; // Нашли первое (наилучшее) решение, завершаем программу
                        }
                    } else if (n == 2) {
                        if (a * a + b * b == c * c) {
                            System.out.println(a + " " + b + " " + c);
                            return; // Нашли первое (наилучшее) решение, завершаем программу
                        }
                    }
                }
            }
        }

        // Если перебрали всё и не нашли (хотя для n=1 и n=2 решения точно есть)
        System.out.println(-1);
    }
}