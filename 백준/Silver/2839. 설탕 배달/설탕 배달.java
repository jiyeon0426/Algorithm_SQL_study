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
        int count=0;

        while(n>0){
            if(n%5==0){
                count += n/5;
                n=0;
            }else{
                n -= 3;
                count++;
            }
        }
        
        if(n<0){
            count= -1;
        }

        System.out.println(count);


    }
}

