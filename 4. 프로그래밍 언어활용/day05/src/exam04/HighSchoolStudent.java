package exam04;

public class HighSchoolStudent extends Student{
    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public HighSchoolStudent(){
        super(1000,"이이름");
        //super(); 가 정의 안되어있으므로 오류

    }
}
