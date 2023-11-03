import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호

            int[][] apt = new int[k + 1][n];

            // 0층 초기화
            for (int j = 0; j < n; j++) {
                apt[0][j] = j + 1;
            }

            // 나머지 층 초기화
            for (int j = 1; j <= k; j++) {
                for (int l = 0; l < n; l++) {
                    for (int m = 0; m <= l; m++) {
                        apt[j][l] += apt[j - 1][m];
                    }
                }
            }

            // 결과 출력
            System.out.println(apt[k][n - 1]);
        }
    }
}
