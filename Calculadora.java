package CalculadoraApp;

public class Calculadora {
	
	public double multiplicar(double a, double b) { 
	    return a * b; 
	}

	public double sumar(double a, double b) { 
	    return a + b; 
	}

	public double restar(double a, double b) { 
	    return a - b; 
	}

	// Método añadido para la rama division
	public double dividir(double a, double b) { 
	    return a / b; 
	}

	public static void main(String[] args) {
	
		Calculadora calc = new Calculadora(); 
		System.out.println("--- CALCULADORA DEL JEFE A---"); 
		System.out.println("Suma: " + calc.sumar(10, 5)); 
		System.out.println("Multiplicación: " + calc.multiplicar(10, 6));
		
		// división
		System.out.println("División: " + calc.dividir(10, 2));
	}
}