import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int n = Integer.parseInt(bf.readLine());

        int j=1;

        for(int i=0; i<n; i++){
            int k;
            int l;
            for(k = n-j; k>0; k--){ //5 - 1
                br.write(" ");
            }
            for(l = 0; l< j; l++){
                br.write("*");
            }
            j++;
            br.write("\n");
        }
        br.close();
    }
}