import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class UVA_10763 {
	
	public static void main(String[] args) {
		Vector <String> arrayOrigin = new Vector<String>();
		Vector <String> arrayDest = new Vector<String>();
		Scanner cin = new Scanner(System.in);
		while(true) {
			arrayOrigin.removeAllElements();
			arrayDest.removeAllElements();
			int n = cin.nextInt();
			if(n==0) break;
			for(int i=0; i < n; i++) {
				String in = cin.next();
				String in2 = cin.next();
				arrayOrigin.add(in);
				arrayDest.add(in2);
			}
			Collections.sort(arrayOrigin);
			Collections.sort(arrayDest);
			if(arrayOrigin.toString().equals(arrayDest.toString())) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
