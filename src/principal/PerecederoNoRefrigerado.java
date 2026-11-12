package principal;

public class PerecederoNoRefrigerado extends Perecedero implements Impuestos {
	private String tamagno;

	

	public PerecederoNoRefrigerado(float precio, int stock, String nombre, String caducidad, String fechaElavoracion,
			String tamagno) {
		super(precio, stock, nombre, caducidad, fechaElavoracion);
		this.tamagno = tamagno;
	}

	public String getTamagno() {
		return tamagno;
	}

	public void setTamagno(String tamagno) {
		this.tamagno = tamagno;
	}

	@Override
	public void almacenar() {
		System.out.println(nombre+ ": Necesito una gondola de tamaño "+tamagno);
		
	}

	@Override
	public String toString() {
		return "PerecederoNoRefrigerado [tamagno=" + tamagno + ", caducidad=" + caducidad + ", fechaElavoracion="
				+ fechaElavoracion + ", precio=" + precio + ", stock=" + stock + ", nombre=" + nombre + ", id=" + id
				+ "]";
	}

	@Override
	public void agregarIva() {
		this.precio+=this.precio*(iva/100);
		
	}

	@Override
	public void agregarExtraImpuestos() {
		// TODO Auto-generated method stub
		System.out.println("No tiene extras");
		
	}
	
	
	

}
