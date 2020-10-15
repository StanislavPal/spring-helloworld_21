import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(HelloWorld.getCount());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println(HelloWorld.getCount());

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMessage());
        System.out.println(Cat.getCount());

        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getMessage());
        System.out.println(Cat.getCount());

        System.out.println("bean1 == bean2 = " + (bean1 == bean2) );
        System.out.println("bean3 == bean4 = " + (bean3 == bean4) );
    }
}