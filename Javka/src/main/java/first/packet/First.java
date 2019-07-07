package first.packet;

import java.sql.SQLOutput;

public class First {

	public static void main(String[] args) {

		hello("world");
		hello("noob");

		Square s = new Square();
		s.l = 5;
		double l = 5;
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

		double a = 4;
		double b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));

	}

	public static void hello(String somebody) {
		;
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(Square s) {
		return s.l * s.l;
	}

	public static double area(double a, double b){
		return a * b;
	}

 }