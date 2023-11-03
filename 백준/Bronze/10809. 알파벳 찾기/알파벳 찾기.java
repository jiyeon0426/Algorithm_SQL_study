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

        String str = sc.next(); // 문자 입력 받기 54321

        int n = str.length();
        int ch;


        //26에서 0 번째 97
        // 97 - 97 인덱스

        int [] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }

        int num=0;

        for(int i=n-1; i>=0; i--){
            ch = str.charAt(i);
            int tmp = Math.abs(97-ch);
            arr[tmp] = i;

            if(!(arr[tmp] > i))
                continue;
            // num += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}