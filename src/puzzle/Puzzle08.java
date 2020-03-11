package puzzle;

/*
 * 자료형 혼합의 위험성
 */
public class Puzzle08 {

	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.print(true ? x : 0);		// 'X'
		System.out.print(false ? i : x);	// 'X' result : 88
		
	
	}

}
