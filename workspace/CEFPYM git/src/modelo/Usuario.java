package modelo;


import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

/** Cada persona registrada en el juego y sus opciones de configuración.
 * 
 * <p>
 * Cada usuario se compondrá de:
 * <ul>
 * <li>Un nombre de usuario</li>
 * <li>Una contraseña codificada</li>
 * <li>Opción de configuración de música</li>
 * <li>Opción de configuración de idioma</li>
 * <li>Opción de configuración de preferencia de imágenes Sí/No</li>
 * <li>Lista de los libros que haya completado</li>
 * <li>Ruta actual en el libro que se encuentre</li>
 * 
 * @author José Manuel Samper
 *
 */

public class Usuario{
		
		private String nombre;
		private String contraseña;
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
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
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