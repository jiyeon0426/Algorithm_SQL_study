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


        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0;

        for(int i=a; i<=b; i++){

            int count=0;

            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count ==2){
                arr.add(i);
            }

        }


        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }


        if(!arr.isEmpty()){
            System.out.println(sum); // 소수 갯수
            System.out.println(arr.get(0));
        }else{
            System.out.println(-1);
        }

    }

}