package puzzle;

public class Puzzle06 {

	public static void main(String[] args) {
		System.out.println((int)(char)(byte)-1);
		byte b = -1;
		char c = (char)b;
		int i = (int)c;
		// 0xFF : 비트마스크
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(Integer.toBinaryString(1024));
	}

}
