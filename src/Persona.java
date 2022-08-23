import java.time.LocalDate;
import java.time.Period;
public class Persona {
	//Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
	private String nombre;
	private int edad;
	private LocalDate fechaNacimiento;
	private int DNI;
	private char sexo;
	private double peso;
	private double altura;
		
	public Persona(int DNI) {
		this.setDefecto();
		this.DNI = DNI;
	}
	public Persona(int DNI, String nombre,Double peso) {
		this.setDefecto();
		this.DNI = DNI;
		this.nombre = nombre;
		this.peso = peso;
	}
	public Persona(int DNI, String nombre,Double peso,LocalDate fechaNacimiento) {
		this.setDefecto();
		this.DNI = DNI;
		this.nombre = nombre;
		this.peso = peso;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/*Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
	de masa corporal el cual es peso / altura2*/
	public boolean checkCumple() {
		LocalDate hoy = LocalDate.now();
		return hoy.getDayOfMonth() == this.fechaNacimiento.getDayOfMonth() && hoy.getMonthValue() == this.fechaNacimiento.getMonthValue()
;	}
	public double getIMC() {
		double resultado = 0d;
		if(this.altura != 0d) { //sin llave = primera linea
			resultado = (this.peso / (this.altura * this.altura));
		}
		return resultado;
	}
	public boolean checkVotar() {
		return(getEdad() >= 16);
	}
	public boolean checkMayor() {
		return(getEdad() >= 18);
	}
	
	public boolean checkForma() {
		return (this.getIMC() > 18.5) && (this.getIMC() < 25d);
	}
	public boolean checkCoherente() {
		return getEdad() == this.edad; 
	}
	
	//getters and setters
	public String getAllInfo() {
		return (this.nombre + "\n" + this.edad + "\n" + this.fechaNacimiento + "\n" + this.DNI + "\n" + this.sexo + "\n" + this.peso + "\n" + this.peso + "\n" + this.altura);
	}
	public void setDefecto() {
		this.fechaNacimiento = LocalDate.of(2000,1,1);
		this.sexo = 'f';
		this.peso = 1d;
		this.altura = 1d;
		this.edad = getEdad();
	}
	public int getEdad(){
		LocalDate hoy = LocalDate.now();
		Period period = Period.between(this.fechaNacimiento, hoy);
		return period.getYears();
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
