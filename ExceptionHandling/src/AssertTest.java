/*
Checking with assert that a value is within range
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_08
*/

import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 0 and 10");
        int number = scanner.nextInt();
        // asserts are used for debugging purposes
        assert (number >= 0 && number <= 10) : "bad number: " + number;
        System.out.printf("You entered %d%n", number);
    }
}
