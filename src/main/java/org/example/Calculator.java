package org.example;

public class Calculator {
    public static int calculate(int operand1, String operator, int operand2) {
        if ("-".equals(operator)) {
            return operand1 - operand2;
            //command+option + l (자동정렬)
        }
        //퍼블릭 인터페이스 선언
        return 0;
    }
}