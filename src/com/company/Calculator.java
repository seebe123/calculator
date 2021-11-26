package com.company;

public class Calculator {
    private int num1;
    private int num2;
    private int add;
    private int div;
    private int sub;
    public Calculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        add = num1+num2;
        sub = num1-num2;
        div = num1/num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getAdd() {
        return add;
    }

    public int getSub() {
        return sub;
    }

    public int getDiv() {
        return div;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public void setDiv(int div) {
        this.div = div;
    }

}
