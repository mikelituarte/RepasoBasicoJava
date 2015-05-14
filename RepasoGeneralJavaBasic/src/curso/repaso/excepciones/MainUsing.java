package curso.repaso.excepciones;

//package val.examples.basic.exceptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;



/**
 * Desde la versi�n 7 de Java, se ha incorporado esta posibilidad, llamada
 * Manejo autom�tico de recursos  
 * o try with resources statement
 * 
 * Consiste en que a continuaci�n del try, puedo incluir una serie de sentencias
 * entre par�ntesis, donde declaro recursos, que autom�ticamente ser�n liberados
 * al salir del try
 * 
 * Los recursos (objetos) referidos en la secci�n, deben implementar la interfaz
 * java.lang.AutoCloseable
 * 
 * 
 * @author Vale
 *
 */
public class MainUsing {

		
	public static void main(String[] args) throws Throwable {
		
		String linea = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("nuevo.txt"))){
			
			linea = br.readLine();
			System.out.println(linea);
			
			bw.write(linea);
			
		}
	}
}