
public class Profesor extends Persona {
	
	final private String MATERIA_DEFECTO = "FISICA";
	protected String materia;
	
	public Profesor() {
		super();
		this.materia = "";
	}

	public Profesor(String nombre, int edad, boolean sexo, String materia) {
		super(nombre, edad, sexo);
		if (materia.compareToIgnoreCase("FISICA") == -1 &&materia.compareToIgnoreCase("MATEMATICAS") ==-1 &&materia.compareToIgnoreCase("FILOSOFIA") == -1) {
			this.materia = MATERIA_DEFECTO;
		}else {
			this.materia = materia;
		}
	}

	public boolean asistencia () {
		if (Math.random()> 0.2){
			return true;
		}else {
			return false;
		}

	}
}