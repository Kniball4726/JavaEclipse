package principal;

public abstract  class Producto {
	
	static int contadorProductos;
	protected float precio;
	protected int stock;
	protected String nombre;
	protected int id;
	public Producto(float precio, int stock, String nombre) {
		super();
		contadorProductos++;
		this.id=contadorProductos;
		this.precio = precio;
		this.stock = stock;
		this.nombre=nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract void almacenar();
	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", stock=" + stock + ", nombre=" + nombre + ", id=" + id + "]";
	}
	
	
	
	

}
