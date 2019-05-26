
public class Main {

	public static void main(String[] args) {

		// Creamos un nuevo directivo
		Directivo directivo = new Directivo("Jose Luis Perales", 1000, 3);
		// Imprimimos los datos del Empleado + la clase Directivos.
		directivo.imprimirDatos();
		// Mostramos los datos del sueldo como directivo
		System.out.println("Sueldo como directivo : " + directivo.obtenerSalario());

	}

}
