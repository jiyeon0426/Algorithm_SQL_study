import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder result= new StringBuilder();

        for(int i=0; i<n; i++){
            String str = sc.next();

            result.append(str.charAt(0));
            result.append(str.charAt(str.length() - 1));

            result.append("\n");
        }

        System.out.print(result);
    }
}