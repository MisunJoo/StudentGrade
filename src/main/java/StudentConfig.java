import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public UI ui(){
        System.out.println("Ui Bean 생성");
        return new UI();
    }

    @Bean
    public StudentDAO studentDAO(){
        System.out.println("Student Dao Bean 생성");
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.setJdbcDriver("com.mysql.cj.jdbc.Driver");
        studentDAO.setDbUrl("jdbc:mysql://localhost:3306/fcdb?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
        studentDAO.setDbUser("fcuser");
        studentDAO.setDbPassword("fc123");
        return studentDAO;
    }

    @Bean
    public MainController mainController(){
        MainController mainController = new MainController();
        mainController.setUi(ui());
        mainController.setStudentDAO(studentDAO());
        return mainController;
    }

}
