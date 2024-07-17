package org.choongang.config;

import org.junit.jupiter.api.Test;

public class SystemTest {
    @Test
    public void test() {
        System.getProperties().forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println(System.getProperty("os.name"));
    }
}
