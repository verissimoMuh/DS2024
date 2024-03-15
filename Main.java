
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Quadrado primeiro = new Quadrado();
		primeiro.base = 40;
		primeiro.altura = 50;
		
		System.out.println(primeiro.base);
		System.out.println(primeiro.altura);
		
	
		
		
		
		Quadrado  segundo = new Quadrado();
		segundo.base = 80;
		segundo.altura = 90;
		System.out.println(segundo.base);
		System.out.println(segundo.altura);
		
		
		System.out.println(primeiro.calcularArea(0));
		System.out.println(segundo.calcularArea(0));
	}

}
