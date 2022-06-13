package classeMenuRestaurante;
import java.util.Scanner;

import classesMenuComidas.MenuChurrasco;
import classesMenuComidas.MenuComidaAsiatica;
import classesMenuComidas.MenuHamburguers;
import classesMenuComidas.MenuPizzas;
import classesMenuComidas.MenuSobremesa;


public class MenuRestaurantes {
    int opcao; 
    Scanner ler = new Scanner(System.in);
    MenuPizzas mp = new MenuPizzas();
    MenuChurrasco mc = new MenuChurrasco(); 
    MenuComidaAsiatica ma = new MenuComidaAsiatica();
    MenuSobremesa ms = new MenuSobremesa();
    MenuHamburguers mh = new MenuHamburguers();
    
    public void pizza(){
       
          System.out.println("\n\n-------------------------------------------");
          System.out.println("1 Pizarria do seu ze\n");
          System.out.println("2 carlin pizzas\n");
          System.out.println("-------------------------------------------\n\n");
          System.out.printf("Digite uma opcao: ");
          opcao = ler.nextInt();
          
          for(int i = 0; i < 100; i++){System.out.println("");}

          if(opcao == 1 || opcao == 2){
            switch(opcao){
  
              case 1: mp.opcoesPizzaSeuZe(); ; break;
  
              case 2: mp.opcoesPizzaCarlin(); ; break;
            }
          }else{
            System.out.println("A opcao digitada nao existe! :)");
  
          }
    }

    public void hamburguer(){

        System.out.println("\n\n-------------------------------------------");
        System.out.println("1 hamburgueria do seu ze\n");
        System.out.println("2 carlin hamburguers\n");
        System.out.println("-------------------------------------------\n\n");
        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();
        
        for(int i = 0; i < 100; i++){System.out.println("");}

        if(opcao == 1 || opcao == 2){
          switch(opcao){

            case 1: mh.opcoesHamburguersSeuZe();  break;

            case 2: mh.opcoesHamburguersCarlin(); break;
          }
        }else{
          System.out.println("A opcao digitada nao existe! :)");

        }
      
    }

    public void sobremesa(){

        System.out.println("\n\n-------------------------------------------");
        System.out.println("1 bolos do seu ze\n");
        System.out.println("2 carlin tortas (doce)\n");
        System.out.println("-------------------------------------------\n\n");
        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();
        
        for(int i = 0; i < 100; i++){System.out.println("");}

        if(opcao == 1 || opcao == 2){
          switch(opcao){

            case 1: ms.opcoesBolosSeuZe(); break;
            case 2: ms.opcoesTortasCarlin(); break;
          }
        }else{
          System.out.println("A opcao digitada nao existe! :)");

        }
    }

    public void comidaAsiatica(){

        System.out.println("\n\n-------------------------------------------");
        System.out.println("1 Pizarria do seu ichiraku\n");
        System.out.println("2 yudi comidas\n");
        System.out.println("-------------------------------------------\n\n");
        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();
        
        for(int i = 0; i < 100; i++){System.out.println("");}

        if(opcao == 1 || opcao == 2){
          switch(opcao){

            case 1: ma.opcoesAsiaticaIchiraku(); break;
            case 2: ma.opcoesAsiaticaYudi(); break;
          }
        }else{
          System.out.println("A opcao digitada nao existe! :)");

        }
    }

    public void churrasco(){

        System.out.println("\n\n-------------------------------------------");
        System.out.println("1 churrascaria do seu ze\n");
        System.out.println("2 carlin churrascos\n");
        System.out.println("-------------------------------------------\n\n");
        System.out.printf("Digite uma opcao: ");
        opcao = ler.nextInt();
        
        for(int i = 0; i < 100; i++){System.out.println("");}

        if(opcao == 1 || opcao == 2){
          switch(opcao){

            case 1: mc.opcoesChurrascariaZe();  break;

            case 2: mc.opcoesCarlinChurrascos(); break;
          }
        }else{
          System.out.println("A opcao digitada nao existe! :)");

        }
    }

    
}
