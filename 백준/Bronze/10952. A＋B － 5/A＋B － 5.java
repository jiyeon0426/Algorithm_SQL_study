import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(bf.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if(sum==0){
                break;
            }
            br.write(sum+"\n");
        }
        br.close();
    }
}