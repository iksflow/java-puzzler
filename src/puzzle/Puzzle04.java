package puzzle;

public class Puzzle04 {
	public static void main(String[] args) {
		/* 대충 보면 66666 이라는 결과를 출력할 것 같지만
		 * 두번째 숫자인 5432l은 숫자 '1'이 아닌 알파벳 'l'이다.
		 * 따라서 long타입 5432라는 숫자가 되어버리게 되고 17777이라는 연산결과를 얻게 된다.
		 * 오타로 인해 충분히 발생할 수 있는 문제이며 특정 폰트에서는 분간하기가 더더욱 어렵다.
		 * long타입을 표현하고자 할 때는 대문자 'L'을 사용해서 혼동을 줄이는게 좋다는 부분을 시사하고 있다. 
		 * */
		System.out.println(12345 + 5432l);	// bad
		System.out.println(12345 + 5432L);	// good
		
		
	}
}
