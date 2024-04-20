package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
	
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientes_especiales;
	private final int especial_20 = 500;
	private final int especial_30 = 750;
	private final int especial_40 = 1000;
	
	public Pizza() {
		
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientes_especiales;
	}
	public void setIngredientesEspeciales(boolean ingredientes_especiales) {
		this.ingredientes_especiales = ingredientes_especiales;
	}
	
	public void calcularPrecio() {
	    double precioBase = 0;
	    double precioEspecial = 0;

	    switch (diametro) {
	        case 20:
	            precioBase = 4500;
	            if (ingredientes_especiales){
	                precioEspecial = especial_20;
	            }
	            break;
	        case 30:
	            precioBase = 4800;
	            if (ingredientes_especiales){
	                precioEspecial = especial_30;
	            }
	            break;
	        case 40:
	            precioBase = 5500;
	            if (ingredientes_especiales){
	                precioEspecial = especial_40;
	            }
	            break;
	    }
	    
	    precio = precioBase + precioEspecial;
	}
	
	public void calcularArea() {
		
		area = Math.PI * Math.pow(diametro / 2, 2);
		
	}

	public String toString() {
		return "--- Pizza ---\n * Diametro= " + diametro + "\n * Precio= " + precio + "\n * Area=" + area + "\n * Ingredientes especiales= "
				+ ingredientes_especiales;
	}
}
