
import java.util.*;

public class Main {
    private Scanner sc = new Scanner(System.in);
    private String text[];
    private int index;

    public Main() {
        scanText();
        for(index = 0; index < text.length; index++) {
            compare(index);
        }

    }
    private void compare(int i){
        Stack stack = new Stack();
        for(char c : text[i].toCharArray()){
            stack.push(c);
        }
        stack.resultPrint();
    }
    private void scanText(){
        int T = sc.nextInt();
        sc.nextLine();

        text = new String[T];
        for(int i = 0; i < T; i++){text[i] = sc.nextLine();}
    }

    private class Stack{
        private char arr[] = new char[50];
        private int top = 0;

        private boolean empty() {
            return top == 0;  // 스택이 비었으면 true 반환
        }

        protected void push(char c) {
            if (c == ')') {
                if (top > 0 && arr[top - 1] == '(') {
                    pop();
                } else {
                    arr[top++] = c;                 }
            } else {
                arr[top++] = c;
            }
        }

        private void pop(){
            if(empty()) {
                System.out.println("자리부족");
                return;
            }

            arr[top--] = '\0';
        }

        protected void resultPrint(){
            if(top == 0) System.out.println("YES");
            else System.out.println("NO");
            Arrays.fill(arr, '\0');
        }
    }

    public static void main(String[] args){
        new Main();
    }
}

