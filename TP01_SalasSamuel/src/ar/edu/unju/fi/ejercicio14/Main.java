package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese un numero que se encuentre en el rango [3-10]: ");
			num = sc.nextInt();
		} while (num < 2 || num > 10);
		
		int[] arreglo = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("Ingrese un valor entero: ");
			int a = sc.nextInt();
			arreglo[i] = a;
		}
		for(int i=0;i<num;i++) {
			System.out.println(+(i+1)+": "+arreglo[i]);
		}
	}

}
