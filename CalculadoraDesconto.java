package PraticasAP1;
import java.util.Scanner;

public class CalculadoraDesconto {
    private double valor;
    private double desconto;

    public  CalculadoraDesconto(double valor, double desconto){
        this.valor=valor;
        this.desconto=desconto;
    }
    CalculadoraDesconto(  ){

    }
    public void lerValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o  valor do produto");
        valor = scanner.nextDouble();
        System.out.println("Digite o  valor do desconto");
        desconto = scanner.nextDouble();
        scanner.close();
    }
    public  double calculaDesconto(){
        return  valor * (desconto/100);
    }
    public  void imprimeResultado(){
        System.out.println("R$" + calculaDesconto() +  "  é valor do produto já com o desconto");
    }

    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(  );
        calculadora.lerValor();
        calculadora.imprimeResultado();
    }
}
