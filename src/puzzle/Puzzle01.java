package puzzle;

public class Puzzle01 {

	public static void main(String[] args) {
		System.out.println(isOdd(-3));
		System.out.println(isOdd2(-3));
		System.out.println(isOdd3(-3));
		String binaryTxt1 = binaryFormatter(9);
		String binaryTxt2 = binaryFormatter(1);
		System.out.println(spliter(binaryTxt1, 4, " "));
		System.out.println(spliter(binaryTxt2, 4, " "));
		System.out.println(9 & 1);
		System.out.println(isOdd4(9));
	}
	
	public static boolean isOdd(int i) {
		return i % 2 == 1; 
	}
	
	public static boolean isOdd2(int i) {
		return (i % 2 == 1 || i % 2 == -1); 
	}
	
	public static boolean isOdd3(int i) {
		return i % 2 != 0; 
	}

	public static boolean isOdd4(int i) {
		return (i & 1) != 0; 
	}
	
	public static String spliter(String s, int len, String delimiter) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int count = sb.length() - len;
		while(0 < count) {
			sb.insert(count, delimiter);
			count = count - len;
		}
		sb.reverse();
		return sb.toString();
	}
	
	public static String binaryFormatter(int number) {
		return String.format("%32s", Integer.toBinaryString(number)).replace(" ", "0");
	}
}
