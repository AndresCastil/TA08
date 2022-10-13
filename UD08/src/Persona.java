
public class Persona {

	// Atributos

	private String nombre;
	private int edad;
	private String dni;
	private final char SEXO = 'H';
	private double peso;
	private double altura;

	// Constructor por defecto

	public Persona() {
		}


	// Constructor con todos los atributos como parámetro

	public Persona(String nombre, int edad, String dni, char SEXO, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		SEXO = 'H';
		this.peso = peso;
		this.altura = altura;
	}

}
