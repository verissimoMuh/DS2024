package ds;


public class Moto extends Veiculo {

 public Moto(String Modelo, int valorTabela, String Cor, String Combustivel) {
     super(Modelo, valorTabela, Cor, Combustivel);
 }

 @Override
 public double calcularipva() {
     
     return getvalorTabela() * 0.02;
 }
}
