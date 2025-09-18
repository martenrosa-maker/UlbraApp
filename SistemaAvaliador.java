import java.util.*;

public class SistemaAvaliador{
  
  public  double notaProva1;
  public double notaProva2;
  public double notaTrabalho;
  
  public SistemaAvaliador(){}
  
  public SistemaAvaliador(double notaProva1, double notaProva2, double notaTrabalho){
    this.notaProva1 = notaProva1;
    this.notaProva2 = notaProva2;
    this.notaTrabalho = notaTrabalho;
    
  }
  public void lerDados(){
  notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 1:"));
  notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da Prova 2:"));
  notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho:"));
  }
  
  public Double calculaMedia(){
    return (notaProva1 + notaProva2 + notaTrabalho)/3;
  }
  public String resultadoFinal(){
   double media = calculaMedia();
   return media >= 6 ? "Aprovado" : "Reprovado";
  }
  
  public static void main (String[] args) {
    /* code */
  SistemaAvaliador sistema = new SistemaAvaliador();
  sistema.lerDados();
  double media = sistema.calculaMedia();
  String resultado = sistema.resultadoFinal();
  JOptionPane.showMessageDialog(null,
            "Média: " + String.format("%.2f", media) + "\nSituação: " + resultado);
  }
}