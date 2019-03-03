package ru.stqa.pft.sandbox;

import ru.stqa.pft.sandbox.Rectangle;
import ru.stqa.pft.sandbox.Square;

public class MyFirstProgram {
	public static void main(String[] args) {
	System.out.println("Hello, world!");


		Square kvadratiche = new Square(6,"black");
		Rectangle SP= new Rectangle(17, 20, 5);

		

		System.out.println("площадь прмоугольника = " + kvadratiche.area() +" цвет квадрата " + kvadratiche.col );
		System.out.println("площадь бассейна =" + SP.areal() + "; глубина "+ SP.glub);
		
}

}