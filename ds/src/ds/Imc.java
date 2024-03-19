package ds;

public class Imc {
      String nome;
      int idade;
      double peso;
      double altura;
      double Imc;
      

     void calcularImc  () {
    	 Imc = peso/(altura*altura);
    	
     }
     
     String classsificarImc  () {
    	 
     
     if(Imc<18.5) {
			return  ("você esta abaixo do peso");
			
		} else if (Imc >=18.5 && Imc<=24.9) {
			return  ("você esta no peso normal");
			
		} else if (Imc >=25 && Imc<=29.9) {
			return  ("você esta Sobrepeso");
		} else if (Imc>=30 && Imc<=34.9) {
			return  ("você esta na obesidade de grau 1");
		} else if (Imc>=35 && Imc<=39.9) {
			return  ("você esta na obesidade de grau 2");
		} else if (Imc >= 40){
			return  ("você esta na obesidade de grau 3");
		}
     
		 return("nao foi possivel calcular");
        
     
}
     }