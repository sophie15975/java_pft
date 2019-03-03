package ru.stqa.pft.sandbox;

public class Square {
    public double len;
    public String col;


    public Square(double len, String col) {
        this.len = len;
        this.col = col;
    }

    public double area(){

        return len*len;
    }
}

