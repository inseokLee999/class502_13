package Ch12;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);
        myList.add(1,"d");
        System.out.println(myList);
        myList.addFirst("0");
        System.out.println(myList);
    }
}
