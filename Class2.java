package com.Demo;

public class Class2 {

    private String word; //this string is not directly accessible
    private int number; //this integer is not directly accessible

    public void setWord(String newWord){ //publicly accessible from class Main

        word = newWord;
    }

    public String getWord() { //publicly accessible from class Main
        return word;
    }

    public void setNumber(int newNumber){ //publicly accessible from class Main
        number = newNumber;
    }

    public int getNumber(){ //publicly accessible from class Main
        return number;
    }

}
