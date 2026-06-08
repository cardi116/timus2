package timus.timus;
import java.util.Scanner;

public class task1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем 4 числа: a (старт Пети), b (надбавка), c (старт таксиста), d (скидка)
        if (!scanner.hasNextInt()) return;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Процесс торга
        while (a < c) {
            // Шаг Пети: он готов поднять цену
            a += b;

            // Если после повышения цена Пети догнала или обошла текущую цену таксиста
            if (a >= c) {
                a = c; // Петя соглашается на цену таксиста
                break;
            }

            // Шаг таксиста: он готов снизить цену
            c -= d;

            // Если после снижения цена таксиста стала ниже или равна предложению Пети
            if (c <= a) {
                // Петя уже предложил 'a', и таксист согласен на эту цену (или меньше)
                break;
            }
        }

        // Выводим итоговую сумму
        System.out.println(a);
    }
}