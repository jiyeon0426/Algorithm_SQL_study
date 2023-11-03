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

        int[][] array = new int[100][100];

        int n = Integer.parseInt(bf.readLine());
        int sum =0;

        for(int i=0; i<n; i++){

            st = new StringTokenizer(bf.readLine());

            int garo = Integer.parseInt(st.nextToken());
            int sero = Integer.parseInt(st.nextToken());


            for(int j= sero; j<sero+10; j++){
                for(int k=garo; k<garo+10; k++){
                    array[j][k] +=1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0;j<100; j++){

                if(array[i][j] != 0) {
                    sum += 1;
                }
            }
        }
        System.out.println(sum);

    }
}