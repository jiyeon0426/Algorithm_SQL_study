import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        * 알파벳 순서대로 3씩 쪼개서 배열에 넣기.
        * 해당하는 알파벳이 있는 배열의 인덱스 + 1 을 sum에 합하기
        * */

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        String []phone = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"}; // 2~9

        String str = bf.readLine(); // WA

        int sum =0;

        for(int i=0; i<str.length(); i++){
            String current = String.valueOf(str.charAt(i)); // W

            for(int j=0; j<phone.length; j++){ //배열 크기 만큼 반복
                for(int k=0; k<phone[j].length(); k++){ // 배열각 요소의 길이 만큼 반복
                    String temp = String.valueOf(phone[j].charAt(k));
                    if(current.equals(temp)){
                        sum+= j+3;
                    }
                }
            }

        }

        System.out.println(sum);
    }
}