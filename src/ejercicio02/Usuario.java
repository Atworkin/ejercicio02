package ejercicio02;

public class Usuario {

	Lista lista;
	
	public Usuario(int num) {
		lista =new Lista(num);
		Producto p = new Producto("Lechita");
		lista.add(p);
		System.out.println(lista.shoAll());
		
	}
}
