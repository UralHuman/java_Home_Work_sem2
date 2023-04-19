import java.util.Arrays;

public class zadacha_2_sem_2 {
    public static String shuffleString(String s, int[] index) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[index[i]] = s.charAt(i);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String s = "abcde";
        int[] index = {4, 3, 2, 1, 0};
        String result = shuffleString(s, index);
        System.out.println(result); // "edcba"
    }
}
