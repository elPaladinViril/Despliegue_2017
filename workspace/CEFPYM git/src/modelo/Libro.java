package modelo;
import java.util.Collections;
import java.util.SortedSet;

/**Es la uni�n de varias "P�gina".
 * <p>
 * Los libros podr�n contener un n�mero indeterminado de diferentes p�ginas.
 * Podr�n ser creados tanto vac�os (para irlos rellenando), como con un <code>Set</code>
 * de p�ginas previamente hecho. (Hay que revisar esto).
 * </p>
 * 
 * @author Jos� Manuel Samper
 *
 */

public class Libro {

	private String nombre;
	private SortedSet <Pagina> paginas;
	private int numeroPaginas;
	
	public Libro (String n){
		
		nombre=n;
		paginas=null;
		numeroPaginas=0;
		
	}
	
	public Libro (String n, SortedSet <Pagina> p){
		
		nombre=n;
		paginas=p;
		numeroPaginas=paginas.size();
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SortedSet<Pagina> getPaginas() {
		return paginas;
	}

	public void setPaginas(SortedSet<Pagina> paginas) {
		this.paginas = paginas;
	}
	
	/**A�ade una p�gina al libro establecido por par�metro.
	 * 
	 *<p>
	 *A�ade una p�gina a la colecci�n de <code>Set</code> del
	 *libro que se recoja por par�metro. Al tratarse se un Sorted Set, la p�gina se
	 *a�adir� en orden de creaci�n.
	 * </p>
	 * 
	 * @param pagina
	 * @param l
	 */
	
	public void a�adirPagina (Pagina pagina, Libro l){
		
		for (Pagina p : l.paginas){
			
			if ( ! (p.equals ( pagina ) ) ){
				
				l.paginas.add(pagina);				
			}
			
			else {
				
				System.out.println("La p�gina ya existe");
				
			}
		}
		
	}
	
}
