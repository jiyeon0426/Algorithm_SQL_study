import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringTokenizer arr;
        

        st = new StringTokenizer(bf.readLine()); //10 5.

        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());


        List <Integer> list = new ArrayList<>();

        arr = new StringTokenizer(bf.readLine());

        for(int i=0; i<n; i++){
            int result = Integer.parseInt(arr.nextToken());
            if(num > result){ //문자열은 equals로 비교
                list.add(result);
            }
        }


        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        //System.out.println(cnt);
        br.flush();
        br.close();

    }
}
