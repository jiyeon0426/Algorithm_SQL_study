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

        int n = sc.nextInt();
        int t=1;

        for(int i=0; i<n;i++){

            for(int k=n-i-1; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<= t; j++){
                System.out.print("*");
            }
            t+=2;


            System.out.println();

        }

    }

}