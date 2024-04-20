package ar.edu.unju.fi.ejercicio10;
import ar.edu.unju.fi.ejercicio10.Model.*;
public class Main {

	public static void main(String[] args) {
		Menu unMenu = new Menu();	
		Pizza pizza = new Pizza();
		unMenu.generarMenu(pizza);		
	}

}