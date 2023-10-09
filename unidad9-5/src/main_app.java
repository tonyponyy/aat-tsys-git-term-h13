
public class main_app {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Jaime", 14, true, 7.5);
		Estudiante estudiante2 = new Estudiante("Luis", 15, true, 8.2);
		Estudiante estudiante3 = new Estudiante("Maria", 13, false, 6.8);
		Estudiante estudiante4 = new Estudiante("Eduardo", 16, true, 4.0);
		Estudiante estudiante5 = new Estudiante("Lara", 12, false, 7.1);
		Estudiante estudiante6 = new Estudiante("Isaura", 14, false, 0.5);
		Estudiante estudiante7 = new Estudiante("Begoña", 15, false, 6.2);
		Estudiante estudiante8 = new Estudiante("Luisa", 13, false, 9.3);
		Estudiante estudiante9 = new Estudiante("Anodino", 16, true, 7.9);
		Estudiante estudiante10 = new Estudiante("Beldemucio", 14, true, 3);
		Profesor profesor = new Profesor("Manolita", 45, false, "FISICA");
		Estudiante[] estudiantes = { estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6,
				estudiante7, estudiante8, estudiante9, estudiante10 };
		Aula aula = new Aula(43, "Einsteins", 10, profesor, "FISICA", estudiantes);

		if (aula.darClase()) {
			for (int i = 0; i < estudiantes.length; i++) {
				if (estudiantes[i].getCalificacion() >= 5) {
					System.out.println( estudiantes[i].getNombre()+" ha sacado un "+estudiantes[i].getCalificacion());
				}
			}
			aula.aprobados();
		} else {
			System.out.println("Hoy no hay clase.");
		}

	}

}
