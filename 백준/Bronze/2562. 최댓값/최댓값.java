import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        List <Integer> list = new ArrayList<>();

        int max = 0;
        int count =0;

        for(int i=0; i<9; i++) {
            list.add(sc.nextInt());

            if(max < list.get(i)){
                max = list.get(i);
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count+1);
    }
}