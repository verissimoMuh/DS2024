package ds;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);
		
        Imc primeiro = new Imc();
		
		System.out.println("Informe seu nome");
	    primeiro.nome=in.next();		
	    
	    System.out.println("Informe sua idade:");
		primeiro.idade=in.nextInt();
		
		System.out.println("Informe seu peso:");
		primeiro.peso=in.nextDouble();
		
		System.out.println("Informe sua altura:");
		primeiro.altura=in.nextDouble();
		
		primeiro.calcularImc();
		
		
		
	    System.out.println("Nome: " +primeiro.nome);
	    System.out.println("Idade: " +primeiro.idade);
	    System.out.println("Peso: " +primeiro.peso+"kg");
	    System.out.println("Altura: " +primeiro.altura+"m");
	    System.out.println("Imc: " +primeiro.Imc);
	   System.out.println(primeiro.classsificarImc());
	  
		}

}
