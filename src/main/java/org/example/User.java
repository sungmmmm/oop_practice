package org.example;

public class User { //command + n 누르고 test UserTest 만들기
    private String password;

    public void initPassword() {
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPassword = randomPasswordGenerator.generatePassword();
        /*
           비밀번호는 최소 8자 이상 12자 이하여야한다.
         */
        if(randomPassword.length() >= 8 && randomPassword.length() <= 12){
        this.password = randomPassword;
        }

    }
}
