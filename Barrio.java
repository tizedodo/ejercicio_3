package ejercicio_3;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	
	//dodo
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	public void mostrarPropiedades() {
		for(Propiedad p: this.propiedades) {
			System.out.println(p);
		}
	}
	
	
	
	public void mostrarPropiedades(TipoPropiedad tipo) {
		
		for(Propiedad p: this.propiedades) {
			if (p.getTipo().equals(tipo)) {
				System.out.println(p);
            }
		}
	}
	
	
	public void agregarPropiedad(Propiedad propiedad) {
		if(propiedad != null) {
			this.propiedades.add(propiedad);
		}
	}
	
	
	
	public int getSizeProdiedad() {
		return propiedades.size();
	}
	
	
	
}
