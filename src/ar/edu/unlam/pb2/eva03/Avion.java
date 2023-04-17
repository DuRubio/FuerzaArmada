package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador{
	private Double altura;
	private String tipo;
	
	public Avion(Integer id, String nombre) {
		super(id, nombre);
		this.altura=0.0;
		tipo="AEREO";
	}


	@Override
	public Double getAltura() {
		return altura;
	}


	@Override
	public String toString() {
		return tipo;
	}
	
	

	

	
	
}
