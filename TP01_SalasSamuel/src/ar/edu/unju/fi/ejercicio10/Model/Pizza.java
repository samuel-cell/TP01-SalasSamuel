package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
	private double diameter;
	private double price;
	private double area;
	private boolean special_ingredients;
	private final int special_in_20 = 500;
	private final int special_in_30 = 700;
	private final int special_in_40 = 1000;
	
	public Pizza() {
		
	}
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isSpecial_ingredients() {
		return special_ingredients;
	}
	public void setSpecial_ingredients(boolean special_ingredients) {
		this.special_ingredients = special_ingredients;
	}
	
	public double calcularPrecio(int option, boolean special) {
		double precioBase = 0;
		double precioEspecial = 0;
		
		switch (option) {
			case 1:
				precioBase = 4500;
				if(special) {
					
				}
		}
	}
}
