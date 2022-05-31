package classesMenuComidas;

import java.util.Scanner;

import finalizaPedido.FinalPedido;

public class MenuPizzas {
    int opcao; 
    Scanner ler = new Scanner(System.in);

    FinalPedido f = new FinalPedido();
    
    public void opcoesPizzaSeuZe(){

        System.out.println( "\n\n1 ------------Pizza de calabreza---------");
        System.out.println( "Ingredientes: iiiiiiiiii iiiiiiiiii iiiiiiiii");
        System.out.println( "preco: 1000000000");
        System.out.println( "descricao: oooooooooo oooooo oooooo ");
        System.out.println( "--------------------------------------------\n\n");

        System.out.println( "\n\n2 ------------Pizza de frango---------");
        System.out.println( "Ingredientes: iiiiiiiiii iiiiiiiiii iiiiiiiii");
        System.out.println( "preco: 1000000000");
        System.out.println( "descricao: oooooooooo oooooo oooooo ");
        System.out.println( "--------------------------------------------\n\n");
       
        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();

        for(int i = 0; i < 100; i++){System.out.println("");}

         if(opcao == 1 || opcao == 2){
            switch(opcao){
  
              case 1: f.MensagemFinal();  break;
  
              case 2: f.MensagemFinal(); break;
            }
          }else{
            System.out.println("A opcao digitada nao existe! :)");
  
          }
    }

    public void opcoesPizzaCarlin(){
         System.out.println( "\n\n1 ------------pizza de bacon---------");
         System.out.println( "Ingredientes: iiiiiiiiii iiiiiiiiii iiiiiiiii");
         System.out.println( "preco: 1000000000");
         System.out.println( "descricao: oooooooooo oooooo oooooo ");
         System.out.println( "--------------------------------------------\n\n");

         System.out.println( "\n\n2 --------------pizza de peperone-----------------");
         System.out.println( "Ingredientes: iiiiiiiiii iiiiiiiiii iiiiiiiii");
         System.out.println( "preco: 1000000000");
         System.out.println( "descricao: oooooooooo oooooo oooooo ");
         System.out.println( "--------------------------------------------\n\n");


        System.out.printf("Qual produto voce deseja comprar? ");
        opcao = ler.nextInt();

        for(int i = 0; i < 100; i++){System.out.println("");}

         if(opcao == 1 || opcao == 2){
            switch(opcao){
  
              case 1: f.MensagemFinal();  break;
  
              case 2: f.MensagemFinal(); break;
            }
          }else{
            System.out.println("A opcao digitada nao existe! :)");
  
          }
      }
    }


