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
	/* Variable para almacenar la ubicacion donde se encuentra el equipo*/
	public String ubicacionAula;
	
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
	
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}

	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

}
