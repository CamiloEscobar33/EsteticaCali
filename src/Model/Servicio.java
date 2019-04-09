package model;

public class Servicio {


	//contantes
	public static final String CORTECABELLO = "CorteCabello";

	//atritbutos
	private String nombre;

	private int numeroVeces;

	private double ingresoAcumulado;

	private double valorAcumuladoImpuesto;



	//builder
	public Contenedor (String nombre, int numeroVeces, double ingresoAcumulado, double valorAcumuladoImpuesto) {

		this.nombre = nombre;

		this.numeroVeces = numeroVeces;

		this.ingresoAcumulado = ingresoAcumulado;

		this.valorAcumuladoImpuesto = valorAcumuladoImpuesto;

	}

	public Double calcularVolumenContenedor() {

		double volumen = 0.0;

		return volumen; 
	}

}