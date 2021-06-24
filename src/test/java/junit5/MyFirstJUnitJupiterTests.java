package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    // 自定义测试名称 可以有空格，特殊符号，甚至是emojis
    @DisplayName("\uD83D\uDE31")
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }
}
