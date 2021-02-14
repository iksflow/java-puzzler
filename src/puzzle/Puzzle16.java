package puzzle;

public class Puzzle16 {
    public static void main(String[] args) {
        // Note: \u000A is Unicode representation of linefeed(LF)
        // 주석의 u000a가 개행문자라 발생하는 오류. 문장을 다 해석하기 전에 개행시켜버려서 오류가 발생한다.
        char c = 0x000A;
        System.out.println(c);
    }
}
