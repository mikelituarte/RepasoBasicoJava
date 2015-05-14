package curso.repaso.basico;

//package val.examples.basic;
import java.io.Serializable;

public class Persona implements Serializable {
	
	private int edad;
	private String nombre;
	
	
	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}


	public int getEdad() {
		return this.edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.edad;
	}
	
	

	
}