// 1 - Bibliotecas / Imports

// 1.5 - Pacotes
package com.calculadorageometrica; // pacote

// 2 - Classe
public class Main {
    // 2.1 - Atributos

    // 2.2 Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // public static float calcularAreaQuadrado(float numBase, float numAltura){
    //     float resultado = numBase + numAltura;
    //     System.out.println("A área do quadrado de base " + numBase + " e " + "altura de " + numAltura + " é de " + resultado);
    //     return resultado;
    // }

    public static float calcularAreaDoQuadrado(float numLado){
        float resultado = numLado * numLado;
        String mensagem = "Á área do quadrado de lado " + numLado + " é de ";
        System.out.println(mensagem + resultado);
        return resultado;
    }


    public static float calcularAreaDoRetangulo(float numBase, float numAltura){
        float resultado = numBase + numAltura;
        String mensagem = "A área do retângulo de base " + numBase + " e " + "altura de " + numAltura + " é de ";
        System.out.println(mensagem + resultado);
        return resultado;
    }

    public static double calcularAreaDoCirculo(double numRaio){
        double resultado = numRaio * numRaio * Math.PI;
        String mensagem = "A área do círculo de raio " + numRaio + " é de ";
        System.out.println(mensagem + resultado);
        return resultado;
    }

    public static double calcularAreaDoTriangulo(double numBase, double numAltura){
        double resultado = (numBase * numAltura) / 2;
        String mensagem = "A área do triângulo de base " + numBase + " e " + " de altura " + numAltura + " é de ";
        System.out.println(mensagem + resultado);
        return resultado;
    }




    








}