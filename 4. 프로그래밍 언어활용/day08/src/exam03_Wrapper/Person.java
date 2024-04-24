package exam03_Wrapper;

public class Person {
    public int age;
    public String name;
    public Person(){}
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
