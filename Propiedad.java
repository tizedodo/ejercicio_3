package ejercicio_3;

public class Propiedad {
	private String domicilio;
	private int    precio;
	private TipoPropiedad tipo;
	
	
	public Propiedad(String domicilio, int precio, TipoPropiedad tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}


	public TipoPropiedad getTipo() {
		return tipo;
	}


	@Override
	public String toString() {
		return "Propiedad > Domicilio: " + domicilio + ", precio: " + precio +" pesos"+ ", tipo: " + tipo;
	}
	
	
	
	
	

}
