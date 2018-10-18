public class MainController {
    UI ui;
    StudentDAO studentDAO;

    public void setUi(UI ui) {
        this.ui = ui;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void control(){
        int choice = ui.main();
        System.out.println("choice: " + choice);
        if (choice == 1){
            studentDAO.add(ui.addStudent());
        }else if (choice == 2){
            ui.listStudent(studentDAO.getList());
        }else if (choice == 3){
            ui.end();
        }else{
            System.out.println("잘못된 값을 입력하셨습니다.^~^");
            return ;
        }
    }
}
