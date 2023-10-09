
public class Aula {

	protected int id;
	protected String nombre_aula;
	protected int num_estudiantes;
	protected Profesor profe;
	protected String asignatura;
	protected Estudiante[] distribucion;
	
	public Aula() {
		this.id = 10;
		this.nombre_aula = "";
		this.num_estudiantes = 50;
		this.profe = null;
		this.asignatura = "";
		this.distribucion = null;
	}
	
	public Aula(int id, String nombre_aula, int num_estudiantes, Profesor profe, String asignatura,
			Estudiante[] distribucion) {
		this.id = id;
		this.nombre_aula = nombre_aula;
		this.num_estudiantes = num_estudiantes;
		this.profe = profe;
		this.asignatura = asignatura;
		this.distribucion = distribucion;
	}
	
	public boolean darClase() {
		int asist = 0;
		for (int i = 0; i<distribucion.length;i++) {
			if (distribucion[i].asistencia()) {
				asist++;
			}
		}
		if(profe.asistencia() && asist >= distribucion.length/2 ) {
			return true;		
		}
		return false;
		
	}
	
	public void aprobados() {
		int h = 0;
		int m = 0;
			for (int i = 0; i<distribucion.length;i++) {
				if (distribucion[i].calificacion >= 5) {
					if (distribucion[i].getSexo()) {
					h++;	
					}else {
					m++;
					}
				}
			}
		System.out.println("Hay: "+h+" hombres y "+ m +" mujeres aprobados.");
	}
	
}
