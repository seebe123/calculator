package com.company;

public class Main {
    public static void main(String[] args){
        Calculator cal = new Calculator(8,4);
        System.out.println(cal.getAdd());
        System.out.println(cal.getSub());
        System.out.println(cal.getDiv());
    }
}
