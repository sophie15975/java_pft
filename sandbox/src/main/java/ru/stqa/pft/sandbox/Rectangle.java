package ru.stqa.pft.sandbox;

public class Rectangle {
    public double dlina;
    public double shir;
    public double glub;

    public Rectangle(double dlina, double shir, double glub){
        this.dlina = dlina;
        this.shir = shir;
        this.glub = glub;
    }

    public double areal(){
        return this.dlina*this.shir;




    }
}
