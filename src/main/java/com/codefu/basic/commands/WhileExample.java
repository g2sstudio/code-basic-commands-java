package com.codefu.basic.commands;

public class WhileExample {

    public static void main(String[] args) {

        int repeatTimes = 5;
        int counter = 1;

//        boolean shouldRepeat = true;

        while(counter++ <= repeatTimes) {
            System.out.println("Executou");
        }

//        do {
//            System.out.println("Executou");
//        } while (counter++ <= repeatTimes);

    }

}
