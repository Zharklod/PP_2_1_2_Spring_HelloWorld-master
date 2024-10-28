import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat =
                (Cat) applicationContext.getBean("catBean");
        Cat cat2 =
                (Cat) applicationContext.getBean("catBean");
        System.out.println("Beans класса HelloWorld равны? " + (bean == bean2));
        System.out.println("Beans класса Cat равны? " + (cat == cat2));
        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(bean.getMessage());
        System.out.println(cat.getName());
    }
}