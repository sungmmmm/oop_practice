package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * - **요구사항**
 *     - 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 *     - 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생
 *     시킨다.
 *     - 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상 , 12자 이하면 예외가 발생하지 않는다")
    @Test //command + n (test Method)에서 생성
    void validatePasswordTest() {
        assertThatCode(() -> PasswordVaildator.validate("serverwizard"))
                .doesNotThrowAnyException(); //예외 발생하지 않는다 라는걸 확인하기 위해서
    }
    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @Test
    void validatePasswordTest2() {
        assertThatCode(() -> PasswordVaildator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)//assertj 안에 있는 코드임
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}