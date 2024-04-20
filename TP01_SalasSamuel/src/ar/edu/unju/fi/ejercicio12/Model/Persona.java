package ar.edu.unju.fi.ejercicio12.Model;
import java.util.Calendar;
public class Persona {
	String nombre;
	Calendar fechaDeNac = Calendar.getInstance();
	
	public Persona (String nombre, Calendar fechaDeNac) {
		this.nombre = nombre;
		this.fechaDeNac = fechaDeNac;
	}
	
	public int edadPersona () {
		Calendar fechaActual = Calendar.getInstance();
		int edad =  fechaActual.get(Calendar.YEAR) - fechaDeNac.get(Calendar.YEAR);
		if( fechaDeNac.get(Calendar.MONTH) > fechaActual.get(Calendar.MONTH) ) return edad-1;
		if( fechaDeNac.get(Calendar.MONTH) < fechaActual.get(Calendar.MONTH) ) return edad;
		if( fechaDeNac.get(Calendar.DAY_OF_MONTH) < fechaActual.get(Calendar.DAY_OF_MONTH) ) return edad;
		return edad;
		
	}
	
	public String ObtenerSignoZodiacal() {
		int mes = fechaDeNac.get(Calendar.MONTH);
		int dia = fechaDeNac.get(Calendar.DAY_OF_MONTH);
		
		switch(mes) {
		case 0: {
			if(dia<20) return "Capricornio";
			return "Acuario";
		}
		case 1: {
			if(dia<19) return "Acuario";
			return "Picis";
		}
		case 2: {
			if(dia<21) return "Picis";
			return "Aries";
		}
		case 3: {
			if(dia<20) return "Aries";
			return "Tauro";
		}
		case 4: {
			if(dia<21) return "Tauro";
			return "Geminis";
		}
		case 5: {
			if(dia<21) return "Geminis";
			return "Cancer";
		}
		case 6: {
			if(dia<23) return "Cancer";
			return "Leo";
		}
		case 7: {
			if(dia<23) return "Leo";
			return "Virgo";
		}
		case 8: {
			if(dia<23) return "Virgo";
			return "Libra";
		}
		case 9: {
			if(dia<23) return "Libra";
			return "Escorpio";
		}
		case 10: {
			if(dia<22) return "Escorpio";
			return "Sagitario";
		}
		case 11: {
			if(dia<22) return "Sagitario";
			return "Capricornio";
		}
		default: return "Error";
		}	
	}
	
	public String ObtenerEstacion() {
		Calendar verano = Calendar.getInstance();
		Calendar otoño = Calendar.getInstance();
		Calendar invierno = Calendar.getInstance();
		Calendar primavera = Calendar.getInstance();
		int anio = fechaDeNac.get(Calendar.YEAR);
		
		verano.set(anio, 10, 21);
		primavera.set(anio, 8, 21);
		invierno.set(anio, 5,21);
		otoño.set(anio, 2, 21);
		
		if(fechaDeNac.before(otoño)) return "Verano";
		else {
			if(fechaDeNac.before(invierno)) return "Otoño";
			else {
				if(fechaDeNac.before(primavera)) return "Invierno";
				else {
					if(fechaDeNac.before(verano)) return "Primavera";
					else return "Verano";
				}
			}
		}
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Fecha de Nacimiento: "+fechaDeNac.get(Calendar.DAY_OF_MONTH)+"/"+(fechaDeNac.get(Calendar.MONTH)+1)+"/"+fechaDeNac.get(Calendar.YEAR));
		System.out.println("Edad: "+edadPersona());
		System.out.println("Singo del Zodiaco: "+ObtenerSignoZodiacal());
		System.out.println("Estacion: "+ObtenerEstacion());
	}
}
