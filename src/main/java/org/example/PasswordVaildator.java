package org.example;

public class PasswordVaildator {
    public static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAG = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String password) {
        //3.테스트 코드가 통과해서 해당 부분을 리펙토링 해주기
        if (password.length() < 8 || password.length() > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAG);//command+option+c 로 해서 리펙토링
        }
    }
}