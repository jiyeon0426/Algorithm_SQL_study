import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine()); // 5
        int m=0;

        for(int i=0; i<n; i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }

            for(int k = 2*(n-i)-1; k >0; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
