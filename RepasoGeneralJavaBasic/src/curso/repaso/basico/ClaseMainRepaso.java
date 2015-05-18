package curso.repaso.basico;

import curso.repaso.excepciones.InsertarPersonaException;

public class ClaseMainRepaso {

	private static void mostrarPersonas(Persona[] array){
		for (int i = 0; i<array.length; i++){
			if(array[i] !=null){
				System.out.println(array[i].toString());
			}
		}
	}
	
	public static void main(String[] args) throws InsertarPersonaException {
		Persona p1 = new Persona("AAA", 10);
		Persona p2 = new Persona("BBB", 23);
		Persona p3 = new Persona("ccc", 25);
		
		Persona p4 = new Persona("aaa", 10);
		Persona p5 = new Persona("bbb", 23);
		Persona p6 = new Persona("www", 25);
		Persona p7 = new Persona("rrr", 10);
		Persona p8 = new Persona("ttt", 23);
		Persona p9 = new Persona("yyy", 25);
		Persona p10 = new Persona("iii", 25);
		Persona p11 = new Persona("mmm", 25);
		
		ListaPersonas lPersona = new ListaPersonas();
		ListaPersonas lPersonas2 = null;
		Persona[] arrayPersonas = null;
		
		System.out.println("muestro la lista al uniciar el programa, deberia estar vacia");
		lPersona.mostrar();
		System.out.println("Inserto p1 nueva");
		lPersona.insertarPersona(p1);
		lPersona.mostrar();
		
		System.out.println("Inserto p2 que no existe");
		lPersona.insertarPersona(p2);
		lPersona.mostrar();
		
		System.out.println("Inserto una persona que ya existe el nombre");
		lPersona.insertarPersona(p3);
		lPersona.mostrar();
		
		System.out.println("Serializo el array");
		lPersona.serializar();
		
		System.out.println("Deserialozo el array");
		arrayPersonas = lPersona.deserializar();
		mostrarPersonas(arrayPersonas);
		
		System.out.println("Elimino una persona que no existe");
		lPersona.mostrar();
		lPersona.eliminarPersona("hola");
		
		System.out.println("Elimino una persona que Existe");
		lPersona.mostrar();
		lPersona.eliminarPersona("BBB");
		System.out.println("muestro la lista al borrar una persona");
		lPersona.mostrar();
		/*
		arrayPersonas = lPersona.deserializar();
		System.out.println("mostramos el fichero deserializado");
		lPersona.mostrar();*/
		System.out.println("Inserto una persona que ya existe el nombre");
		lPersona.insertarPersona(p3);
		lPersona.insertarPersona(p4);
		lPersona.insertarPersona(p5);
		lPersona.insertarPersona(p6);
		lPersona.insertarPersona(p7);
		lPersona.insertarPersona(p8);
		lPersona.insertarPersona(p9);
		lPersona.insertarPersona(p10);
		lPersona.insertarPersona(p11);
		lPersona.insertarPersona(p2);
		
		lPersona.mostrar();
		
		System.out.println("aqui");
		
	}
	
}
