package basic;

import java.util.Scanner;

/**
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
 *
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 *
 * To get you started, a portion of the solution is provided for you in the editor.
 *
 * Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 *
 * Input Format
 *
 * The first line contains an integer, , denoting the number of test cases.
 * Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.
 *
 * Output Format
 *
 * For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:
 */



public class DataTypeIdentification {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);
        Long t = sc.nextLong();
        for (Long i = Long.valueOf(0); i < t; i++) {
            {
                /**
                 * Range of the numeric data types
                 * byte 1 byte -128 to 127.
                 * short 2 bytes -32,768 to 32,767.
                 * int 4 bytes -2,147,483,648 to 2,147,483,647.
                 * long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80.
                 * float 4 bytes 7 decimal digits.
                 * double 8 bytes 16 decimal digits.
                 */
                try {
                    long x = sc.nextLong();
                    System.out.println(x + " can be fitted in:");
                    if (x >= -128 && x <= 127) System.out.println("* byte");
                    if (x >= -32768 && x <= 32767) System.out.println("* short");
                    if (x >= -2147483648 && x <= 2147483647) System.out.println("* int");
                    if (x > 2147483647) System.out.println("* Long");
                    else System.out.println("No condition matched");
                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }

            }
        }
    }
}
