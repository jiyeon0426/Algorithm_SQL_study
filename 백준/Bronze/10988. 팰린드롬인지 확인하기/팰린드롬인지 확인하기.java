import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        * 앞과 뒤 각각 비교
        * */

        String str = bf.readLine();

        int answer=1;

        /*
        for(int i=0; i< str.length(); i++){
            int last = str.charAt()

        }

         */


        int firstIndex = 0;
        int lastIndex = str.length()-1;

        String first;
        String last;

        while(firstIndex < lastIndex){
            first = String.valueOf(str.charAt(firstIndex));
            last = String.valueOf(str.charAt(lastIndex));

            if( ! first.equals(last)){
                answer = 0;
                break;
            }


            firstIndex++;
            lastIndex--;
        }

        System.out.println(answer);
    }
}
