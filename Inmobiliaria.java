package ejercicio_3;

import java.util.ArrayList;

public class Inmobiliaria {
	private ArrayList<Barrio> barrios;

	public Inmobiliaria() {
		barrios = new ArrayList<Barrio>();
	}
	
	
	
	public void agregarBarrio(Barrio barrio) {
		if(barrio!=null) {
			this.barrios.add(barrio);
		}
	}
	
	
	
	
	public void monstrarPropiedades() {
		for(Barrio b: this.barrios) {
			System.out.println("Barrio:"+b.getNombre());
			b.mostrarPropiedades();
		}
	}
	
	
	
	 public void mostrarPropiedades(TipoPropiedad tipo) {
	        for (Barrio b : barrios) {
	            b.mostrarPropiedades(tipo);
	        }
	    }
	

	 public ArrayList<Barrio> obtenerBarrioMaxProp() {
	        ArrayList<Barrio> barriosMaxProp = new ArrayList<>();
	        
	        int maxProp = 0;
	        
	        for (Barrio b : barrios) {
	        	
	            int cantidadPropiedad = b.getSizeProdiedad();
	            
	            if (cantidadPropiedad > maxProp) {
	                barriosMaxProp.add(0,b);
	                maxProp = cantidadPropiedad;
	            } else if (cantidadPropiedad < maxProp) {
	                barriosMaxProp.add(b);
	            }
	        }
	        return barriosMaxProp;
	    }
	

	 public void mostrarBarrioMaxProp() {
	        ArrayList<Barrio> barriosMaxProp = obtenerBarrioMaxProp();
	        
	        for (Barrio b : barriosMaxProp) {
	            System.out.println(b.getNombre()+" con: "+b.getSizeProdiedad());
	        }
	    }
	
	
	
	
	
}
