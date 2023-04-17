package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	
	
	
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>(); 
		this.batallas=new HashMap<String, Batalla>();
	}


	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
		
	}
	
	public Vehiculo getVehiculo(Integer id) throws VehiculoInexistente {
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getId().equals(id)) {
				return vehiculo;
			}
		}
		throw new VehiculoInexistente("El vehículo solicitado no existe");
		
	}


	public Integer getCapacidadDeDefensa() {
		
//		for (Vehiculo vehiculo : convoy) {
//			System.out.println(vehiculo);
//		}
		return convoy.size();
	}


	public void crearBatalla(String nombreBatalla, TipoDeBatalla tipoBatalla, double latitud, double longiutd) {
		
		Batalla batalla1 = new Batalla (nombreBatalla, tipoBatalla, latitud, longiutd);
		
		batallas.put(nombreBatalla, batalla1);
		
	}


	public Batalla getBatalla(String string) {
		return batallas.get(string);
	}


	public Boolean enviarALaBatalla(String nombreBatalla, Integer idAuto) throws VehiculoInexistente, VehiculoIncompatible {
		
		Vehiculo auto1 = getVehiculo(idAuto);
		Batalla batalla1 = getBatalla(nombreBatalla);
			
			
		if(!auto1.toString().equals(batalla1.getTipo2().toString())) {
			throw new VehiculoIncompatible("El vehiculo es incompatible con el tipo de batalla");
		}
			
		return batalla1.agregarBatalla(auto1);
		
		
		
	}
	


	




}
