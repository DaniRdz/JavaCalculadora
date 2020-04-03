package com.idesi.sobre;

public class Calculos {

    public double num1;
    public double num2;
    public double num3;
    public double res;

    public void leer_datos(double num1) {
        this.num1 = num1;
    }

    public void leer_datos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void leer_datos(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    double sumar_dos() {
        res = num1 + num2;
        return res;
    }

    double sumar_tres() {
        res = num1 + num2 + num3;
        return res;
    }

    double calcular_raiz_cuadrada() {
        res = Math.sqrt(num1);
        return res;
    }

    double calcular_potencia() {
        res = Math.pow(num1, num2);
        return res;
    }

    double calcular_promedio() {
        res = (num1 + num2 + num3) / 3;
        return res;
    }

}
