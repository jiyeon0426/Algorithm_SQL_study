import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.lang.CharSequence.compare;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i=0; i<n; i++){

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            for(int k=0; k< (2*n)-(2*i)-2; k++){
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }


        for(int i=1; i<n; i++){

            for(int k=0; k<n-i; k++){
                System.out.print("*");
            }

            for(int j=0; j<=2*i-1; j++){
                System.out.print(" ");
            }

            for(int k=0; k<n-i; k++){
                System.out.print("*");
            }

            System.out.println();

        }



    }
}

