
import javax.swing.JOptionPane;
public class SistemaLogin{
  
  public String nomeUsuario;
  public String senhaUsuario;   
  
  public SistemaLogin(){}
  
public SistemaLogin(String nomeUsuario, String senhaUsuario){
  this.nomeUsuario = nomeUsuario;
  this.senhaUsuario = senhaUsuario;
}
public void autenticacao(){
  int tentativas = 3;
  while(tentativas > 0 ){
    String nomeUsuario = JOptionPane.showInputDialog("Digite o login:");
    String senhaUsuario = JOptionPane.showInputDialog("Digite a senha:");
    
    if(nomeUsuario.equals("java8") && senhaUsuario.equals("java8")){
     JOptionPane.showMessageDialog(null, "✅ Acesso permitido. Bem-vindo ao sistema!");
   return ; }else{
      tentativas --; 
      if(tentativas > 0){
  
  JOptionPane.showMessageDialog(null,
                        "❌ Login ou senha incorretos.\n" +
                        "Você ainda tem " + tentativas + " tentativa(s).");
          
      }else{
         JOptionPane.showMessageDialog(null,
                        "🚫 Número de tentativas excedido.\nAcesso bloqueado.");
                }
      }
    }
  
  }

  public static void main (String[] args) {
    /* code */SistemaLogin usuario = new SistemaLogin();
    usuario.autenticacao();
  }
}