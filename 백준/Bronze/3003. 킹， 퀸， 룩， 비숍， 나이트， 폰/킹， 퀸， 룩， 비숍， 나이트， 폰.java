import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int []arr= {1,1,2,2,2,8};

        String str = bf.readLine();

        String [] arr2 = str.split(" ");

        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] - Integer.parseInt(arr2[i]);
            System.out.print(arr[i]+" ");
        }
    }
}
