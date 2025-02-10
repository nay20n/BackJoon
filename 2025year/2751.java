import java.io.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter wf = new BufferedWriter(new OutputStreamWriter(System.out));
       int N = Integer.parseInt(bf.readLine());
       List<Integer> arr = new ArrayList<>();
       for(int i=0;i<N;i++){
           int num = Integer.parseInt(bf.readLine());
           arr.add(num);
       }
       Collections.sort(arr);
        for (int number : arr) {
            wf.write(number + "\n");
        }
        bf.close();
        wf.flush();
        wf.close();
    }
}

