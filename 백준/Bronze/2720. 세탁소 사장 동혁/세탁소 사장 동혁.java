import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int n = Integer.parseInt(bf.readLine()); // 3
        int arr[][] = new int[n][4];
        double money = 0;

        for(int i=0; i<n; i++){

            money = Integer.parseInt(bf.readLine());

            arr[i][0] = (int) (money/25);
            money %= 25;

            arr[i][1] = (int) (money/10);
            money %= 10;

            arr[i][2] = (int) (money/5);
            money %=5;

            arr[i][3] = (int) (money/1);

        }

        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}