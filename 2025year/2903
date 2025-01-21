import java.util.Scanner;

public class Main {
	
	public Main() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n1 = cal(n);
		n1 = n1*n1;
		System.out.println(n1);
	}
	
	public int cal(int n) {
		if(n==0)
			return 2;
		else
			return (cal(n-1) + (int)Math.pow(2, n-1));
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
