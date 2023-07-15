package org.example;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드를 초기화 한다.")
    @Test //command + n testMethod
    void passwordTest() {
        // given
        User user = new User();
        // when 이걸 호출했을때
        user.initPassword(new CorrectFixedPasswordGenerator());
        //then
        assertThat(user.getPassword()).isNotNull();
        //option+enter 해서 assertj로 변경

    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test //command + n testMethod
    void passwordTest2() {
        // given
        User user = new User();
        // when 이걸 호출했을때
        user.initPassword(new WrongFixedPasswordGenerator());
        //then
        assertThat(user.getPassword()).isNull();
        //option+enter 해서 assertj로 변경

    }
}