/*
 Chained exceptions
 https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson11_06
*/
public class UsingChainedExceptions {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("exception thrown in method1");
        }
    }

    private static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("exception thrown in method2");
        }
    }

    private static void method3() throws Exception {
        throw new Exception("Exception in method3");
    }
}
