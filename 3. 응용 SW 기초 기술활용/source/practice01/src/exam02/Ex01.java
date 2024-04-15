package exam02;

public class Ex01 {
    public static void main(String[] args) {
        /*Student s1=new Student();

        s1.id=20180510;
        s1.name="이인석";
        s1.subject="전자기학";
        s1.study();
         */
        Student s2= new Student(1000,"김덕배","축구");
        //System.out.println(System.identityHashCode(s1));//주소
        //System.out.println(s1);
        s2.study();
        //Student s3= new Student();
    }
}
