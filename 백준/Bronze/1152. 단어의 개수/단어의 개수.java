import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        * 소문자 a 의 아스키코드
        * 배열의 갯수 만큼 for문
        * 배열의 n번째에 위치한 단어 charAt하고 for문 아스키코드만큼 반복
        * n의 최솟값을 넣되,
        *
        * */

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(bf.readLine());
        int n=0;

        while(st.hasMoreTokens()){
            st.nextToken();
            n++;
        }

        System.out.println(n);
    }
}