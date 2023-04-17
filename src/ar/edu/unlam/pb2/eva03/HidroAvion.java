package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador, Acuatico{
	private Double profundidad;
	private Double altura;
	private String tipo;
	
	public HidroAvion(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
		this.altura=0.0;
		tipo="NAVAL";
		
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public String toString() {
		return tipo;
	}
	
	

	
}
