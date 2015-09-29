import java.util.Scanner;


public class UVA_10279 {
	public static void main(String[] args) {
		int map[][];
		char result[][];
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while((n--) > 0) {
			int size = cin.nextInt();
			map = new int[size][size];
			result = new char[size][size];
			cin.nextLine();
			for(int i=0; i < size; i++) {
				String input = cin.nextLine();
				for(int j=0; j < input.length(); j++) {
					if(input.charAt(j) == '.') {
						map[j][i] = 0;
					} else if(input.charAt(j) == '*') {
						map[j][i] = 1;
					}
				}
			}
			
			int status = 0;
			for(int i=0; i < size; i++) {
				String input = cin.nextLine();
				for(int j=0; j < input.length(); j++) {
					int sum = 0;
					if(map[j][i] == 1) {
						if(input.charAt(j) == 'x') {
							status = 1;
						}
						result[j][i] = '*';
					} else {
						if(input.charAt(j) == 'x') {
							if(j-1 >= 0) if(map[j-1][i] == 1) sum++;
							if(j-1 >= 0 && i-1 >= 0) if(map[j-1][i-1] == 1) sum++;
							if(j-1 >= 0 && i+1 < size) if(map[j-1][i+1] == 1) sum++;
							if(j+1 < size) if(map[j+1][i] == 1) sum++;
							if(j+1 < size && i-1 >= 0) if(map[j+1][i-1] == 1) sum++;
							if(j+1 < size && i+1 < size) if(map[j+1][i+1] == 1) sum++;
							if(i-1 >= 0) if(map[j][i-1] == 1) sum++;
							if(i+1 < size) if(map[j][i+1] == 1) sum++;
							result[j][i] = (char)('0'+sum);
						} else {
							result[j][i] = '.';
						}
					}
				}
			}
			for(int i=0; i < size; i++) {
				for(int j=0; j < size; j++) {
					if(status == 1) {
						System.out.print(result[j][i]);
					} else if(status == 0) {
						if(result[j][i] == '*') {
							System.out.print('.');
						} else {
							System.out.print(result[j][i]);
						}
					}
				}
				System.out.println();
			}
			if(n > 0) System.out.println();
		}
	}
}
