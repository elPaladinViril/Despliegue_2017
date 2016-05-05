package modelo;
import java.util.SortedSet;
import javax.swing.ImageIcon;

/** Unidad b�sica de CEFPYM.
 * <p>
 * Las p�ginas son los elementos b�sicos de CEFPYM. La uni�n de varias p�ginas conformar�
 * un libro. Se compondr�n de:
 * <ul>
 * <li>Un c�digo num�rico que las identifique</li>
 * <li>Un texto de aventura</li>
 * <li>Una imagen del evento, relacionada con el texto</li>
 * <li>Una lista de las p�ginas con las que enlace, a continuaci�n</li>
 * </ul>
 * </p>
 *  
 * @author Jos� Manuel Samper
 *
 */

public class Pagina {
	
	private int codigoPagina;
	private int codigoLibroAlQuePertenece;
	private String textoPagina;
	private ImageIcon imagenPagina;
	private SortedSet <Pagina> paginasEnlace;
	
	
	public Pagina (int cp, String tp, ImageIcon ip, int cl, SortedSet<Pagina> penlace){
		
		codigoPagina=cp;
		textoPagina=tp;
		imagenPagina=ip;
		codigoLibroAlQuePertenece=cl;
		paginasEnlace=penlace;
		
	}
	
	public int getNumeroPagina() {
		return codigoPagina;
	}		
	public void setNumeroPagina(int numeroPagina) {
		this.codigoPagina = numeroPagina;
	}
	public String getTextoPagina() {
		return textoPagina;
	}
	
	public int getCodigoPagina() {
		return codigoPagina;
	}

	public void setCodigoPagina(int codigoPagina) {
		this.codigoPagina = codigoPagina;
	}

	public int getCodigoLibroAlQuePertenece() {
		return codigoLibroAlQuePertenece;
	}

	public void setCodigoLibroAlQuePertenece(int codigoLibroAlQuePertenece) {
		this.codigoLibroAlQuePertenece = codigoLibroAlQuePertenece;
	}

	public SortedSet<Pagina> getPaginasEnlace() {
		return paginasEnlace;
	}

	public void setPaginasEnlace(SortedSet<Pagina> paginasEnlace) {
		this.paginasEnlace = paginasEnlace;
	}

	public void setTextoPagina(String textoPagina) {
		this.textoPagina = textoPagina;
	}
	public ImageIcon getImagenPagina() {
		return imagenPagina;
	}
	public void setImagenPagina(ImageIcon imagenPagina) {
		this.imagenPagina = imagenPagina;
	}
	
	@Override
	public String toString() {
		return "Pagina [codigoPagina=" + codigoPagina + ", codigoLibroAlQuePertenece=" + codigoLibroAlQuePertenece
				+ ", textoPagina=" + textoPagina + ", imagenPagina=" + imagenPagina + ", paginasEnlace=" + paginasEnlace
				+ "]";
	}
	

}
