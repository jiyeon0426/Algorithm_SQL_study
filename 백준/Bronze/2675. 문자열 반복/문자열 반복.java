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

        int n = Integer.parseInt(bf.readLine());// 입력 값 갯수

        String [] result = new String[n];

        for(int i=0; i<n; i++){
            String str = bf.readLine(); // 반복할 횟수, 문자열
            st = new StringTokenizer(str);


            int num = Integer.parseInt(st.nextToken()); //3
            String str2 = st.nextToken(); //ABC

            String nnn = "";
            for(int j =0; j<str2.length(); j++){

                for(int k=0; k<num; k++){
                    nnn += String.valueOf(str2.charAt(j));
                }
            }
            result[i] =nnn;
        }

        for(int i=0; i<n; i++)
            System.out.println(result[i]);
    }
}