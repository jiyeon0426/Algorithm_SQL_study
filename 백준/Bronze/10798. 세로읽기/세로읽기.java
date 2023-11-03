import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        Character arr[][] = new Character[5][15];

        StringBuilder sb = new StringBuilder();


        int max=0;

        String line = "";

        for(int i=0; i<5; i++){
            line = sc.nextLine();
            if(max < line.length())
                max = line.length();

            for(int j=0; j<line.length(); j++){
                arr[i][j] = line.charAt(j);
            }
        }

        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){

                if(arr[j][i] ==null)
                    continue;
                sb.append(arr[j][i]);
            }

        }

        System.out.println(sb);
    }
}
