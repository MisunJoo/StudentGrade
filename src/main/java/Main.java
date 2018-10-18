import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ******** 학생관리 프로그램 시작 ********");
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("student.xml");
        MainController mainController = applicationContext.getBean(MainController.class);
        mainController.control();
    }
}
