package exam03;

public class Tiger extends Animal{
    public void move(){
        System.out.println("네발로 뛰어다닌다");
    }
    public void hunting(){
        System.out.println("사냥을 한다");
    }
    @Override
    public String toString() {
        return "Tiger{}";
    }
}
