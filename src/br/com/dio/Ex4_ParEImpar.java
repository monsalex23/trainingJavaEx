package br.com.dio;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantosNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Cantidad de  Numeros: ");
        quantosNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;


            count ++; // count = count + 1; incrementar o count
        } while(count < quantosNumeros);
        System.out.println("Cantidad par:  " + quantPares);
        System.out.println("Cantidad impar:  " + quantImpares);
    }
}
