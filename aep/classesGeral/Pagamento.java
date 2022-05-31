package classesGeral;
public class Pagamento {

    private String numeroCartao;
    private int codSeguranca;
    public String nomeTitular;
    private String dataValidade;
    private String bandeira;

    public void InfoCartao(){

      this.numeroCartao = "0000-1111-2222-3333";
      this.codSeguranca = 777;
      this.nomeTitular = "dom pedro primeiro da silva";
      this.dataValidade = "13/01/29";
      this.bandeira = "visa";
      System.out.println("\n\n-------------------------------------------");
      System.out.println( "Nome do titular: "+nomeTitular);
      System.out.println( "Numero do cartao: "+numeroCartao);
      System.out.println( "data de validade: "+dataValidade);
      System.out.println( "codigo de segurança: "+codSeguranca);
      System.out.println( "bandeira: "+bandeira);
      System.out.println( "--------------------------------------------\n");
    }

  //perguntar nas opcoes de cred e deb se o cliente ira pagar na entrega 
}
