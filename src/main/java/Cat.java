import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(value = "prototype")
public class Cat {
    private static int count;
    private String message;

    public Cat() {
        System.out.println("Cat constructor");
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
