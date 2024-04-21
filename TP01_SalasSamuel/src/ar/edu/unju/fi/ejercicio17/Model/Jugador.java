package ar.edu.unju.fi.ejercicio17.Model;
import java.time.LocalDate;
public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	
	public Jugador() {
	}
	
	
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void mostrarDatos() {
		System.out.println("----- JUGADOR -----");
		System.out.println("Ingrese nombre: "+this.nombre);
		System.out.println("Ingrese apellido: "+this.apellido);
		System.out.println("Ingrese fecha de nacimiento: "+this.fechaNacimiento);
		System.out.println("Ingrese nacionalidad: "+this.nacionalidad);
		System.out.println("Ingrese estatura: "+this.estatura);
		System.out.println("Ingrese peso: "+this.peso);
		System.out.println("Ingrese posicion: "+this.posicion);
	}
}
