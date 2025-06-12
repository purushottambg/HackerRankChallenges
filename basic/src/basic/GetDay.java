package basic;
import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 *
 * Example
 *
 *
 *
 * The method should return  as the day on that date.
 */


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDateTime localDateTime = LocalDateTime.of(year, month, day,0,0,0,0);
        DayOfWeek dayOfWeek = LocalDate.of(year, month, day).getDayOfWeek();
        return String.valueOf(dayOfWeek);
    }

}

public class GetDay {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month day and then year:");
        int month = scanner.nextInt();

        int day = scanner.nextInt();

        int year = scanner.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res);

    }
}

