public class HelloWorld {
    private static int count;

    private String message;
 
    public HelloWorld() {
        System.out.println("HelloWorld constructor");
        count++;
    }

    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

    public static int getCount() {
        return count;
    }
}