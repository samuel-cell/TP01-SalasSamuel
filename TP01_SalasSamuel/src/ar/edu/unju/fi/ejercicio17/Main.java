package ar.edu.unju.fi.ejercicio17;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.Model.*;
public class Main {

	public static void main(String[] args) {
		List <Jugador> jugadores = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		int op=0;
		
		do {
			op=menu();
			switch(op) {
			case 1:System.out.println("ALTA JUGADOR :");
					Jugador jugador = crearJugador();
					if(jugadores.add(jugador)) {
						System.out.println("Jugador agregado");
						System.out.println("Cantidad : "+jugadores.size());
					}
					else {
						System.out.println("¡Error al crear jugador!");
					}
				break;
			case 2:System.out.println("---- DATOS DE UN JUGADOR ----");
					System.out.println("Ingrese nombre :");
					String name = scanner.nextLine();
					System.out.println("Ingrese apellido :");
					String lastname = scanner.nextLine();
					datoJugador(jugadores,name,lastname);
				break;
			case 3:System.out.println("Jugadores por apellido: ");
					apellidos(jugadores);
				break;
			case 4:System.out.println("Datos disponibles para modificar :");
					System.out.println("  Estatura - Peso - Posicion  ");
					if(modificarJugador(jugadores)) {
						System.out.println("\n Jugador modificado con exito ");
					}
					else {
						System.out.println(" ¡Error al modificar! ");
					}
				break;
			case 5:System.out.println("Eliminar jugador");
					System.out.println("cantidad : "+ jugadores.size());
					if(eliminarJugador(jugadores)) {
						System.out.println("¡Jugador eliminado con exito!");
						System.out.println("cantidad : "+ jugadores.size());
					}
					else {
						System.out.println("¡Error al borrar!");
					}
				break;
			case 6:System.out.println("Cantidad de jugadores: "+jugadores.size());
				break;
			case 7:System.out.println("Jugadores por nacionalidad");
					nacionalidad(jugadores);
				break;
			case 8:System.out.println("FIN DEL PROGRAMA");
				break;
			default: System.out.println("¡ERROR DE OPCION!");
			}
		}while(op != 8);
}

static void apellidos(List<Jugador> jugadores) {
	
	Collections.sort(jugadores,Comparator.comparing(Jugador::getApellido));
	
	for (Jugador jugador : jugadores) {
		System.out.println("\n Jugador : "+jugador.getApellido()+"\n Posicion : "+jugador.getPosicion());
	}
}
static void nacionalidad(List<Jugador> jugadores) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese nacionalidad : ");
	String nac = scanner.nextLine();
	for (Jugador jugador : jugadores) {
		if(nac.equals(jugador.getNacionalidad())){
				
		System.out.println("\n Jugador : "+jugador.getApellido()+", "+jugador.getNombre()+"\n Nacionalidad : "+jugador.getNacionalidad());
		}
	}
}

static void datoJugador(List<Jugador> jugadores,String name, String lastname) {
		for (Jugador jugador : jugadores) {
			if( jugador.getApellido().equals(lastname) && jugador.getNombre().equals(name) ) {
				jugador.mostrarDatos();
			}
		}
}


static boolean modificarJugador(List<Jugador> jugadores) {
	boolean encontrado = false;
	System.out.println("Ingrese nombre del jugador:");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println("Ingrese apellido del jugador:");
	String lastname = scanner.nextLine();
		for(int i=0; i< jugadores.size();i++) {
			if(name.equals(jugadores.get(i).getNombre()) && lastname.equals(jugadores.get(i).getApellido()) ) {
				encontrado = true;
				System.out.println("Ingrese estatura: ");
				float estatura = scanner.nextFloat();
				System.out.println("Ingrese peso: ");
				float peso = scanner.nextFloat();
				scanner.nextLine();
				System.out.println("Ingrese posicion: ");
				String posicion = scanner.nextLine();
				jugadores.get(i).setEstatura(estatura);
				jugadores.get(i).setPeso(peso);
				jugadores.get(i).setPosicion(posicion);
			}
		}
	return encontrado;
}
static boolean eliminarJugador(List<Jugador> jugadores) {
	boolean eliminado = false;
	System.out.println("Ingrese nombre del jugador:");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println("Ingrese apellido del jugador:");
	String lastname = scanner.nextLine();
	for(int i=0; i< jugadores.size();i++) {
		if(name.equals(jugadores.get(i).getNombre()) && lastname.equals(jugadores.get(i).getApellido()) ) {
			eliminado = true;
			jugadores.remove(i);
		}
	}
return eliminado;	
}
public static int menu() {
	Scanner scanner = new Scanner(System.in);
	int op=0;
	System.out.println("----- MENU -----");
	System.out.println("\n 1- Alta Jugador.");
	System.out.println(" 2- Mostrar datos del Jugador.");
	System.out.println(" 3- Mostrar todos los jugadores por apellido.");
	System.out.println(" 4- Modificar los datos de un jugador.");
	System.out.println(" 5- Eliminar un jugador.");
	System.out.println(" 6- Mostrar Cantidad de jugadores.");
	System.out.println(" 7- Mostrar Cantidad de jugadores de una Nacionalidad.");
	System.out.println(" 8- Salir.");
	System.out.println(" \n Ingrese opcion:");
	op = scanner.nextInt();
	scanner.nextLine();
	return op;
}

static Jugador crearJugador() {
	return new Jugador(nombre(),apellido(),fechaNacimiento(),nacionalidad(),estatura(),peso(),posicion());
}
static String nombre(){
	System.out.println("Ingrese nombre: ");
	Scanner scanner = new Scanner(System.in);
	return scanner.nextLine();
}
static String apellido() {
	System.out.println("Ingrese apellido: ");
	Scanner scanner = new Scanner(System.in);
	return scanner.nextLine();
}
static LocalDate fechaNacimiento() {
	Scanner scanner = new Scanner(System.in);
	LocalDate fecha=null;
	int dia=0,mes=0,anio=0;
		try {
			System.out.println("Fecha de nacimiento");
			System.out.println("\nIngrese el año:");
			anio =scanner.nextInt();
			System.out.println("Ingrese el mes:");
			mes = scanner.nextInt();
			System.out.println("Ingrese el dia:");
			dia = scanner.nextInt();
		}
		catch(java.util.InputMismatchException ex) {
			System.out.println("Datos ingresados de distinto tipo");
			}
	try {
		fecha = LocalDate.of(anio, mes, dia);
	}
	catch(DateTimeException e) {
		System.out.println("¡Error en los parametros de la fecha!");
	}
	scanner.nextLine();
	return fecha;
}
static String nacionalidad() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese nacionalidad: ");
	return scanner.nextLine();
}
static float estatura() {
	Scanner scanner = new Scanner(System.in);
	float n=0;
	try {
		System.out.println("Ingrese estatura: ");
		n = scanner.nextFloat();
	}
	catch(java.util.InputMismatchException e) {
		System.out.println("¡Error en el tipo de dato!");
	}
	scanner.nextLine();
	return n;
}
static float peso() {
	Scanner scanner = new Scanner(System.in);
	float p=0;
	try {
		System.out.println("Ingrese peso: ");
		p = scanner.nextFloat();
	}
	catch(java.util.InputMismatchException e) {
		System.out.println("¡Error en el tipo de dato!");
	}
	scanner.nextLine();
	return p;
}
static String posicion() {
	Scanner scanner = new Scanner(System.in);
	boolean band=false;
	String pos ="";
	do {
	System.out.println("Ingrese posicion (delantero - mediocampo - defensa - arquero): ");
	pos = scanner.nextLine();
		if(pos.equals("delantero") || pos.equals("mediocampo") || pos.equals("defensa") || pos.equals("arquero")) {
			band=true;
		}
		else	{
			System.out.println("Posicion ingresada no valida");
			band=false;
		}
	}while(!band);
	
	return pos;
	}
}
