package CodingPractice;

public class p12903 {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 != 0) {
            answer = s.charAt(s.length() / 2) + "";
        } else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        return answer;
    }
}