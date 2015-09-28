import java.util.Scanner;


public class UVA_673 {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.nextLine();
		for(int i=0; i < n ; i++) {
			String input = cin.nextLine();
			int sum = 0;
			int sum1 = 0;
			int sum2 = 0;
			int failed = 0;
//			System.out.println("input = "+input);
			if(input.length() == 0) {
				System.out.println("Yes");
			} else {
				for(int j=0; j < input.length(); j++) {
					char a = input.charAt(j);
					if(a == '(') {
						sum += 1;
						sum1 += 1;
					} else if(a == ')') {
						sum -= 1;
						sum1 -= 1;
					} else if(a == '[') {
						sum += 2;
						sum2 += 1;
					} else if(a == ']') {
						sum -= 2;
						sum2 -= 1;
					}
					if(sum1 < 0 || sum2 < 0) {
						failed = 1;
						break;
					}
					if(a == ')' && input.charAt(j-1) == '[') {
						failed = 1;
						break;
					}
					if(a == ']' && input.charAt(j-1) == '(') {
						failed = 1;
						break;
					}
				}
				
				if(sum != 0) {
					System.out.println("No");
				} else {
					if(failed == 1) {
						System.out.println("No");
					} else {
						System.out.println("Yes");
					}
				}
			}
		}
	}

}
