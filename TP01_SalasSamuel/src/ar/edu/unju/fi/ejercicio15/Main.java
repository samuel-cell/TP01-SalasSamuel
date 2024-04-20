package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Ingrese un numero que se encuentre en el rango [5-10]: ");
			num = sc.nextInt();			
		} while (num < 5 || num > 10);
		
		String[] arregloNombres = new String[num];
		sc.nextLine();
		
		for(int i=0;i<num;i++) {
			System.out.println("Ingrese un nombre: ");
			String nombre = sc.nextLine();
			arregloNombres[i] = nombre;
		}
		
		System.out.println("\nArreglo de nombres en orden inverso: ");
		
		for(int i=num-1;i>-1;i--) {
			System.out.println(+(i+1)+": "+arregloNombres[i]);
		}
	}
}
