package timus.timus;

import java.util.*;

public class task1298 {

    static int N;
    static boolean[][] used;
    static ArrayList<String> path = new ArrayList<>();

    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static boolean dfs(int x, int y, int step) {
        if (step == N * N) return true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !used[nx][ny]) {
                used[nx][ny] = true;
                path.add("" + (char)('a' + nx) + (ny + 1));

                if (dfs(nx, ny, step + 1)) return true;

                used[nx][ny] = false;
                path.remove(path.size() - 1);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if (N == 1) {
            System.out.println("a1");
            return;
        }

        if (N == 2 || N == 3 || N == 4) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        used = new boolean[N][N];

        used[0][0] = true;
        path.add("a1");

        if (dfs(0, 0, 1)) {
            for (String s : path) {
                System.out.println(s);
            }
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}