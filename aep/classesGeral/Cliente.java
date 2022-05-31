package classesGeral;

public class Cliente {
  public  int id; 
  public  String cpf; 
  public  String nome;
  public  String DataNasc;
  
  public void info(){
    this.nome = "user90020";
    this.id = 9912;
    this.DataNasc = "18/12/2002";
    this.cpf = "000-000-000-90";

    System.out.println("\n\n-------------------------------------------");
    System.out.println("id: "+id);
    System.out.println("nome: "+nome);
    System.out.println("cpf: "+cpf);
    System.out.println("data de nascimento: "+DataNasc);
    System.out.println("-------------------------------------------\n\n");
    
    }
}


