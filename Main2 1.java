package ds;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Funcionario primeiro = new Funcionario();
        Funcionario segundo = new Funcionario();
        
        primeiro.nome = "pedro";
        primeiro.sBruto = 2000;
		primeiro.imposto = 0.20;
		
		
		
		
        segundo.nome = "vagner";
        segundo.sBruto = 6000;
		segundo.imposto = 0.10;
		
		System.out.println(primeiro.salarioLiquido(0));
		System.out.println(segundo.salarioLiquido(0));
	}

}
