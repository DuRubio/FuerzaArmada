package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Vehiculo {
	private Integer id;
	private String nombre;
	private Double velocidad;
	
	
	public Vehiculo (Integer id, String nombre) {
		this.id=id;
		this.nombre=nombre;
		velocidad=0.0;
	}



	protected Double getVelocidad() {
		return velocidad;
	}


	protected void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(id, other.id);
	}



	protected Integer getId() {
		return id;
	}



	protected void setId(Integer id) {
		this.id = id;
	}



	protected String getNombre() {
		return nombre;
	}



	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}





	
	
	
}
