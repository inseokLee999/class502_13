package exam01;

public class Student {
    String name;
    int Student_id;
    String subject;
    void showInfo(){
        System.out.println("Student{" +"name='" + name + '\'' +", Student_id=" + Student_id +", subject='" + subject + '\'' +'}');
    }
    public Student(){ // 기본 생성자
        //객체가 생성된 이후 실행 코드
        //실행시점 : id name subject 에 공간을 할당 받은 상태
        //System.out.println("객체 생성 이후 실행");
        //인스턴스 변수의 초기화 작업을 주로 수행
        Student_id=1000;
        name="홍길동";
        subject="subject";
    }
    public Student(int _id,String _name,String _subject){//stack에 들어가는 지역 변수
        Student_id=_id;
        name=_name;
        subject=_subject;
    }

    void study(){
        System.out.printf("%s가 %s를 공부한다.%n",name,subject);
    }
}
