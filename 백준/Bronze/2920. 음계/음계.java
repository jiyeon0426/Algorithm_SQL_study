import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        String type="";

        int next = Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()){
            int n= Integer.parseInt(st.nextToken());
            if( (next+1) == n){
                type="ascending";
            }else if( (next-1) == n){
                type="descending";
            }else{
                type="mixed";
                break;
            }

            next= n;
        }

        System.out.println(type);

    }
}
