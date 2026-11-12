package principal;

public class Refrigerado extends Perecedero{
	
	private double temperatura;


	
	public Refrigerado(float precio, int stock, String nombre, String caducidad, String fechaElavoracion,
			double temperatura) {
		super(precio, stock, nombre, caducidad, fechaElavoracion);
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Refrigerado [temperatura=" + temperatura + ", caducidad=" + caducidad + ", fechaElavoracion="
				+ fechaElavoracion + ", precio=" + precio + ", stock=" + stock + ", nombre=" + nombre + ", id=" + id
				+ "]";
	}

	@Override
	public void almacenar() {
		// TODO Auto-generated method st
		System.out.println(nombre+ ": Necesita refrigeración a "+temperatura);
	}

	
	
	
	
	

}
