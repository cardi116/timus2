package timus.timus;

import java.util.*;

public class tasj1545 {
    public static void main(String[] args) {
        // Имитация справочника Сергея из image_bf345d.png
        Map<Character, List<Character>> dictionary = new HashMap<>();

        // Наполняем справочник (пример: 'ka' -> 1-й иероглиф, 'ki' -> 2-й иероглиф)
        addToDictionary(dictionary, "ka");
        addToDictionary(dictionary, "ki");
        addToDictionary(dictionary, "ko");
        addToDictionary(dictionary, "sa");
        addToDictionary(dictionary, "su");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую латинскую букву для получения подсказки:");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.length() > 0) {
                char firstChar = input.toLowerCase().charAt(0);

                // Получаем список возможных продолжений
                List<Character> hints = dictionary.get(firstChar);

                if (hints != null) {
                    System.out.print("Возможные продолжения для '" + firstChar + "': ");
                    for (char c : hints) {
                        System.out.print(firstChar + "" + c + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Для буквы '" + firstChar + "' совпадений в справочнике нет.");
                }
            }
            System.out.println("\nВведите следующую букву (или Ctrl+C для выхода):");
        }
    }

    private static void addToDictionary(Map<Character, List<Character>> dict, String code) {
        if (code.length() == 2) {
            char first = code.charAt(0);
            char second = code.charAt(1);
            dict.computeIfAbsent(first, k -> new ArrayList<>()).add(second);
        }
    }
}