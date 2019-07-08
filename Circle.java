
package com.company;
class Circle {
    private double x; // абсцисса центра
    private double y; // ордината центра
    private double r; // радиус
    private final static double p = 3.14;
    private  double ras; // расстояние между центрами двух коружностей
    public Circle() { //конструктор по умолчанию
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    public Circle(double x, double y, double r) {
       this.x = x;
        this.y = y;
        this.r= r;
    }

    public double getY() { return y; }

    public double getR() { return r; }

    public double getP() { return p; }

    public double getX() { return x; }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        if (r>=0) {
            this.r = r;
        } else{
            System.out.println("Ошибка! Радиус не может быть отрицательным");
        }
    }

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }


    public void zoomCircle() { // масштабируем
        r = r * 2;
    }
    public void zoomCircle(int  k) { // масштабируем при помощи коэффициента k
        r = r * k;
    }
    public void zoomCircle(int  k1,int k2) { // масштабируем по двух координатам центра при помощи двух коэффициентов
        x = x * k1;
        y = y * k2;
    }


    public double squareCircle() {   // метод вычисляющий площадь
        double s = p * r * r;
        return s;
    }
    public static double dlinaCircle(double a) {  //статический метод подсчета длины окружности
        return 2*p*a;
    }

    public double rasstoyanie(Circle second){
        ras = Math.sqrt(Math.pow((x - second.x),2) + Math.pow((y - second.y), 2));
        return ras;
    }
    public boolean equalsCircle(Circle cir) {  // метод проверяющий равны ли окружности по площадям
        if(this.squareCircle() == cir.squareCircle()) {
            return true;
        } else {
            return false;
        }
    }
}
