import java.util.List;
import java.util.Scanner;

public class UI {
    public int main(){
        System.out.println("번호를 선택하세요!! 1. 학생 등록 2. 학생 목록 보기 3. 종료 : ");
        Scanner stdIn = new Scanner(System.in);
        int choice = stdIn.nextInt();
        return choice;
    }

    /* 학생과 학생의 정보를 등록하면, 이를 DB에 등록 */
    public Student addStudent(){
        Scanner stdIn = new Scanner(System.in);
        Student student =  new Student();

        System.out.println("이름 : ");
        student.setName(stdIn.nextLine());

        System.out.println("국어 : ");
        student.setKorean(stdIn.nextInt());

        System.out.println("영어 : ");
        student.setEnglish(stdIn.nextInt());

        System.out.println("수학 : ");
        student.setMath(stdIn.nextInt());

        return student;
    }

    /* 학생의 목록을 출력 */
    public void listStudent(List<Student> studentList){
        List<Student>list = studentList;
        System.out.println("이름\t국어\t영어\t수학");
        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i).getName() +"\t"+list.get(i).getKorean() +"\t"+
                    list.get(i).getEnglish() + "\t" + list.get(i).getMath() + "이네요....");
        }
    }

    /* 프로그램 종료 */
    public void end(){
    }

}
