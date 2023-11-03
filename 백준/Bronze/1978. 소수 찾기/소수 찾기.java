import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList <Integer> arr = new ArrayList<>();


        int n = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine()); // 1 3 5 7
        int answer=0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            int count=0;

            for(int j=1; j<=num; j++){
                if(num%j==0){
                    count++;
                }
            }
            if(count ==2){
                answer++;
            }

        }

        System.out.println(answer);

    }

}