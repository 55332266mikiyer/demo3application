package com.example.demo3.form;

public class CalcReserve {
    private String num1;
    private String num2;
    private String sum;
    
    public int getIntnum1(){
        return Integer.parseInt(num1);
    }
    public int getIntnum2(){
        return Integer.parseInt(num2);
    }
    public String getNum1() {
        return num1;
    }
    public void setNum1(String num1) {
        this.num1 = num1;
    }
    public String getNum2() {
        return num2;
    }
    public void setNum2(String num2) {
        this.num2 = num2;
    }
    public void calculateSum() {
        this.sum = getIntnum1() + getIntnum2(); // 合計値を計算して格納
    }
    public int getSum() {
        return sum;
    }
    }

    

    
    





  

