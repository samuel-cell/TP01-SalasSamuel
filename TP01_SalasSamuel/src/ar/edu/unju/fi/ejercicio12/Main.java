package ar.edu.unju.fi.ejercicio12;
import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.Model.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar fecha = Calendar.getInstance();
		
		System.out.print("Ingrese nombre: ");
			String nombre = scanner.nextLine();
		System.out.println("Ingrese fecha de nacimiento");
		System.out.print("Dia: ");
			int dia = scanner.nextInt();
		System.out.print("Mes: ");
			int mes = scanner.nextInt();
		System.out.print("Año: ");
			int anio = scanner.nextInt();
		
		fecha.set(anio, mes-1, dia);
		
		Persona persona = new Persona(nombre, fecha);
		
		persona.MostrarDatos();
		
		scanner.close();
	}
}
