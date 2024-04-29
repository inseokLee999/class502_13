package exam01;

public class Box<T extends Fruit & Eatable> {//Box<T> : 지네릭 클래스 , T - 타입 매개변수 , Box: 원시 타입
    private T item;
    //private static T item2;// 사용불가, 처음부터 공간을 할당 받으므로 자료형이 명확 해야함
    //private T[] nums=new T[3]; //사용불가, 배열에서 공간 생성을 위해서는 자료형이 명확 해야함
    public void setItem(T item){
        this.item=item;
    }

    public T getItem(){
        return item;
    }
    public String toString(){
        //T == Fruit
        return item.get();
    }
}
