import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        * 입력받은 두 수 뒤집어서 배열에 넣어놓기
        * max 값 반환하기.
        * */

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(bf.readLine());
        String str1;
        String str2;
        str1 = st.nextToken(); // 453
        str2 = st.nextToken(); // 123


        String [] answer = {"",""};
        String result="";

        for(int i =2; i>=0; i--){
            answer[0] += str1.charAt(i);
            answer[1] += str2.charAt(i);
        }

        System.out.println(Math.max(Integer.parseInt(answer[0]),Integer.parseInt(answer[1])));
    }
}