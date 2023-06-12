package level0;

import java.util.Scanner;

// 한번에주어지는 문자열을 새로방향으로 char형식으로 나열
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] chars = a.toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
