import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수
        int[][] arr = new int[t][2];
        int[] result = new int[t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    result[i]++;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.print((result[i] + 1) + " ");
        }
    }
}
