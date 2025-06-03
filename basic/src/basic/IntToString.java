package basic;

import java.security.Permission;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You are given an integer , you have to convert it into a string.
 *
 * Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 *
 *  can range between  to  inclusive.
 */
public class IntToString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
         scanner.close();
         String value=""+num;

        System.out.println(Integer.parseInt(value));
    }
}
