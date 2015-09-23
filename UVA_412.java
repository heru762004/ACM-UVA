import java.util.Scanner;


public class UVA_412 {
	
	public static int gcd(int a, int b) {
		int r = a%b;
	    while (r > 0) {
	        a = b;
	        b = r;
	        r = a%b;
	    }
	    return b;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true) {
			int n = cin.nextInt();
			if(n == 0) break;
			int data[] = new int[n];
			int N = 0;
			int M = 0;
			for(int i=0; i < n ;i++) {
				data[i] = cin.nextInt();
				for(int j=0; j < i; j++) {
					int gf = 0;
					gf = gcd(data[i], data[j]);
					if(gf == 1) {
						N++;
					}
					M++;
				}
			}
			
			if(N > 0) {
				double nF = Double.parseDouble(M+"");
				double NF = Double.parseDouble(N+"");
				double phi = (double) Math.sqrt( (double)((6.00 * (nF * 1.0)) / NF));
				System.out.printf("%.6f\n",phi);
			} else {
				System.out.println("No estimate for this data set.");
			}
		}
	}
}
