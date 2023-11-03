import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();


        int f0 =0;
        int f1 =1;

        int n = sc.nextInt();

        int fn=0;


        if(n>=2){
            for(int i=0; i<n-1; i++){

                fn = f0+f1;

                f0 = f1;

                f1 = fn;

            }
        }
        else if(n==0){
            fn=0;
        }
        else if(n==1) {
            fn=1;
        }


        System.out.print(fn);


    }


}