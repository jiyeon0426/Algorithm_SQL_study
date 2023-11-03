import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();


        st = new StringTokenizer(bf.readLine());

        while(st.hasMoreTokens()){
            arr.add(Integer.valueOf(st.nextToken()));
        }

        Collections.sort(arr);

        int index = arr.size()/2;

        System.out.println(arr.get(index));


    }


}