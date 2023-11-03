import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        ArrayList<Integer> arr2 = new ArrayList<>();


        for(int i=0; i<n; i++){
            arr2.add(sc.nextInt());
        }

        Collections.sort(arr2);
        
        for(int i=0; i<n; i++){
            System.out.println(arr2.get(i));
        }

    }

}