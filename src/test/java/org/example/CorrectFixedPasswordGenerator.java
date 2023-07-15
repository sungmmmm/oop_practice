package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcdefhg"; //8글자 생성 고정

    }
}
