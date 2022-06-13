package classesMenuComidas;
import java.util.Scanner;
import finalizaPedido.FinalPedido;

public class MenuComidaAsiatica {
    int opcao; 
    Scanner ler = new Scanner(System.in);
    FinalPedido f = new FinalPedido();

    public void opcoesAsiaticaIchiraku(){

      System.out.println( "\n\n1 ------------nome---------");
      System.out.println( "preco: 1000000000");
      System.out.println( "descricao: oooooooooo oooooo oooooo ");
      System.out.println( "--------------------------------------------\n\n");

      System.out.println( "\n\n2 ------------nome---------");
      System.out.println( "preco: 1000000000");
      System.out.println( "descricao: oooooooooo oooooo oooooo ");
      System.out.println( "--------------------------------------------\n\n");
       
        
        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();

        for(int i = 0; i < 100; i++){System.out.println("");}

         if(opcao == 1 || opcao == 2){
            switch(opcao){
  
              case 1: f.MensagemFinal(); break;
  
              case 2: f.MensagemFinal(); break;
            }
          }else{
            System.out.println("A opcao digitada nao existe! :)");
  
          }
       
    }
    public void opcoesAsiaticaYudi(){

      System.out.println( "\n\n1 ------------nome---------");
      System.out.println( "preco: 1000000000");
      System.out.println( "descricao: oooooooooo oooooo oooooo ");
      System.out.println( "--------------------------------------------\n\n");

      System.out.println( "\n\n2 ------------nome---------");
      System.out.println( "preco: 1000000000");
      System.out.println( "descricao: oooooooooo oooooo oooooo ");
      System.out.println( "--------------------------------------------\n\n");

        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();

        for(int i = 0; i < 100; i++){System.out.println("");}

         if(opcao == 1 || opcao == 2){
            switch(opcao){
  
              case 1: f.MensagemFinal(); break;
  
              case 2: f.MensagemFinal(); break;
            }
          }else{
            System.out.println("A opcao digitada nao existe! :)");
  
          }
    }
}
