package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
        String str = null;
//        Optional<String> opt = Optional.of(str);//null은 허용을 안한다
        Optional<String> opt = Optional.ofNullable(str);
//        System.out.println(opt.get());//null이면 NoSuchElementException 발생
        String value = opt.orElse("기본값");
        System.out.println(value);
    }
}
