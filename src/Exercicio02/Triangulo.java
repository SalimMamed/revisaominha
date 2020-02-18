package Exercicio02;

public class Triangulo {
    public int base;
    public int altura;

    public void calcular() {
        double area = base * altura;
        area = area / 2;
        System.out.println("Area= " + area);
    }
}