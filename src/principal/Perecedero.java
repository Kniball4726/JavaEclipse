package principal;

public abstract class  Perecedero extends Producto{
	
	protected String caducidad;
	protected String fechaElavoracion;
	
	

	public Perecedero(float precio, int stock, String nombre, String caducidad, String fechaElavoracion) {
		super(precio, stock, nombre);
		this.caducidad = caducidad;
		this.fechaElavoracion = fechaElavoracion;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public String getFechaElavoracion() {
		return fechaElavoracion;
	}

	@Override
	public String toString() {
		return "Perecedero [caducidad=" + caducidad + ", fechaElavoracion=" + fechaElavoracion + ", precio=" + precio
				+ ", stock=" + stock + ", nombre=" + nombre + ", id=" + id + "]";
	}

	

	
	
	
	
	

}
