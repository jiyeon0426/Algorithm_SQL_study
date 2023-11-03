import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());


        for(int i=0; i<n; i++){

            st = new StringTokenizer(bf.readLine());
            String command = st.nextToken(); // push, pop
            switch(command){
                case "push":
                    push(stack, Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(sizeStack()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }

        }
        System.out.println(sb);


    }

    public static void push(ArrayList<Integer> stack, int n){

        stack.add(n);
    }

    public static int pop(){

        if(stack.isEmpty()){
            return -1;
        }else{
            int top = stack.get( stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }
    }

    public static int sizeStack(){
        return stack.size();
    }

    public static int empty(){

        if(stack.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }

    public static int top(){

        if(stack.isEmpty()){
            return -1;
        }else{
            return stack.get(stack.size()-1);
        }

    }

}