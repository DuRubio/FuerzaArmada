package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico{
	private String tipo;
	private Double profundidad;
	
	public Destructor(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
		this.tipo="NAVAL";
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
