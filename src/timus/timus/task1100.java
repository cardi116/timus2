package timus.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class task1100 {
    // Создаем класс для хранения данных команды
    static class Team {
        int id;
        int score;

        Team(int id, int score) {
            this.id = id;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        // Используем быстрый ввод и вывод
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String firstLine = br.readLine();
        if (firstLine == null) return;
        int n = Integer.parseInt(firstLine.trim());

        Team[] teams = new Team[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            teams[i] = new Team(id, m);
        }

        // Сортировка: по убыванию баллов (M).
        // Если баллы равны, сохраняем исходный порядок (стабильная сортировка).
        Arrays.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team a, Team b) {
                // b.score - a.score даст сортировку по убыванию
                return Integer.compare(b.score, a.score);
            }
        });

        // Вывод результата
        for (Team team : teams) {
            out.println(team.id + " " + team.score);
        }
        out.flush();
    }
}