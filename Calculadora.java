import java.util.Scanner;

public class Calculadora {
	
	public static double sumar(double a, double b){
		return a + b;

	}
	public static double restar(double a, double b){
		return a - b;

	}
	public static double multiplicacion(double a, double b){
		return a * b;

	}
	public static double division(double a, double b){
		if(b==0){
			System.out.println("Error: Division por cero no permitida");
			return Double.NaN;
		}
		return a / b;

	}

 }

