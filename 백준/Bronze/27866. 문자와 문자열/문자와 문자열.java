import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(str.charAt(n-1));
    }
}