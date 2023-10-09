
public class Estudiante extends Persona {
	
	final private double APROBADO = 5;
	final private int EDAD_MAXIMA = 18;
	final private int EDAD_MINIMA = 10;
	final private int EDAD_DEFECTO = 12;
	
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
		if ( edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA ) {
			this.edad = edad;
		}else {
			System.out.println("Edad invalida. "+ EDAD_DEFECTO + " asignado por defecto");
			this.edad = EDAD_DEFECTO;
		}
		
		
	}

	public boolean asistencia () {
		if (Math.random()> 0.5){
			return true;
		}else {
			return false;
		}

	}
}
