
public class Operaciones extends Persona{

	public Operaciones(String nombre, int edad, String sexo, double peso, double altura) {
		super(nombre, edad, sexo, peso, altura);
		
		double imc = peso/(altura*altura);
		
		System.out.print("IMC: " );
		
		System.out.printf("%1.2f", imc);	
		
		if(imc< 18.5) {
			System.out.println("\nBajo de Peso");
		}
		else if(imc>= 18.5 || imc<25) {
			System.out.println("\nPeso Ideal");
		}
		else {
			System.out.println("\nSobrepeso");
		}
		}
	
	

}
