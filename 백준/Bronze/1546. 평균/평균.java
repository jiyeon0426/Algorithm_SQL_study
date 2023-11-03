import java.io.*;
import java.util.*;

public class Main {
//
//    public static int[] reverseSubarray(int[] arr, int a, int b){
//
//        int temp;
//        while(a<b){
//            temp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = temp;
//
//            a++;
//            b--;
//        }
//
//        return arr;
//    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        List <Integer> list = new ArrayList<>();
        List <Double> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken())); //[0]40 [1]80 [2]60
        }
        int max = Collections.max(list); // 80
        double sum=0;


        for(int j=0; j<n; j++){
            double sss = ((double) (list.get(j)) /max) *100;
            sum += sss;
        }

        System.out.print(sum/n);
    }
}