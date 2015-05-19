package curso.repaso.basico;

import java.util.Iterator;
import java.util.function.Consumer;

public class Recorrer implements Iterator<Persona> {
	
	
	private int cursor;
	private ListaPersonas listaPersonas;
	
	public Recorrer(ListaPersonas listaPersonas){
		this.cursor =0;
		this.listaPersonas = listaPersonas;
	}
	
	
	@Override
	public void forEachRemaining(Consumer<? super Persona> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (this.cursor < this.listaPersonas.getCantidadPersonas());
	}

	@Override
	public Persona next() {
		// TODO Auto-generated method stub
		
		Persona siguinte = null;
		
		siguinte = this.listaPersonas.getListaPersonas()[this.cursor];
		this.cursor++;
		
		return siguinte;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
