package classesGeral;
public class Endereco {
    private int id;
    private String logradouro;
    private String numero; 
    private String bairro;
    private String complemento;
    private int Cep;
    private String uf;
    private String cidade;
    private String pais;
    
    public void info(){
        this.id = 00000010101;
        this.logradouro = "casa" ;
        this.numero = "900";
        this.bairro = "maracana";
        this.complemento = "em frente ao joaozinho moto-taxi";
        this.Cep = 98232140;
        this.uf = "KL";
        this.cidade = "Pindamoiangaba";
        this.pais = "Brasil";
    
        System.out.println("\n\n-------------------------------------------");
        System.out.println("id: "+id);
        System.out.println("logradouro: "+logradouro);
        System.out.println("numero: "+numero);
        System.out.println("bairro: "+bairro);
        System.out.println("complemento: "+complemento);
        System.out.println("cep: "+Cep);
        System.out.println("uf: "+uf);
        System.out.println("cidade: "+cidade);
        System.out.println("pais: "+pais);
        System.out.println("-------------------------------------------\n\n");
        
        }
}
