public class Directivo  extends Empleado {

	private double NIVEL;

	// Redefinimos el constructor para que incluya el nivel en el caso de ser un directivo
	public Directivo(String pnombre, int psueldo, double NIVEL) {
		super(pnombre, psueldo);
		this.NIVEL = NIVEL;
	}
	
	// Sobrecargamos el m�todo imprimirDatos para incluir una nueva l�nea de c�digo con el "nivel" del directivo.
	@Override
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("Nivel: " + NIVEL);
	}
	
	// creamos un m�todo obtenerSalario que multiplica el sueldoBase por el nivel del directivo.
	public double obtenerSalario() {
		return this.sueldobase * this.NIVEL;
	}
}
