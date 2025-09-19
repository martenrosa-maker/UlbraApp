import javax.swing.JOptionPane;

public class CalculadoraITBI {
  //atributos
    String valorImovelStr;
    String valorVenalStr;
    String taxaStr;
    double valorImovel = 0;
    double valorVenal = 0;
    double taxa = 0;
    public CalculadoraITBI(String valorImovelStr, String valorVenalStr, String taxaStr){
     this.valorImovelStr = valorImovelStr;
     this.valorVenalStr = valorVenalStr;
     this.taxaStr = taxaStr;
    }
    public CalculadoraITBI(){}
    //entrada de dados via JOptionPane
    public  void lerDados(){
 valorImovelStr = JOptionPane.showInputDialog("Digite o valor do imovel");
 valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imovel");
 taxaStr = JOptionPane.showInputDialog("Digite a taxa");
    }
public  void convertDados(){
    valorImovel = Double.parseDouble(valorImovelStr);
    valorVenal = Double.parseDouble(valorVenalStr);
    taxa = Double.parseDouble(taxaStr);
}
public  double baseCalculo(){
        return  Math.max(valorImovel, valorVenal);
}
    public double calculaImposto(){
    return  baseCalculo() * (taxa/100);
    }
public void mostraITBI(){
   // JOptionPane.showMessageDialog(null, mensagem, "Resultado do ITBI",
    // JOptionPane.INFORMATION_MESSAGE);
    String mensagem = String.format("Valor a pagar de ITBI: R$ %.2f", calculaImposto());
    JOptionPane.showMessageDialog(null, mensagem, "Resultado do ITBI", JOptionPane.INFORMATION_MESSAGE);

}
    public static void main(String[] args) {
        CalculadoraITBI ITBI = new CalculadoraITBI( );
        ITBI.lerDados();
        ITBI.convertDados();
        ITBI.baseCalculo();
        ITBI.calculaImposto();
        ITBI.mostraITBI();
    }
}
