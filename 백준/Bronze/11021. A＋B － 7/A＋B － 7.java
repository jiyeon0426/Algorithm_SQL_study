import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int n = Integer.parseInt(bf.readLine());

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(bf.readLine());

            br.write("Case #"+i+ ": "+ (Integer.parseInt(st.nextToken()) +Integer.parseInt(st.nextToken()))+"\n");
        }
        br.close();
    }
}
