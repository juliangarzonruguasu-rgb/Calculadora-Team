package CalculadoraApp;

public class Calculadora {
	
	public double multiplicar(double a, double b) { 
	    return a * b; 
	}


	public double sumar(double a, double b) { return a + b; } 
	public double restar(double a, double b) { return a - b; }
	public static void main(String[] args) {
	
	Calculador calc = new Calculador(); 
	System.out.println("--- INICIO DE LA CALCULADORA ---"); 
	System.out.println("Suma: " + calc.sumar(10, 5)); 
	System.out.println("Multiplicación: " + calc.multiplicar(10, 6));

	
	
	
	}
	
}
