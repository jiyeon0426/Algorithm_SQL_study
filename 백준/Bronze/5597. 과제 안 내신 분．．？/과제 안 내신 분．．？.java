import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List <Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<30; i++){
            result.add(i+1);
        }

        for(int j=0; j<28; j++) {
            String str = sc.nextLine();
            result.remove(Integer.valueOf(str));
        }
        System.out.println(result.get(0));
        System.out.println(result.get(1));
    }
}