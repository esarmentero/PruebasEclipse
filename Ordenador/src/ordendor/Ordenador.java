/**
 * 
 */
package ordendor;

/**
 * Esta en una clase para almecenar la informacion de los ordenadores del centro
 * @author esm00
 * @version 1.0
 */
public class Ordenador {
	
	/* Se informa el modelo del ordenador*/
	public String modelo;
	/* Varibale que almacena el precio total del ordenador*/
	public double precio;
	/* Variable que almacena el tamaño de la memoria*/
	public int memoria;
	
	/*
	 * Constructor vacio de la clase Ordenador
	 */
	public Ordenador() {
		
	}
	
	/**
	 * Constructor de la clase ordenador
	 * @param modelo: modelo del ordenador
	 * @param precio: precio total del ordenador
	 * @param memoria: tamaño memoria del ordenador
	 */
	public Ordenador(String modelo,double precio,int memoria) {
		this.memoria = memoria;
		this.precio = precio;
		this.modelo = modelo;	
	}
	

}
