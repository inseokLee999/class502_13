package Ch12;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("정수빈"));
        hashSet.add(new String("허경민"));
        hashSet.add(new String("강승호"));
        hashSet.add(new String("김재환"));
        hashSet.add(new String("양석환"));
        hashSet.add(new String("양석환"));
        System.out.println(hashSet);
    }
}
