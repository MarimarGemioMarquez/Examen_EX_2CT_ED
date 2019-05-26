
public class Main {

	public static void main(String[] args) {

		System.out.println("Inicio de programa");
		// Creamos un nuevo directivo
		Directivo directivo = new Directivo("Jose Luis Perales", 1000, 3);
		// Imprimimos los datos del Empleado + la clase Directivos.
		directivo.imprimirDatos();
		// Mostramos los datos del sueldo como directivo
		System.out.println("Sueldos como directivo : " + directivo.obtenerSalario());
		System.out.println("Fin de programa");

	}

}
