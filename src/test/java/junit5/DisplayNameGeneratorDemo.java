package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DisplayNameGeneratorDemo {

    // @Nested 用于注解内部类，使用该注解可以将多个test class 放在同一个parent下。
    @Nested
    // ReplaceUnderscores 使用空格替换下划线
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    // 运行时 名称变为：A year is not supported
    class A_year_is_not_supported {

        @Test
        // 运行时 名称变为： if it is zero
        void if_it_is_zero() {
        }

        @DisplayName("A negative value for year is not supported by the leap year computation.")
        @ParameterizedTest(name = "For example, year {0} is not supported.")
        @ValueSource(ints = {-1, -4})
        void if_it_is_negative(int year) {
        }

    }

    @Nested
    // 可以将类名和方法名连接起来 结果为 A year is a leap year -> if it is divisible by 4 but not by 100
    @IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
    class A_year_is_a_leap_year {

        @Test
        void if_it_is_divisible_by_4_but_not_by_100() {
        }

        @ParameterizedTest(name = "Year {0} is a leap year.")
        @ValueSource(ints = {2016, 2020, 2048})
        void if_it_is_one_of_the_following_years(int year) {
        }

    }

}
