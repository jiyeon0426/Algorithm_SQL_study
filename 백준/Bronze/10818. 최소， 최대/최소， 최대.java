import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int max = 0;
        int min = 0;

        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        String [] arr = new String[n];
        arr = str.split(" ");

        max = Integer.parseInt(arr[0]);
        min = Integer.parseInt(arr[0]);

        for(int i=1; i<n; i++){

            if(max < Integer.parseInt(arr[i])){
                max = Integer.parseInt(arr[i]);
            }
        }

        for(int i=1; i<n; i++){

            if(min > Integer.parseInt(arr[i])){
                min = Integer.parseInt(arr[i]);
            }
        }


        System.out.print(min + " " +max);
        br.close();

    }
}