package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int arreglo [] = new int [8];
		Scanner sc = new Scanner (System.in);
		for (int i=0;i<8;i++) {
			System.out.println("Ingrese un valor entero: ");
			int num = sc.nextInt();
			arreglo[i] = num;
		}
		for (int i=0;i<8;i++) {
			System.out.println(+(i+1)+": "+arreglo[i]);
		}
	}

}
