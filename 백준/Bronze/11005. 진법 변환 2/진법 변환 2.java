import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        String digit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        st = new StringTokenizer(bf.readLine());

        //String n = st.nextToken(); // ZZZZZ
        int n = Integer.parseInt(st.nextToken()); // 696986932
        int b = Integer.parseInt(st.nextToken()); // 36

        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.insert(0, digit.charAt(n%b)); //나머지

            n = n/b;

        }

        System.out.println(sb);

    }
}