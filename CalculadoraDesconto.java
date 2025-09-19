
import java.util.Scanner;

public class CalculadoraDesconto {
    private String nomeProduto ;
    private double valorProduto;
    private double desconto;

    public  CalculadoraDesconto(String nomeProduto, double valorProduto, double desconto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.desconto=desconto;
    }
    CalculadoraDesconto(  ){

    }
    public void lerValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o  nome  do produto");
        nomeProduto = scanner.nextLine();
        System.out.println("Digite o  valor do produto");
        valorProduto = scanner.nextDouble();
        System.out.println("Digite o  percentual de desconto");
        desconto = scanner.nextDouble();
        scanner.close();
    }
    public  double calculaDesconto(){
        return  valorProduto * (desconto/100);
    }
    public  void imprimeResultado(){
        System.out.println(" Produto: " + nomeProduto + "\nR$" + calculaDesconto() +  "  é valor do produto já com o desconto");
    }

    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(  );
        calculadora.lerValor();
        calculadora.imprimeResultado();
    }
}
