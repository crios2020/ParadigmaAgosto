abstract class Persona{
	String nombre;
	String apellido;
}

class Alumno extends Persona{
	private int nota;
	public void setNota(int nota){
		this.nota=nota;
	}
}

final class Profesor extends Persona{ //una clase final, evita la creación de clases hijas
	void evaluar(Alumno alumno){
		alumno.setNota(7);
	}
}

public class Programa3{
	public static void main(String[] args){
		//Persona p=new Persona();
		Alumno juan=new Alumno();
		Profesor pedro=new Profesor();
		pedro.evaluar(juan);
		
		class ProfesorTrucho extends Profesor{
			//sobreEscritura de método
			void evaluar(Alumno alumno){
				alumno.setNota(10);
			}
		}
		ProfesorTrucho profeTrucho=new ProfesorTrucho();
		profeTrucho.evaluar(juan);
		
	}
}
