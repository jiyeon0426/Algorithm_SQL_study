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

        String str = sc.nextLine();

        String[] num = str.split("[+-]");
        String[] operands = new String[num.length-1];

        int n=0;
        int sum = 0; //합계

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '+' || str.charAt(i)=='-'){
                operands[n] = String.valueOf(str.charAt(i));
                n++;
            }
        }


        for(int i=0; i<operands.length; i++){
            if(operands[i].equals("-")){ // - 뒤에는 전부 -로 치환

                int j = i+1;
                while(j < operands.length && operands[j].equals("+")){
                    operands[j] ="-";
                    j++;
                }
            }
        }

        sum = Integer.parseInt(num[0]);
        for (int i = 0; i < operands.length; i++) {
            if (operands[i].equals("+")) {
                sum += Integer.parseInt(num[i + 1]);
            } else if (operands[i].equals("-")) {
                sum -= Integer.parseInt(num[i + 1]);
            }
        }

        System.out.println(sum);
    }
}

