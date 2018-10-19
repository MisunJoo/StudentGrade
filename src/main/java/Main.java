import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ******** 학생관리 프로그램 시작 ********");
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(StudentConfig.class);
        MainController mainController = applicationContext.getBean(MainController.class);
        mainController.control();
    }
}
