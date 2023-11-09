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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n=0;
        int sum = 0;
        int result =0; // 결과

        ArrayList<Integer> sum_group = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), "-"); // - 기준으로 string 나눔


        while(st.hasMoreTokens()){

            String str = st.nextToken(); // 1+2+3  or 4+5
            sum=0;

            String []group= str.split("\\+"); //+ 기준으로 분리

            for(int i=0; i<group.length; i++){
                sum += Integer.parseInt(group[i]);
            }
            sum_group.add(sum);

        }


        for(int i=0; i<sum_group.size(); i++){
            if(i==0){
                result += sum_group.get(i);
                continue;
            }
            result -= sum_group.get(i);
        }

        System.out.println(result);
    }
}

