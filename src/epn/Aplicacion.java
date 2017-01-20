package epn;

public class Aplicacion {

	public static void main(String[] args) {
		ListaEnlazadaDo lista= new ListaEnlazadaDo();
		lista.insertarInicio("prueba 1");
		lista.insertarInicio("prueba 2");
		lista.insertarFinal("prueba 3");
		lista.insertarInicio("prueba 4");
		lista.insertarFinal("prueba 5");
		lista.insertarInicio("0");
		lista.imprimir();
		lista.imprimirRev();
		
		try{
		System.out.println(lista.buscarInf("prueba 5").getElemento());
		}catch(NullPointerException e){
			System.out.println("No se encuentra en la lista");
		}
		try{
		System.out.println(lista.buscarInd(1).getElemento());
		}catch(NullPointerException ex){
			System.out.println("La posicion requerida no existe en la lista");
		}
		System.out.println("");
		lista.eliminarDato("prueba 4");
		lista.imprimir();
		
	}

}
