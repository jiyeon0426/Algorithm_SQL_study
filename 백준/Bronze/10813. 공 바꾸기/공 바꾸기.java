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

        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        for (int i = 0; i <k; i++){ //4번 반복
            String ball = bf.readLine();
            String [] ball_arr = new String[2]; // 1 2
            ball_arr = ball.split(" "); // [0]1 [1]2 담음

            int tmp = arr[ Integer.parseInt(ball_arr[0])-1];
            arr[ Integer.parseInt(ball_arr[0])-1] = arr[ Integer.parseInt(ball_arr[1])-1];
            arr[ Integer.parseInt(ball_arr[1])-1] = tmp;

        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}