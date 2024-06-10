package exam01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Tag("exercise")
public class Ex01Test {
    @Test
    void test1(){
        Calculator cal = new Calculator();
        int num1 = 10, num2=20;
        int result = cal.add(num1,num2);
        assertEquals(30,result);
    }
    @Test@DisplayName("equals, same 테스트")@Disabled
    void test2(){
        LocalDate expected = LocalDate.now();
        LocalDate date = LocalDate.of(2024,06,05);
        assertEquals(expected,date);//equals and hashCode
        assertSame(expected,date);//동등성 검사
    }
    @DisplayName
    ("페일테스트")@Test
    void test3(){
        fail();
    }


}
