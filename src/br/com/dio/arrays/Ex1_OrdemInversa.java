package br.com.dio.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {5, -8, 30, 23, 8, 322};
        System.out.println("vetor: ");
        int count = 0;
        while(count <= vetor.length -1) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("vetor reverse: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}
