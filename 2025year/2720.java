import java.util.Scanner;

public class Main {
	
	public Main() {
		int CSize;
		Scanner scn = new Scanner(System.in);		
		CSize = scn.nextInt();
		
		int cent[] = new int[CSize];
		for(int i=0; i<CSize; i++) {
			cent[i] = scn.nextInt();		
		}

		for(int i=0; i<CSize; i++) {			
			int [] change = centCalculate(cent[i]);
			//System.out.println(change.length);
			for(int j=0; j<change.length; j++)
				System.out.print(change[j] + " ");
			System.out.println();
		}
		scn.close();
	}
	
	private int [] centCalculate(int c) {
		
		int change[] = {0,0,0,0};
		
		while(c>=25) {
			c-=25;
			change[0]++;
		}
		while(c>=10) {
			c-=10;
			change[1]++;
		}
		while(c>=5) {
			c-=5;
			change[2]++;
		}
		while(c>0) {
			c-=1;
			change[3]++;
		}
					
		return change;
	}

	public static void main(String[] args) {
		new Main();
	}

}
