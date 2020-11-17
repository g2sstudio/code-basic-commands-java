package com.codefu.basic.commands;

public class IfExample {

    public static void main(String[] args) {

        boolean shouldExecute = Boolean.parseBoolean(args[0]);
        boolean shouldExecuteTwice = Boolean.parseBoolean(args[1]);

        if(shouldExecute) {
            System.out.println("Executed");
            if(shouldExecuteTwice) {
                System.out.println("Executed");
            }
        } else {
            System.out.println("Not Executed");
        }


    }

}
