
import javax.swing.JOptionPane;


public class Cliente {
    private int id;
    private String Nome;
    private String Endereco;
    private String Email;
    private double RendaMensal;
    private double LimiteCredito;

    public Cliente() {
    }

    public Cliente(int id, String Nome, String Endereco, String Email, double RendaMensal, double LimiteCredito) {
        this.id = id;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Email = Email;
        this.RendaMensal = RendaMensal;
        this.LimiteCredito = LimiteCredito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getRendaMensal() {
        return RendaMensal;
    }

    public void setRendaMensal(double RendaMensal) {
        this.RendaMensal = RendaMensal;
    }

    public double getLimiteCredito() {
        return LimiteCredito;
    }

    public void setLimiteCredito(double LimiteCredito) {
        this.LimiteCredito = LimiteCredito;
    }
    
    public void CadastrarCliente(){
        this.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Cliente")));
        this.setNome(JOptionPane.showInputDialog("Insira Nome"));
        this.setEndereco(JOptionPane.showInputDialog("Insira o Endereco"));
        this.setEmail(JOptionPane.showInputDialog("Insira o Email"));
        this.setRendaMensal(Double.parseDouble(JOptionPane.showInputDialog("Digite Sua Renda Mensal:")));
       
    }
    public void ListarCliente(){
    JOptionPane.showMessageDialog(null,"\nId:"+ getId()+"\nNome:"+getNome()+"\nEndereco:"+getEndereco()+"\nEmail:"+getEmail()+"\nRenda Mensal:"+getRendaMensal()+"\nLimite Credito:"+getLimiteCredito());
    }
    
    public void CalcularLimite(){
    this.setLimiteCredito(this.getRendaMensal()*0.40);
    JOptionPane.showMessageDialog(null, "Limite de Credito:"+getLimiteCredito());
    }
    
}
