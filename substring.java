import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name:");
        String s1 = scan.nextLine();
        System.out.println("Enter the name:");
        String s2 = scan.nextLine();
        int index = s1.indexOf(s2);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }

    }

}
