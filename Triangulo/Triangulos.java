package Triangulo;

import java.util.Scanner;

/**
 * Created by als on 09/08/2017.
 */
public class Triangulos {
    Scanner tc=new Scanner(System.in);
    public double base;
    public double altura;

    public void ler(){
        System.out.println("Digite a base do triangulo retangulo: ");
        this.base=tc.nextDouble();
        System.out.println("Digite a altura do triangulo retangulo: ");
        this.altura=tc.nextDouble();
    }

    public void mostrar(){
        System.out.println("Base do triangulo: "+this.base);
        System.out.println("Altura do triangulo: "+this.altura);
    }

    public double calcular(){
        double triangulo;
        triangulo=this.base*this.altura/2;
        System.out.println("Area do triangulo: "+triangulo);
        return triangulo;

    }
}
