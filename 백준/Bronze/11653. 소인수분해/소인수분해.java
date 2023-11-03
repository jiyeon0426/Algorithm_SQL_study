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


        int a = sc.nextInt(); // 72
        int sum =0;
        int i,j;


        if(a==1){
            return;
        }

        for(i=2; i<=a; i++){ // 1 ~ n 까지

                while(a%i==0){
                    System.out.println(i);
                    a = a/i;
                }
            }

        }




}