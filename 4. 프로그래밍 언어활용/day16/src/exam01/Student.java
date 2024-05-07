package exam01;

public class Student {
    private int classNum;
    private String name;
    private int score;

    public Student(int classNum, String name) {
        this.classNum = classNum;
        this.name = name;
    }

    public Student(int classNum, String name, int score) {
        this.classNum = classNum;
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getClassNum() {
        return classNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classNum=" + classNum +
                ", name='" + name + '\'' +
                '}';
    }
}
