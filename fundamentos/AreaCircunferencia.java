package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		
		// para criar uma 'constante' em java, use a palavra reservada final
		// por convenção, usa-se nome de constante com letra mainúscula
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área: " + area + "m2.");
		
		
	}

}
