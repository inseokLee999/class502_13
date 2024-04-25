package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09_phoneNum {
    public static void main(String[] args) {
        String mobile = "01077225089";
        System.out.println(chkMobile(mobile));
    }
    public static boolean chkMobile(String mobile){
        /**
         *  010-0000-0000
         *  011-000-0000
         *  016-000-0000
         */
        Pattern pattern = Pattern.compile("^01[016]\\D*\\d{3,4}?\\D*\\d{3,4}$");
        Matcher matcher = pattern.matcher(mobile);

        return matcher.find();
    }
}
