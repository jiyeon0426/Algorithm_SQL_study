import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.lang.CharSequence.compare;

public class Main {

    public static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());


//        long max = Math.max(a,b);
//        long min = Math.min(a,b);

        n = GCD(a,b);


        for(long i=0; i< n; i++){
            sb.append("1");
        }

        System.out.print(sb);

    }
}

