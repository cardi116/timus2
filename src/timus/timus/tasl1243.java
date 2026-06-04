package timus.timus;
import java.util.Scanner;

public class tasl1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Указываем количество гномов согласно тексту в image_bf8d58.png
        final int GNOMES_COUNT = 7;

        System.out.print("Введите общее количество предметов: ");

        // Проверяем, есть ли ввод, и используем long для больших чисел
        if (scanner.hasNextLong()) {
            long totalItems = scanner.nextLong();

            // Доля Белоснежки — это остаток от деления на 7
            long snowWhiteShare = totalItems % GNOMES_COUNT;

            System.out.println("Белоснежка получит: " + snowWhiteShare);
        } else {
            System.out.println("Ошибка: введено слишком большое число или не число.");
        }

        scanner.close();
    }
}