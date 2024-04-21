package ar.edu.unju.fi.ejercicio18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.Model.*;

public class Main {
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
			List <Pais> paises = new ArrayList(); 
			
			paises.add(new Pais("c1","argentina"));
			paises.add(new Pais("c2","brasil"));
			
			List<DestinoTuristico> destinos = new ArrayList();
			int op=0;
			do {
				op=menu();
				switch(op) {
				case 1:System.out.println("Alta destinos turisticos");
						
						DestinoTuristico dt = crearDt();
							if(destinos.add(dt)) {
								System.out.println("¡Destino agregado con exito!");
							}
							else {
								System.out.println("¡Error al agregar destino!");
							}
					break;
				case 2:System.out.println("Destinos turisticos");
						mostrarDestinosT(destinos);
					break;
				case 3:System.out.println("Modificar el pais de destino");
					if(modificarPaisDestino(destinos)) {
						System.out.println("Informacion modificada");
					}
					else {
						System.out.println("!Error al modificar!");
					}
					break;
				case 4:System.out.println("Limpiar ArrayList de destinos turisticos:");
						destinos.clear();
					break;
				case 5:System.out.println("Eliminar un destino turistico");
						if(eliminarDestino(destinos)) {
							System.out.println("¡Se elimino correctamente!");
						}
						else {
							System.out.println("¡Error al borrar!");
						}
					break;
				case 6:System.out.println("Destinos turisticos ordenados por nombre");
						mostrarOrdenado(destinos);
					break;
				case 7:System.out.println("Mostrar todos los paises");
					mostrarPaises(paises);
					break;
				case 8:System.out.println("Destinos turisticos de un pais");
						System.out.println("Ingrese codigo de pais: ");
						String cod = scanner.nextLine();
						destinosPorPais(destinos,cod);
					break;
				case 9:System.out.println("***Fin del programa***");
					break;
				default: System.out.println("ERROR DE OPCION");
				}
			}while(op != 9);
			
		}
		public static int menu() {
			int op=0;
			System.out.println("----- MENU -----");
			System.out.println("\n1- Alta Destino Turistico");
			System.out.println("2- Mostrar todos los destinos turisticos");
			System.out.println("3- Modificar el pais de un destino turistico");
			System.out.println("4- Limpiar ArrayList de destinos turisticos");
			System.out.println("5- Eliminar un destino turistico");
			System.out.println("6- Mostrar destinos turisticos ordenados");
			System.out.println("7- Mostrar todos los paises");
			System.out.println("8- Destinos turisticos de un pais ");
			System.out.println("9- Salir");
			System.out.println("\nIngrese opcion: ");
			op = scanner.nextInt();
			scanner.nextLine();
			return op;
		}
		
		static String codigo() {
			System.out.println("Ingrese codigo del destino turistico: ");
			return scanner.nextLine();
		}
		static String nombre() {
			System.out.println("Ingrese nombre del destino turistico: ");
			return scanner.nextLine();
		}
		static Float precio() {
			float p=0;
			try {
				System.out.println("Ingrese precio: ");
				p = scanner.nextFloat();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("¡Dato ingresado no valido!");
			}
			scanner.nextLine();
			return p;
		}
		static Pais pais() {
			boolean band=false;
			String c,p="";
			do {
				System.out.println("Ingrese codigo de pais:");
				System.out.println(" d1 - Peru");
				System.out.println(" d2 - Bolivia");
				 c = scanner.nextLine();
				if(c.equals("d1")) {
					p = "Peru";
				}
				if(c.equals("d2")) {
					 p = "Bolivia";
				}
				if(c.equals("d1") == true || c.equals("d2") == true) {
					band=true;
				}
				else {
					System.out.println("¡Error del codigo!");
				}
			}while(!band);
			
			
			return new Pais(c,p);
		}
		static int dias() {
			int d=0;
			try {
				System.out.println("Ingrese dias: ");
				d = scanner.nextInt();
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("¡Dato ingresado no valido!");
			}
			scanner.nextLine();
			return d;
		}
		static DestinoTuristico crearDt() {
			return new DestinoTuristico(codigo(),nombre(),precio(),pais(),dias());
		}
		static void mostrarDestinosT(List<DestinoTuristico> destinos) {
			for (DestinoTuristico destinoTuristico : destinos) {
				System.out.println("Destino turistico: "+destinoTuristico.getNombre());
			}
		}
		
		static boolean modificarPaisDestino (List<DestinoTuristico> destinos) {
			boolean encontrado = false;
			System.out.println("Ingrese codigo del destino turistico: ");
			String codigo = scanner.nextLine();
				for(int i=0; i< destinos.size(); i++) {
					if(codigo.equals(destinos.get(i).getCodigo())) {
						encontrado = true ;
						destinos.get(i).setPais(pais());
					}
				}
		
			return encontrado;
		}
		static boolean eliminarDestino (List<DestinoTuristico> destinos) {
			boolean encontrado = false;
			System.out.println("Ingrese codigo del destino turistico: ");
			String codigo = scanner.nextLine();
				for(int i=0; i< destinos.size(); i++) {
					if(codigo.equals(destinos.get(i).getCodigo())) {
						encontrado = true ;
						destinos.remove(i);
					}
				}
			return encontrado;
		}
		static void mostrarOrdenado(List<DestinoTuristico> destinos) {
			Collections.sort(destinos,Comparator.comparing(DestinoTuristico::getNombre));
			for (DestinoTuristico destinoTuristico : destinos) {
				System.out.println("Destino Turistico: "+destinoTuristico.getNombre());
			}
		}
		static void mostrarPaises(List <Pais> paises) {
			for (Pais pais : paises) {
				System.out.println("Pais: "+pais.getNombre()+ "Codigo: "+pais.getCodigo());
			}
		}
		
		static void destinosPorPais(List<DestinoTuristico> destinos,String cod) {
			for(int i=0; i < destinos.size() ; i++) {
				if(cod.equals(destinos.get(i).getPais().getCodigo())) {
				System.out.println("Pais : "+destinos.get(i).getPais().getNombre()+"Destino : "+destinos.get(i).getNombre());
					
				}
			}
		}
}
