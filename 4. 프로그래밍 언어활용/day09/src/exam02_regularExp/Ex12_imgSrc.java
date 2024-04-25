package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex12_imgSrc {
    public static void main(String[] args) {
        String image = "<img class=\"image\" src='https://naver.com/images/logo.png' alt='로고' id='logo'>";
        getImageSrc(image);
    }
    public static String getImageSrc(String image){
        Pattern pattern = Pattern.compile("<img.*src=['\"]?([^'\"\\s]+)['\"]?[^>]*>",Pattern.CASE_INSENSITIVE); //공백 이외의 글자가 0회 이상 반복
        Matcher matcher = pattern.matcher(image);
        if(matcher.find()){
            System.out.println(matcher.group(1));
        }
        return null;
    }
}
