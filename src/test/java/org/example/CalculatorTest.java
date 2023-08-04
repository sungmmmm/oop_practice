package org.example;

/*
    요구사항
    간단한 사칙연산을 할 수 있다.
    양수로만 계산할 수 있다.
    나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
    MVC패턴(Model-View-Controller) 기반으로 구현한다.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    // 1 + 2 ---> Calculator  (p연산자와 또다른 하나의 p연산자를 Calculator에게 전달하며 작업 유도)
    //   3   <---             (calculator는 수행)

    @DisplayName("뺄셈 연산을 수행한다.") //라는 의도의 testcode
 //command +n(test code 생성)
    @Test
    void subtrationTest() {
        //option + enter(class생성)

        int result = Calculator.calculate(1, "-", 2);

        assertThat(result).isEqualTo(-1);

    }
        //option + enter return ㄱㅂ
        @DisplayName("덧셈 연산을 수행한다.") //라는 의도의 testcode
        //command +n(test code 생성)
        @Test
        void additionTest() {
            //option + enter(class생성)

            int result = Calculator.calculate(1, "+", 2);

            assertThat(result).isEqualTo(3);


            //option + enter return
        }

    }
