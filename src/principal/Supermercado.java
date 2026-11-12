package principal;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private ArrayList<Producto> inventario=new ArrayList<Producto>();
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Producto> getInventario() {
		return inventario;
	}
	public void creaProducto(Producto p) {
		this.inventario.add(p);
	}
	
	public void almacenar() {
		for(Producto p : inventario){
			p.almacenar();
		}
	}
	@Override
	public String toString() {
		return "Supermercado [nombre=" + nombre + ", inventario=" + inventario + "]";
	}
	
	
	
}
