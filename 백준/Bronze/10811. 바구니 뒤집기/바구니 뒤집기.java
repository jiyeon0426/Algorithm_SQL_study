import java.io.*;
import java.util.*;

public class Main {

    public static int[] reverseSubarray(int[] arr, int a, int b){

        int temp;
        while(a<b){
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }

        return arr;
    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken()); //바구니
        int input = Integer.parseInt(st.nextToken()); //입력값


        int [] list = new int[n];
        //List <Integer> list = new ArrayList<>();

        for(int j=0; j<n; j++){
            list[j]= j+1; // 1 2 3 4 5
        }


        for(int i=0; i<input; i++){
            st = new StringTokenizer(bf.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            reverseSubarray(list,a-1,b-1);
        }

        for(int i=0; i<list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }
}