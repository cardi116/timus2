package timus.timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Карта для хранения: Имя команды -> Количество отправок
        Map<String, Integer> submissions = new HashMap<>();

        System.out.println("Введите названия команд (по одной в строке). " +
                "Для завершения введите 'end' или пустую строку:");

        while (scanner.hasNextLine()) {
            String teamName = scanner.nextLine().trim();
            if (teamName.isEmpty() || teamName.equalsIgnoreCase("end")) {
                break;
            }

            // Увеличиваем счетчик отправок для команды
            submissions.put(teamName, submissions.getOrDefault(teamName, 0) + 1);
        }

        System.out.println("\n--- Отладочные аккаунты спамера ---");
        boolean found = false;

        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            // Согласно условию из image_bf37df.png, ищем тех, у кого > 1 отправки
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Спамеры не обнаружены.");
        }

        scanner.close();
    }
}