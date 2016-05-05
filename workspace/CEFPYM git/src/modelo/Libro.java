package modelo;
import java.util.Collections;
import java.util.SortedSet;

/**Es la unión de varias "Página".
 * <p>
 * Los libros podrán contener un número indeterminado de diferentes páginas.
 * Podrán ser creados tanto vacíos (para irlos rellenando), como con un <code>Set</code>
 * de páginas previamente hecho. (Hay que revisar esto).
 * </p>
 * 
 * @author José Manuel Samper
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
	
	/**Añade una página al libro establecido por parámetro.
	 * 
	 *<p>
	 *Añade una página a la colección de <code>Set</code> del
	 *libro que se recoja por parámetro. Al tratarse se un Sorted Set, la página se
	 *añadirá en orden de creación.
	 * </p>
	 * 
	 * @param pagina
	 * @param l
	 */
	
	public void añadirPagina (Pagina pagina, Libro l){
		
		for (Pagina p : l.paginas){
			
			if ( ! (p.equals ( pagina ) ) ){
				
				l.paginas.add(pagina);				
			}
			
			else {
				
				System.out.println("La página ya existe");
				
			}
		}
		
	}
	
}
