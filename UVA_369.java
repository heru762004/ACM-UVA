import java.math.BigInteger;
import java.util.Scanner;


public class UVA_369 {
	public static void main(String[] args) {
		String factorial[] = new String[100];
		Scanner cin = new Scanner(System.in);
		while(true) {
			int N = cin.nextInt();
			int M = cin.nextInt();
			if(M == 0 && N == 0) break;
			int X = N - M;
			BigInteger result = new BigInteger("1");
			if(X >= M) {
				for(int i=N; i > X;i--) {
					BigInteger a = new BigInteger(i+"");
					result = result.multiply(a);
				}
				BigInteger x = new BigInteger("1");
				if(factorial[M-1] == null || factorial[M-1].length() == 0) {
					for(int i=2; i <=M ; i++) {
						BigInteger a = new BigInteger(i+"");
						x = x.multiply(a);
					}
					factorial[M-1] = x.toString();
				} else {
					x = new BigInteger(factorial[M-1]);
				}
				result = result.divide(x);
			}
			else if(X > 0 && X < M) {
				for(int i=N; i > M;i--) {
					BigInteger a = new BigInteger(i+"");
					result = result.multiply(a);
				}
				BigInteger x = new BigInteger("1");
				if(factorial[X-1] == null || factorial[X-1].length() == 0) {
					for(int i=2; i <=X ; i++) {
						BigInteger a = new BigInteger(i+"");
						x = x.multiply(a);
					}
					factorial[X-1] = x.toString();
				} else {
					x = new BigInteger(factorial[X-1]);
				}
				result = result.divide(x);
			}
			else if(X == 0) {
				result = new BigInteger("1");
			}
			System.out.println(N+" things taken "+M+" at a time is "+result.toString()+" exactly.");
		}
	}

}
