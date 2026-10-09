package examen3;

import java.util.Scanner;

public class Examen3 {

	public static void main(String[] args) {
		// Creamos el objeto Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos un número del 1 al 10
		System.out.print("Introduce un número del 1 al 10: ");
		int numero = sc.nextInt();

		// Comprobamos si el número está en el rango
		if (numero < 1 || numero > 10) {
			System.out.println("Número fuera de rango");
		} else {
			// Mostramos la tabla de multiplicar
			System.out.println("Tabla de multiplicar del " + numero + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		}

		// Cerramos el Scanner
		sc.close();
	}
}