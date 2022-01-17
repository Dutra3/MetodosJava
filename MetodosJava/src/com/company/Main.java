package com.company;

public class Main {

    static void soma (int a, int b) { // Ten que ser static, pois estou chamando dentro da main!
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    static int soma2(int a, int b) { // posso chamar de c E d! As letras que eu quiser, x e y.
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa!"); // O método main é executado primeiro!
	    soma(5,2);
	    int sm = soma2(7,6);
        System.out.println("A soma é: " + sm);

    }




}
