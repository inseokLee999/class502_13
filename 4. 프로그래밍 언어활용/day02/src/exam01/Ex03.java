package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1=new Student(1005,"김민재","분데스리가");
        s1.study();
        Student s2=new Student();
        s2.study();
        //System.out.println(System.identityHashCode(s1));
    }
}
