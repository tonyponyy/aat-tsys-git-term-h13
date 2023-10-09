
public class Estudiante extends Persona {
	
	final private double APROBADO = 5;
	protected double calificacion;
	
	public Estudiante() {
		super();
		this.calificacion = 0;
	}

	public Estudiante(String nombre, int edad, boolean sexo, double calificacion) {
		super(nombre, edad, sexo);
		if (calificacion > 0 && calificacion < 11) {
			this.calificacion = calificacion;
		}
		else {
			System.out.println("Calificacion invalida. "+ APROBADO + " asignado por defecto");
			this.calificacion = APROBADO;
		}
	}

	
	
}
