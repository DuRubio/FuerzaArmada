package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre{
	private Double profundidad;
	private Double velocidad;
	private String tipo;
	
	
	public Anfibio(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
		this.velocidad=0.0;
		tipo="NAVAL";
	}


	@Override
	public Double getProfundidad() {
		return profundidad;
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
