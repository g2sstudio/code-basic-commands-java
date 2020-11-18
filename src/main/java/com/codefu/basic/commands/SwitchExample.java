package com.codefu.basic.commands;

public class SwitchExample {

    public static void main(String[] args) {

        String cardBrandInput = args[0];

        switch(cardBrandInput) {
            case "Mastercard":
                System.out.println("Enviou para a Mastercard");
                break;
            case "Visa":
                System.out.println("Enviou para a Visa");
                break;
            default:
                System.out.println("Enviou para o Genérico");
                break;
        }
    }

}
