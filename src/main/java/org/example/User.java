package org.example;

public class User { //command + n 누르고 test UserTest 만들기
    private String password;

    public void initPassword(PasswordGenerator PasswordGenerator) {
        //컨트롤 할 수 없는 부분을(RandomPasswordGenerator) 외부로(PasswordGenerator)부터 주입 받기 위해서 추가하기
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password =PasswordGenerator.generatePassword();
        /*
           비밀번호는 최소 8자 이상 12자 이하여야한다.
         */
        if(password.length() >= 8 && password.length() <= 12){
        this.password = password;
        }

    }

    public String getPassword() {
        //command + n getter생성
        return password;
    }
}
