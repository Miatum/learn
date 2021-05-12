package base01;

/**
 * @Description
 * @ClassName Exceptions
 * @Author Miatum
 * @date 2021.03.25 22:55
 */
public class Exceptions extends Exception {
    // throws
    public void throwsException() throws Exception {

    }
    // throws
    public void throwException() throws Exception{
        throw new Exception();
    }
    // try/catch/finally
    public void catchException() {
        try {

        } catch (Exception e) {
            e.getMessage();
            e.getCause();
            e.toString();
            e.printStackTrace();
            e.getStackTrace();
            e.fillInStackTrace();
        } finally {
            System.out.println("无论是否产生异常，finally中的语句始终会被执行");
        }
    }
}
