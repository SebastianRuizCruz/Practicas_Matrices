import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa tu Nombre");		
		String nombre = sc.next();
		System.out.println("Ingresa tu edad");
		int edad = sc.nextInt();
		System.out.println("Ingresa sexo");
		String sexo = sc.next();
		System.out.println("Ingresa tu peso (Kg)");
		double peso = sc.nextDouble();
		System.out.println("Ingresa tu estatura (mts) ");
		double altura = sc.nextDouble();
		
		System.out.println("\n ******************** \n");
				
		Operaciones o = new Operaciones(nombre, edad, sexo, peso, altura);
		
		System.out.println("Nombre: " + o.getNombre());
		System.out.println("Edad: " + o.getEdad());
		System.out.println("Sexo: " + o.getSexo());
		System.out.println("Peso: " + o.getPeso());
		System.out.println("Estatura: " + o.getAltura());
		
		System.out.println(o.toString());
		
		
		
	}

}
