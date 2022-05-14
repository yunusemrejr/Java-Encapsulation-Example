package com.Demo;

public class Main {

    public static void main(String[] args){

        Class2 C2 = new Class2(); //calling Class2 as C2
        C2.setWord("Yunus");    //using C2's public method
        C2.setNumber(186754);   //using C2's public method

        System.out.println(C2.getWord());  //using C2's public method
        System.out.println(C2.getNumber());  //using C2's public method

    }

}