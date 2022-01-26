package com.dio.gftstart.aula3;

public class Aula3 {
    public static void main(String[] args) {


        System.out.println("Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Trapézio:" + areaTrapezio);

    }
}
