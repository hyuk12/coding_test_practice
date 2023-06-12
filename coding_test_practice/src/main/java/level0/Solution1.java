package level0;

import java.util.Scanner;

// 영어 알파벳으로 이루어진 문자열 a 를 대문자는 소문자로 소문자는 대문자로 변환


public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray = a.toCharArray();
        String answer = "";
        for(char c : charArray) {
            answer += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);

        }
        System.out.println(answer);
    }
}
