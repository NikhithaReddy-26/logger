package com.dtodemo.dto;

public class NumberInfoDTO {

    // Declare the number of variable
    // you want to capture the value
    private String number1;
    private String number2;

    // Generate the getter,
    // setter and toString method
    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "NumberInfoDTO [number1=" + number1 + ", number2=" + number2 + "]";
    }

}
