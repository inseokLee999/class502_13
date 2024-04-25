package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10_patternOr {
    public static void main(String[] args) {
//        String str = "cat|dog|pig";
        String str = "Cat is walking on the frozen Han River";
        Pattern p1 = Pattern.compile("cat|dog|pig");
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
    }
}
