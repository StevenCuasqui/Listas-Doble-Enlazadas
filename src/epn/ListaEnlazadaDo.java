package epn;

public class ListaEnlazadaDo {
	
	protected Nodo cabeza;
	protected Nodo cola;
	protected long tam;
	
	
	public ListaEnlazadaDo() {
		this.tam=0;
		this.cabeza=this.cola=null;
	}

	public ListaEnlazadaDo(long tamaño) {
		this.tam=tamaño;
		this.cabeza=this.cola=null;
	}
	
	public boolean vacio(){
		return cabeza==null;
	}
	
	public void insertarInicio(String elem){
		Nodo actual= new Nodo(elem);
		actual.setSiguiente(cabeza);
		
		if(vacio()!=false){
			cabeza=actual;
			cabeza.setAnterior(actual);
			}
	}
	
	public void imprimir(){
		if(vacio()){
			System.out.println("Vacia \n");
			return;
		}
		
		Nodo actual=cabeza;
		while(actual!=null){
			System.out.println(actual.getElemento());
			actual=actual.getSiguiente();
		}
		System.out.println("\n");
	}
	
	
	
	
	

}
