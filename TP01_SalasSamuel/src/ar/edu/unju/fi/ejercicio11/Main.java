package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int i = 2, j;
		boolean band = true;
		int valor = 0;
		int desc = 1;
		for(j=40 ; j>=0 ; j--) {

			if(band) {
				valor= j*i;
				band=false;
				desc = desc + i;
			}
			else {
				System.out.print(valor+ " ");

				valor = valor + (40-desc);

				desc = desc + i;
			}
		}
	}
}
