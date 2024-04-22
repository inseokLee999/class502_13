package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1=new Student(1000,"이이름","자바");
        Student s2=new Student(1001,"손흥민","축구");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println(s1.id);//정적변수인지 인스턴스 변수인지 알수 없음
        System.out.println(s2.id);//Student.id 로 사용 클래스 변수
        System.out.println(Student.id);
        s1.instanceMethod();
    }
}
