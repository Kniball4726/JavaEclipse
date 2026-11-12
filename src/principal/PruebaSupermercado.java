package principal;
import java.util.Scanner;

public class PruebaSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supermercado coto= new Supermercado("Coto");
		
		int opcion=0;
		
		while(opcion!=9) {
			opcion=menuProductos();
			switch (opcion){
			
				case 1:
					coto.getInventario().add(creaProducto());
					break;
				case 5:
					System.out.println(coto.getInventario());
			
			}
		}
		
		
	}
	public static int menuProductos() {
		System.out.println("Menu de Productos");
		System.out.println("1.-Crea Producto");
		System.out.println("2.-Borrra Producto");
		System.out.println("3.-Modifica Producto");
		System.out.println("4.-Busca Producto");
		System.out.println("5.-Muestra todos los Producto");
		
		int op=leeEntero();
		return op;
	}

	public static int leeEntero() {
		Scanner lee= new Scanner(System.in);
		int numero=lee.nextInt();
		return numero;
	}
	
	public static String leeString() {
		Scanner lee= new Scanner(System.in);
		String texto=lee.nextLine();
		return texto;
	}
	
	public static double leeDouble() {
		Scanner lee= new Scanner(System.in);
		double decimales=lee.nextDouble();
		return decimales;
	}
	public static float leeFloat() {
		Scanner lee= new Scanner(System.in);
		float decimales=lee.nextFloat();
		return decimales;
	}
	
	public static Producto creaProducto(){
		String nombre;
		float precio;
		int stock;
		String caducidad;
		String creacion;
		int tipo;
		System.out.println("1.-Refrigerado 2.-No Refrigerado");
		tipo=leeEntero();
		System.out.println("Nombre: ");
		nombre=leeString();
		System.out.println("Precio: ");
		precio=leeFloat();
		System.out.println("Stock: ");
		stock=leeEntero();
		System.out.println("Fecha caducidad: ");
		caducidad=leeString();
		System.out.println("Fecha elavoración");
		creacion=leeString();
		Producto p;
		if(tipo==1) {
			System.out.println("Temperatura");
			double temperatura=leeDouble();
			p= new Refrigerado(precio,stock,nombre,caducidad,creacion,temperatura);
		}
		else{
			System.out.println("Tamaño");
			String tamagno=leeString();
			p= new PerecederoNoRefrigerado(precio,stock,nombre,caducidad,creacion,tamagno);
		}
		
		return p;
		
	}
}
