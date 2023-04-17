package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre{
	private Double velocidad;
	private String tipo;
	
	public Tanque(int id, String nombre) {
		super(id, nombre);
		this.velocidad=0.0;
		tipo="TERRESTRE";
	}


	@Override
	public Double getVelocidad() {
		return velocidad;
	}


	@Override
	public String toString() {
		return tipo;
	}
	
	

}
