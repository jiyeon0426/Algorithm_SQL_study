import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String [] arr = new String[3];

        double sum=0;
        double cnt=0;

        for(int i=0; i<20; i++){
            String word = bf.readLine();
            arr = word.split(" "); // d, 3.0 , A+

            switch (arr[2]){
                case "A+":
                    sum += Double.parseDouble(arr[1])*4.5 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "A0":
                    sum += Double.parseDouble(arr[1])*4.0 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "B+":
                    sum += Double.parseDouble(arr[1])*3.5 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "B0":
                    sum += Double.parseDouble(arr[1])*3.0 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "C+":
                    sum += Double.parseDouble(arr[1])*2.5 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "C0":
                    sum += Double.parseDouble(arr[1])*2.0 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "D+":
                    sum += Double.parseDouble(arr[1])*1.5 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "D0":
                    sum += Double.parseDouble(arr[1]);
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "F":
                    sum += Double.parseDouble(arr[1])*0.0 ;
                    cnt += Double.parseDouble(arr[1]);
                    break;
                case "P":
                    break;
            }

        }

        System.out.print(sum/cnt);
    }
}
