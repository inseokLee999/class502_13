package exam05;

public class Box<T> {//Type의 T
    private T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;
    }
}
