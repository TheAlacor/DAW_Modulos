import com.courses.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Estudiante student0 = new Estudiante("12345678P", "Bob");
			Estudiante[] estudiante = {
				new Estudiante(student0),
				new Estudiante(student0),
				new Estudiante(student0),
				new Estudiante(student0),
				new Estudiante(student0)
			};

			Curso curso = new Curso("Fisica", "Erwin Schrödinger", estudiante);

			curso.mostrarInformacion();
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}