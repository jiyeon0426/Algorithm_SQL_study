import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++) {
            for (int j = 0; j <= i; j++) {
                    br.write("*");
            }
            br.write("\n");
        }
        br.close();
    }
}