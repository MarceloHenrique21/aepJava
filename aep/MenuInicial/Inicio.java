package MenuInicial;
import java.util.Scanner;
import classeMenuRestaurante.MenuRestaurantes;
import classesGeral.Cliente;
import classesGeral.Endereco;
import classesGeral.Estabelecimento;
import classesGeral.Pagamento;
import classesGeral.Produto;

public class Inicio {
   
        Endereco e = new Endereco();
        Cliente c = new Cliente();
        Pagamento p = new Pagamento();
        Produto po = new Produto();
        Estabelecimento eo = new Estabelecimento();
        MenuRestaurantes m = new MenuRestaurantes();
        Scanner ler = new Scanner(System.in);
      
        public void iniciar(){
        int opcao;
 
           System.out.println("\n\n-------------------------------------------");
           System.out.println("- 1 pizza");
           System.out.println("- 2 hamburguer");
           System.out.println("- 3 sobremesa");
           System.out.println("- 4 comida asiatica");
           System.out.println("- 5 churrasco");
           System.out.println("- 6 minhas informacoes");
           System.out.println("-------------------------------------------\n\n");
     
           System.out.printf("Digite uma opcao: ");
           opcao = ler.nextInt();
 
           for(int i = 0; i < 100; i++){System.out.println("");}
        
           if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5 || opcao == 6){
           switch(opcao){
 
             case 1: m.pizza(); break;
 
             case 2: m.hamburguer(); break;
 
             case 3: m.sobremesa(); break;
 
             case 4: m.comidaAsiatica(); break;
 
             case 5: m.churrasco(); break;
 
             case 6: c.info(); break;
           }
         }else{
           System.out.println("A opcao digitada nao existe! :)");
 
         }
      
        
     }
}
