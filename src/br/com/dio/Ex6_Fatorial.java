package br.com.dio;
/*
Faça um programa que calcule o fatorial de um número
inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacion = 1;

        System.out.println(fatorial + "! =");
        for(int i = fatorial; i >= 1; i--) {
            multiplicacion = multiplicacion * i;
        }
        System.out.println(multiplicacion);
    }
}
