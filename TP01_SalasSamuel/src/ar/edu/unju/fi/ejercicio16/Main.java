package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arreglo = new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un nombre: ");
			arreglo[i] = sc.nextLine();
		}
		
		int cont = 0;
		while(cont<5) {
			System.out.println("Posicion "+cont+": "+arreglo[cont]);
			cont++;
		}
		System.out.println("Tamaño del arreglo: "+arreglo.length+"\n");
		
		byte n;
		do {
			System.out.print("Ingrese el indice de un elemento a eliminar [0-4]): ");
			n = sc.nextByte();
		}while(n<0 || n>4);
		
		arreglo[n] = " ";
		if(n<4) {
			do {
				arreglo[n] = arreglo[n+1];
				n++;
			}while(n<4);
		}
		arreglo[4] = " ";
		
		cont = 0;
		while(cont<5) {
			System.out.println("Posicion "+cont+": "+arreglo[cont]);
			cont++;
		}
	}
}
