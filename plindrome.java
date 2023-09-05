public class s1 {
    static boolean Palindrome(String s, String t) {
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        if (s.equals(t)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "level";
        String t = "";
        System.out.println(Palindrome(s, t));
    }
}