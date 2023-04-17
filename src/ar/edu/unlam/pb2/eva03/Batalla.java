package ar.edu.unlam.pb2.eva03;

import static ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla.NAVAL;
import static ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla.TERRESTRE;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombre;
	Set<Vehiculo> vehiculosEnLaBatalla;

	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.setNombre(nombre);
		this.tipo = tipo;
		vehiculosEnLaBatalla = new HashSet<>();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	protected Double getLatitud() {
		return latitud;
	}

	protected void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	protected Double getLongitud() {
		return longitud;
	}

	protected void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	protected String getTipo() { // con este tambien funciona
		String tipoBatalla = "";
		if (tipo == TERRESTRE)
			tipoBatalla = "TERRESTRE";
		if (tipo == NAVAL)
			tipoBatalla = "NAVAL";

		return tipoBatalla;
	}

	protected TipoDeBatalla getTipo2() {
		return tipo;
	}

	protected void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarBatalla(Vehiculo auto1) {

		return vehiculosEnLaBatalla.add(auto1);

	}
/*
	public Boolean agregarVehiculoALaBatalla(Vehiculo nuevo) {
		switch (tipo) {
		case TERRESTRE:
			if (nuevo instanceof Terrestre) {
				vehiculosEnLaBatalla.add(nuevo);
				return true;
			} else {
				// lanzar excepcion vehiculoincompatible
			}
		case NAVAL:
			if (nuevo instanceof Acuatico) {
				vehiculosEnLaBatalla.add(nuevo);
				return true;
			} else {
				// lanzar excepcion vehiculoincompatible
			}
		case AEREA:
			if (nuevo instanceof Volador) {
				vehiculosEnLaBatalla.add(nuevo);
				return true;
			} else {
				// lanzar excepcion vehiculoincompatible
			}
		}
		return false;
	}
*/
}
