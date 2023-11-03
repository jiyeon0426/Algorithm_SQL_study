import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Integer> arr = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t =sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        int n=0;
        for(int i=0; i<t; i++){


            String command = sc.next();

            switch(command) {
                case "push_front":
                    n = sc.nextInt();
                    push_front(n);
                    break;
                case "push_back":
                    n = sc.nextInt();
                    push_back(n);
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }

        }
        System.out.println(sb);
    }


    public static void push_front(int x){
        arr.addFirst(x);
    }

    public static void push_back(int x){
        arr.addLast(x);
    }

    public static int pop_front() {

        int result=0;
        if (arr.isEmpty()) {
            return -1;
        }
        result =  arr.getFirst();
        arr.removeFirst();
        return result;
    }

    public static int pop_back(){
        int result=0;
        if (arr.isEmpty()) {
            return -1;
        }
        result =  arr.getLast();
        arr.removeLast();
        return result;
    }

    public static int size(){

        return arr.size();
    }

    public static int empty(){
        int result=0;
        if(arr.isEmpty()){
            result= 1;
        }
        return result;
    }

    public static int front(){

        int result = 0;

        if(arr.isEmpty()){
            result = -1;
        }else{
            result = arr.getFirst();
        }

        return result;
    }

    public static int back(){
        int result = 0;

        if(arr.isEmpty()){
            result = -1;
        }else{
            result = arr.getLast();
        }

        return result;
    }


}
