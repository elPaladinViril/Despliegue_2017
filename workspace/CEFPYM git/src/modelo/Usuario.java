package modelo;


import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

/** Cada persona registrada en el juego y sus opciones de configuraci�n.
 * 
 * <p>
 * Cada usuario se compondr� de:
 * <ul>
 * <li>Un nombre de usuario</li>
 * <li>Una contrase�a codificada</li>
 * <li>Opci�n de configuraci�n de m�sica</li>
 * <li>Opci�n de configuraci�n de idioma</li>
 * <li>Opci�n de configuraci�n de preferencia de im�genes S�/No</li>
 * <li>Lista de los libros que haya completado</li>
 * <li>Ruta actual en el libro que se encuentre</li>
 * 
 * @author Jos� Manuel Samper
 *
 */

public class Usuario{
		
		private String nombre;
		private String contrase�a;
		private boolean musica;
		private boolean idioma;
		private boolean imagenes;
		private SortedMap <Libro, Pagina> librosDisponibles;
		private SortedSet <Pagina> rutaActual;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getContrase�a() {
			return contrase�a;
		}
		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}
		public boolean isMusica() {
			return musica;
		}
		public void setMusica(boolean musica) {
			this.musica = musica;
		}
		public boolean isIdioma() {
			return idioma;
		}
		public void setIdioma(boolean idioma) {
			this.idioma = idioma;
		}
		public boolean isImagenes() {
			return imagenes;
		}
		public void setImagenes(boolean imagenes) {
			this.imagenes = imagenes;
		}
		public SortedMap<Libro, Pagina> getLibrosDisponibles() {
			return librosDisponibles;
		}
		public void setLibrosDisponibles(SortedMap<Libro, Pagina> librosDisponibles) {
			this.librosDisponibles = librosDisponibles;
		}
		public SortedSet<Pagina> getRutaActual() {
			return rutaActual;
		}
		public void setRutaActual(SortedSet<Pagina> rutaActual) {
			this.rutaActual = rutaActual;
		}		
	
}