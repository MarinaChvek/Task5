package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Circle o1 = new Circle();
        o1.setX(3);
        o1.setY (12);
        o1.setR(-4);
        o1.printCircle();
        Circle o2 = new Circle(2,4,5);
        o2.zoomCircle(2);
        o2.printCircle();
        if(o1.equalsCircle(o2)) {
            System.out.println("Окружности o2 и o1 имеют равную площадь");
        } else {
            System.out.println("Окружности o2 и o1 имеют различную площадь");
        }
        o1.rasstoyanie(o2);
        System.out.println("Расстояние между центрами = "+ o1.rasstoyanie(o2));
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте радиус окружности, длину которой вы хотите посчитать:");
        double R = in.nextInt();
        Circle.dlinaCircle(R); //Этот метод не требует создание экземпляра класса Circle
        System.out.println("Длина окружности выбранного радиуса: "+Circle.dlinaCircle(R));
    }
}
