package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico{
	private Double profundidad;
	private String tipo;
	
	public Submarino(Integer id, String nombre) {
		super(id,nombre);
		this.profundidad=0.0;
		tipo="NAVAL";
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public String toString() {
		return tipo;
	}
	
	

	
}
