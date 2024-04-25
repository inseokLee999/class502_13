package exam01_usefulClass;

import java.util.StringTokenizer;

public class Ex04_Token {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melon_Banana+Mango";
        StringTokenizer st = new StringTokenizer(fruits,"#,+_");
        System.out.println(st.countTokens());
        while(st.hasMoreElements()){
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
