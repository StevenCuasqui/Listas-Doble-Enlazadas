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
		if(vacio()){
			cabeza=actual;
			//cola=actual;
			}
		else{
			actual.setSiguiente(cabeza);
			cabeza.setAnterior(actual);
			cabeza=actual;
		}
	}
	
	public void insertarFinal(String elem){
		Nodo actual= new Nodo(elem);
		if(vacio()){
			cabeza=actual;
			cola=actual;
		}
		else{
			Nodo p=cabeza;
			while(p.getSiguiente()!=null){
				p=p.getSiguiente();
			}
			p.setSiguiente(actual);
			actual.setAnterior(p);
			cola=actual;
		}
	}
	
	public Nodo buscarInf(String dato){
		Nodo buscador;
		for(buscador=cabeza;buscador!=null;buscador=buscador.getSiguiente()){
			if(dato==buscador.getElemento()){
				return buscador;
			}
		}return null;
	}
	
	public Nodo buscarInd(int ref){
		if(cabeza!=null){
			Nodo buscador= cabeza;
			int ind=1;
			for(buscador=cabeza;(buscador!=null)&&(ind<=ref);ind++){
				if(ind==ref){
					return buscador;
				}
				buscador=buscador.getSiguiente();
			}
				
			}return null;
		}
	
	public void eliminarDato(String elem){
		Nodo actual, anterior;
		boolean comprobador;
	
		actual=cabeza;
		anterior=null;
		comprobador=false;
		
		while ((actual!=null) && (comprobador==false)){
			comprobador=(actual.getElemento()==elem);
		
			if (comprobador==false){
				anterior=actual;
				actual=actual.getSiguiente();
			}
		}
		
		if (actual!=null){
			if (actual==cabeza){
				cabeza=actual.getSiguiente();
			}
			else{
				anterior.setSiguiente(actual.getSiguiente());
			}
		actual=null;
		}
		
	}
	
	public void imprimir(){
		if(vacio()){
			System.out.println("Vacia \n");
		}
		
		Nodo actual=cabeza;
		while(actual!=null){
			System.out.println(actual.getElemento());
			actual=actual.getSiguiente();
		}
		System.out.println("");
	}
	
	public void imprimirRev(){
		if(vacio()){
			System.out.println("Vacia \n");
	}
		Nodo actual=cola;
		while(actual!=null){
			System.out.println(actual.getElemento());
			actual=actual.getAnterior();
		}
		System.out.println("");
	}
}
