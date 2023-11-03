import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] arr = new int[n]; // 바구니

        for (int i = 0; i <k; i++){ //4번 반복
            String ball = bf.readLine();

            String [] ball_arr = new String[3]; // 1 2 3

            ball_arr = ball.split(" "); // [0]1 [1]2 [2]3 담음

            for(int j=Integer.parseInt(ball_arr[0]) -1; j< Integer.parseInt(ball_arr[1]); j++){

                arr[j] = Integer.parseInt(ball_arr[2]);
            }
        }


        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}