
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
       Cliente cli = new Cliente();
    
    
     
      int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Cadastrar Cliente \n 2- Listar Cliente \n 3- Calcular Limite de Credito \n 0- Sair" ));
      
      
      switch (op)
      {
          case 1:
              cli.CadastrarCliente();
              break;
          case 2:
              cli.ListarCliente();
              break;
          case 3:
             cli.CalcularLimite();
            break;
          case 0:
            JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
          default:
           JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
      }     
      } while(op!= 0);
    }
    
}
