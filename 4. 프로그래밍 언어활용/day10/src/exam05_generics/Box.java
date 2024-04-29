package exam05_generics;

public class Box<T> {//Type의 매개변수 T
    private T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;
    }
}
