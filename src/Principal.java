import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		Persona flaco = new Persona(10,"lucho",50d,LocalDate.of(2006,1,1));
		System.out.println(flaco.getAllInfo());
	}
}
