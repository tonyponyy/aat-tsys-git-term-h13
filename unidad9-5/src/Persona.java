
public class Persona {

	protected String nombre;
	protected int edad;
	protected boolean sexo;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = true;
	}
	
	public Persona(String nombre, int edad, boolean sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	public boolean asistencia () {
		return true;
		
	}
}
