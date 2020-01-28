import java.util.InputMismatchException;
import java.util.Scanner;
/*
 Integer division without exception handling
 video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_01
 Handling ArithmeticExceptions and InputMismatchExceptions
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_02
*/
public class DivideByZeroNoExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("enter numerator: ");
                int denomintaor = scanner.nextInt();
                System.out.print("enter denomintaor: ");
                int numerator = scanner.nextInt();
                int result = quotient(numerator,denomintaor);
                System.out.printf("%nResult: %d / %d = %d%n",numerator, denomintaor, result);
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                scanner.nextLine();
                System.out.println("enter integers");
            } catch (ArithmeticException e)
            {
                System.err.printf("%nException: %s%n", e);
                scanner.nextLine();
                System.out.println("invalid denomintaor ");

            }
        } while (continueLoop);

    }

    public static int quotient(int numerator, int denomintaor)
    throws ArithmeticException {
        return  numerator / denomintaor;
    }
}
