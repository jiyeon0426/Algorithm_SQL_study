import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Integer> arr = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){

            if(i>0 && i%10==0){
                sb.append("\n");
            }
            sb.append(str.charAt(i));

        }


        System.out.print(sb);
    }

}