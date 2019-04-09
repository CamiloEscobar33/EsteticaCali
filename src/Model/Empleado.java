package model;

public class Empleado {

	//atritbutos
	private String nombre;

	private int cedula;

	private String cargo;

	private int anioIngreso;

	//relations 
	private Servicio corteCabello;

	private Servicio maricure;

	private Servicio pedicure;


	public Contenedor (String nombre, int cedula, String cargo, int anioIngreso) {

		this.nombre = nombre;

		this.cedula = cedula;

		this.cargo = cargo;

		this.cargo = anioIngreso;

		corteCabello = new Servicio (nombre, numeroVeces, ingresoAcumulado, valorAcumuladoImpuesto);

		maricure = new Servicio (nombre, numeroVeces, ingresoAcumulado, valorAcumuladoImpuesto);

		pedicure = new Servicio (nombre, numeroVeces, ingresoAcumulado, valorAcumuladoImpuesto);
		
	}

	public String getCorteCabello() {

		return corteCabello;
	}

	public String getMaricure() {

		return maricure;
	}	

	public String getPedicure() {

		return pedicure;
	}

	
}