package exam02;

public class Student {
    int id;//학번

    String name;// 학생명

    String subject;//전광과목
    //변수에 대한 정의(변수가 아님)
    public Student(int _id,String _name,String _subject){
        //반환값 정의 x -반환값은 객체의 주소 값
        // 객체 생성 이후에 해야될 작업들
        // 멤버 변수의 초기화 작업을 주로 진행
        id=_id;
        name=_name;
        subject=_subject;
    }
    void study(){
        System.out.printf("학번 :%d, 이름:%s ,전공과목:%s",id, name,subject);
    }
}
