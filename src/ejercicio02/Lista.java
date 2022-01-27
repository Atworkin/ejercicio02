package ejercicio02;

public class Lista {

	Producto[] listaProductos;

	public Lista(int num) {
		this.listaProductos = new Producto[num];
	}

	public boolean add(Producto p) {
		// TODO agregar producto a lista
		
		if(this.listaProductos[this.listaProductos.length-1] == null) {
			for (int i = 0;i<listaProductos.length;i++) {
				if(this.listaProductos[i] == null) {
				this.listaProductos[i] = p;
				return true;
				}
			}
			
		}
	
		return false;
	}
	
	public String shoAll() {
		String result ="";
		for (int i = 0; i < listaProductos.length; i++) {
			if(listaProductos[i]!=null) {
			result += listaProductos[i].toString();}
		}
		
		/*
		for (Producto producto : listaProductos) {
			result += producto.toString();
		}
		*/
		return result;
	}
	

	
}
