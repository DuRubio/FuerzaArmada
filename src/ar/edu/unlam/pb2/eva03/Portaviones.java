package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo {
	private String tipo;
	public Portaviones(Integer id, String nombre) {
		super(id, nombre);
		tipo="NAVAL";
	}
	@Override
	public String toString() {
		return tipo;
	}
	
	
	

}
