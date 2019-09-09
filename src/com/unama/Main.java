package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sexo;
        float altura;
        float peso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu sexo: ");
        sexo = sc.next();
        System.out.println("Informe a sua altura: ");
        altura = sc.nextFloat();
        if (sexo.toLowerCase().equals("masculino")) {
            peso = (float) (72.7 * altura - 58);
            System.out.println("seu peso ideal é: " + peso);
        }else if (sexo.toLowerCase().equals("feminino")) {
            peso = (float) (62.1*altura-44.7);
            System.out.println("seu peso ideal é: " + peso);
        }
	// write your code here
    }
}
