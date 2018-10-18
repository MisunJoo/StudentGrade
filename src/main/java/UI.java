import java.util.List;
import java.util.Scanner;

public class UI {
    public void main(){
        System.out.println("번호를 선택하세요!! 1. 학생 등록 2. 학생 목록 보기 3. 종료 : ");
        Scanner stdIn = new Scanner(System.in);
        int choice = stdIn.nextInt();

        if(choice == 1){
            addStudent();
        }else if(choice == 2){
            listStudent();
        }else if(choice == 3) {
            end();
        }
    }

    /* 학생과 학생의 정보를 등록하면, 이를 DB에 등록 */
    public void addStudent(){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("이름 : ");
        Student student = new Student();

    stdIn.nextLine();

    }

    /* 학생의 목록을 출력 */
    public void listStudent(){

    }

    /* 프로그램 종료 */
    public void end(){

    }

}
