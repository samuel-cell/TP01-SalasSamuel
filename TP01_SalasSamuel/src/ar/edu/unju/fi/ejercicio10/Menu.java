package ar.edu.unju.fi.ejercicio10;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.Model.*;
public class Menu {
	private int opcion = 0;
	private char answer = 'n';

	public Menu() {
		
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public char getAnswer() {
		return answer;
	}

	public void setAnswer(char answer) {
		this.answer = answer;
	}

	public void generarMenu(Pizza pizza) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------------");
			System.out.println("** Detalles del pedido **");

			do {
				System.out.println("Ingrese 1 - Pizza pequeña de diametro: 20cm");
				System.out.println("Ingrese 2 - Pizza Mediana de diametro: 30cm");
				System.out.println("Ingrese 3 - Pizza Grande de diametro: 40cm");
				System.out.print("Ingrese una opcion: ");
				opcion = sc.nextInt();

				if (opcion < 1 || opcion > 3) {
					System.out.println("\n¡Error de opcion elegida, intente nuevamente!");
				}

			} while (opcion < 1 || opcion > 3);

			do {
				System.out.println("\n ¿Lleva ingredientes especiales? s/n");
				answer = sc.next().charAt(0);
				if (answer != 's' && answer != 'n') {
					System.out.println("\n¡Error de opcion elegida, intente nuevamente!");
				}
			} while (answer != 's' && answer != 'n');

			setearDatosPizza(pizza);
			System.out.println(pizza.toString());

			System.out.println("\n ¿Desea Encargar otra Pizza? s/n");
			answer = sc.next().charAt(0);

		} while (answer != 'n');

		System.out.println("\n PROGRAMA TERMINADO");
		
		sc.close();
	}

	public void setearDatosPizza(Pizza pizza) {
		switch (opcion) { 
		case 1:
			pizza.setDiametro(20);
			break;
		case 2:
			pizza.setDiametro(30);
			break;
		case 3:
			pizza.setDiametro(40);
			break;
		}

		if (answer == 's') {
			pizza.setIngredientesEspeciales(true);

		} else {
			pizza.setIngredientesEspeciales(false);

		}
		pizza.calcularPrecio();
		pizza.calcularArea();
	}
}