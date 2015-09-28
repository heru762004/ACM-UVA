import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;


public class UVA_486 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("negative", "-");
		map.put("zero", "0");
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		map.put("ten", "10");
		map.put("eleven", "11");
		map.put("twelve", "12");
		map.put("thirteen", "13");
		map.put("fourteen", "14");
		map.put("fifteen", "15");
		map.put("sixteen", "16");
		map.put("seventeen", "17");
		map.put("eighteen", "18");
		map.put("nineteen", "19");
		map.put("twenty", "20");
		map.put("thirty", "30");
		map.put("forty", "40");
		map.put("fifty", "50");
		map.put("sixty", "60");
		map.put("seventy", "70");
		map.put("eighty", "80");
		map.put("ninety", "90");
		map.put("hundred", "100");
		map.put("thousand", "1000");
		map.put("million", "1000000");
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextLine()) {
			String input = cin.nextLine();
			String splitStr[] = input.split(" ");
			BigInteger result = new BigInteger("0");
			BigInteger temp = new BigInteger("0");
			String sign ="";
			int status = 0;
			for(int i=0; i < splitStr.length; i++) {
				if(splitStr[i].equalsIgnoreCase("hundred") || splitStr[i].equalsIgnoreCase("thousand") || splitStr[i].equalsIgnoreCase("million")) {
					temp = temp.multiply(new BigInteger(map.get(splitStr[i])));
					for(int j=i+1; j < splitStr.length; j++) {
						if(map.get(splitStr[i]).length() < map.get(splitStr[j]).length()) {
							status = 1; break;
						}
					}
					if(status == 0) {
						result = result.add(temp);
						temp = BigInteger.ZERO;
					}
					status = 0;
				} else if(splitStr[i].equalsIgnoreCase("negative")) {
					sign = "-";
				} else {
					temp = temp.add(new BigInteger(map.get(splitStr[i])));
				}
			}
			result = result.add(temp);
			System.out.println(sign+result.toString());
		}
	}
}
