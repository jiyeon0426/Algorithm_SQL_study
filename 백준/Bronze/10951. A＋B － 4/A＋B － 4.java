import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        while((str = bf.readLine()) != null){
            st = new StringTokenizer(str, " ");

            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());

            br.write((a+b)+"\n");
        }
        br.close();
    }
}
