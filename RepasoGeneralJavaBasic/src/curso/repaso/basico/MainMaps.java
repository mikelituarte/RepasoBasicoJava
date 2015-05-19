package curso.repaso.basico;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class MainMaps {

	
	public static void main(String[] args) {
		//practica 3
		Map lhm =  new LinkedHashMap<Integer, Persona>();
		
		lhm.put(5, new Persona("AAA", 8));
		lhm.put(7, new Persona("BBB", 45));
		lhm.put(2, new Persona("CCC", 12));
		
		System.out.println(lhm);
		
		Map thm = new TreeMap<Integer, Persona>();
		
		thm.put(5, new Persona("AAA", 8));
		thm.put(7, new Persona("BBB", 98));
		thm.put(2, new Persona("CCC", 12));
		System.out.println(thm);
		
		
		Map<Persona, Persona> thm1 = new TreeMap<Persona, Persona>();
		Persona p1 = new Persona("ZZZ", 20);
		Persona p2 = new Persona("XXX", 30);
		Persona p3 = new Persona("CCC", 40);
		Persona p4 = new Persona("VVV", 60);
		Persona p5 = new Persona("BBB", 80);
		
		thm1.put(p1, p2);
		thm1.put(p2, p1);
		thm1.put(p3, p3);
		thm1.put(p4, p4);
		thm1.put(p5, p4);
		//System.out.println(thm1);
		Iterator<>
		
	}
}
