import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        int cnt=0;

        int n =  Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine()); //배열 입력받음.
        str = bf.readLine();

        for(int i=0; i<n; i++){
            if(st.nextToken().equals(str)){ //문자열은 equals로 비교
                cnt++;
            }
        }

        System.out.println(cnt);
        //br.write(cnt);
        br.close();

    }
}
