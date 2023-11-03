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

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        int sum = n1*n2*n3;

       int arr[] = new int[10];


        while(sum > 0){
            arr[sum%10]++;
            sum = sum/10;

        }

        for(int i=0; i<10; i++) {

            System.out.println(arr[i]);
        }

    }

}