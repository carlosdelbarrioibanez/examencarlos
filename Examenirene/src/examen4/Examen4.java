package examen4;

import java.util.Scanner;

public class Examen4 {

	public static void main(String[] args) {
		// Creamos el objeto Scanner para leer datos del usuario
		Scanner sc = new Scanner(System.in);

		// Pedimos una palabra al usuario
		System.out.print("Introduce una palabra: ");
		String palabra = sc.nextLine();

		// Mostramos la palabra y vamos quitando una letra por la derecha en cada línea
		for (int i = palabra.length(); i > 0; i--) {
			System.out.println(palabra.substring(0, i));
		}

		// Cerramos el Scanner
		sc.close();
	}
}