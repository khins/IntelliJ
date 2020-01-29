/*
 try...catch...finally exception-handling mechanism
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_04
 adds Stack unwinding and obtaining data from an exception object
 video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_05?autoplay=false
*/
public class UsingExceptions {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.err.println("Exception handled in main");
            e.printStackTrace();
            StackTraceElement[] traceElements = e.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }

//        doesNotThrowException();
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

    public static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception("exception in method3");
    }
}
