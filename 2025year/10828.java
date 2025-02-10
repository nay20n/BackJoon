import java.awt.*;
import java.util.*;

public class Main {
    private int size;
    private int arr[];
    public Main(int capacity) {
        size = 0;
        arr = new int[capacity];
    }
    public void push(int x){
        if (size >= arr.length) {System.out.println("배열 초과"); return;}
        arr[size++] = x;
    }
    public int pop(){
        if(empty()==1) return -1;
        return arr[--size];
    }
    public int size(){
        return size;
    }
    public int empty(){
       if(size==0) return 1;
       return 0;
    }
    public int top(){
        if(empty()==1) return -1;
        return arr[size-1];
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
        sc.nextLine();
       Main m = new Main(N);

       for(int i=1; i<=N; i++){
           String command = sc.next();
           if(command.equals("push")){
                int num =  sc.nextInt();
                m.push(num);
           }
           else if(command.equals("pop")){
                System.out.println(m.pop());
           }
           else if(command.equals("size")){
               System.out.println(m.size());
           }
           else if(command.equals("empty")){
                System.out.println(m.empty());
           }
           else if(command.equals("top")){
               System.out.println(m.top());
           }
       }
    }
}

