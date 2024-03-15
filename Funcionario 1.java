package ds;

public class Funcionario {
    String nome;
    double sBruto;
    double imposto;
    double resultado;
    
       String salarioLiquido (double resultado) {
       resultado = sBruto -(sBruto * imposto/100);
          return ("O resultado do salario liquido é: " +resultado);
    }
       
     
   
    }

