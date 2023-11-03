import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        char [] arr = str.toCharArray(); // l j e s = n j a k
        int count=0;

        for(int i=0; i<arr.length; i++){
            count++;
            if(arr[i] == '=' || arr[i] == '-'){
                if(i>0 && (arr[i-1] == 'c'|| arr[i-1] == 'd'||arr[i-1] == 's')){
                    count --;
                }
                else if(i>0 && arr[i-1] == 'z'){
                    count--;
                    if(i>1 && arr[i-2] =='d'){
                        count--;
                    }
                }
            }
            else if (arr[i] == 'j'){
                if (i>0 && ( arr[i - 1] == 'n' || arr[i - 1] == 'l')) {
                    count--;
                }
            }
        }

        System.out.println(count);
    }
}
