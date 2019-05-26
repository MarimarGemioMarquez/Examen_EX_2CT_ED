public class Directivo  extends Empleado {

	private double NIVEL;

	// Redefinimos el constructor para que incluya el nivel en el caso de ser un directivo
	public Directivo(String pnombre, int psueldo, double NIVEL) {
		super(pnombre, psueldo);
		this.NIVEL = NIVEL;
	}
	
	// Sobrecargamos el método imprimirDatos para incluir una nueva línea de código con el "nivel" del directivo.
	@Override
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("Nivel: " + NIVEL);
	}
	
	// creamos un método obtenerSalario que multiplica el sueldoBase por el nivel del directivo.
	public double obtenerSalario() {
		return this.sueldobase * this.NIVEL;
	}
}
