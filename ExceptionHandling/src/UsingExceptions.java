/*
 try...catch...finally exception-handling mechanism
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_04
*/
public class UsingExceptions {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.err.println("Exception handled in main");
        }

        doesNotThrowException();
    }

    private static void doesNotThrowException() {
        try {
            System.out.println("method does not throw exception");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.err.println("finally executed");
        }
        System.out.println("EOFM doesNotThrowException");
    }

    private static void throwException() throws Exception {
        try {
            System.out.println("Method Exception");
            throw new Exception();
        } catch (Exception e) {
            System.err.println("Exception handled in throwException");
            throw e;
        } finally {
            System.err.println("Finally executed");
        }
    }
}
