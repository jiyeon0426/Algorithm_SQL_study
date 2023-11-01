import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Integer> arr = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int i=0;
        int j=0;
        int k=0;


        int n = sc.nextInt();


        for( i=0; i<n-1; i++){
            for(k=0; k<i;k++){
                System.out.print(" ");
            }
            for(j=0; j<2*n-2*k-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for( i=1; i<=n; i++){

            for( j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for( j= 0; j<i*2-1; j++){
                System.out.print("*");
            }

            System.out.println();

        }


    }

}