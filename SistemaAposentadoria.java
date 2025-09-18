import javax.swing.JOptionPane;
public class SistemaAposentadoria{
  public  String nomeContribuinte;
  public  double idadeContribuinte;
  public String sexoContribuinte;
  public double tempoContribuicao;
  
  public SistemaAposentadoria(){}
  
  public SistemaAposentadoria(String nomeContribuinte,double idadeContribuinte,
  String sexoContribuinte, double tempoContribuicao){
    this.nomeContribuinte = nomeContribuinte;
    this.idadeContribuinte = idadeContribuinte;
    this.sexoContribuinte = sexoContribuinte;
    this.tempoContribuicao = tempoContribuicao;
    
  }
  public void lerDados(){
  nomeContribuinte = JOptionPane.showInputDialog("Digite o nome do contribuinte:");
  idadeContribuinte = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade do contribuinte:"));
  sexoContribuinte = JOptionPane.showInputDialog("Digite (M) masculino ou (F):");
  tempoContribuicao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de contribuição:"));

  }
  public String menu(){
    switch (sexoContribuinte) {
            case "M":
              return regraHomem();
                
            case "F":
                return regraMulher();
                
            default:
               return  "Opção inválida. Use M ou F.";
        }
  }
   
  public String regraMulher(){
    if(idadeContribuinte >= 62 && tempoContribuicao >= 15){
      return " Pronta para se aposentar ";
    }else{
      return " Você não esta habilitada a se aposentar ";
    }
  
  }
  public String regraHomem(){
    if(idadeContribuinte >= 65 && tempoContribuicao >= 20){
      return " Pronto para se aposentar ";
    }else{
      return " Você não esta habilitado a se aposentar ";
    }
  
  }
 
  
  public static void main (String[] args) {
    /* code */
  SistemaAposentadoria sistema = new SistemaAposentadoria();
  sistema.lerDados();
  String resultado = sistema.menu();
  JOptionPane.showMessageDialog(null," Nome do contribuinte " + sistema.nomeContribuinte + 
  "\nSituação: " + resultado);
  }
}