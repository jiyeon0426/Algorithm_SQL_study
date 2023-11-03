import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> arr = new ArrayList<>();

        int n = Integer.parseInt(bf.readLine()); // 3 or 5

        int num=0;
        int je=1;
        int result=0;

        for(int i=0; i<n; i++){
           je = je*2;
           num = 1+je;

           result = num*num;
        }

        System.out.print(result);

    }

}