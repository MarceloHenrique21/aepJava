package finalizaPedido;

import java.util.Scanner;

import classesGeral.Endereco;
import classesGeral.Estabelecimento;
import classesGeral.Pagamento;


public class FinalPedido {
    int opcao; 
    Scanner ler = new Scanner(System.in);
    Estabelecimento eo = new Estabelecimento();
    Endereco en = new Endereco();
    Pagamento pa = new Pagamento();


    public void MensagemFinal(){

    System.out.println("\n\n-------------------------------------------"); 
    System.out.println( "Se desejar pagar com um cartao digite 1 ");
    System.out.println( "Se deseja pagar com pix digite 2 ");
    System.out.println("-------------------------------------------\n\n");
    
    System.out.printf( "Digite a opcao de pagamento desejada: ");
    opcao = ler.nextInt();
 
    for(int i = 0; i < 100; i++){System.out.println("");}
    
    if( opcao == 1){

    System.out.println("\n\n-------------------------------------------");
    pa.InfoCartao();
    System.out.println( "--------------------------------------------\n");

    }else if(opcao == 2){

         System.out.println("\n\n-------------------------------------------");
         System.out.println( "dados de pagamento: ");
         System.out.println("Numero pix: "+eo.getCnpj("") );
         System.out.println( "voce escolheu o pix como forma de pagamento! A partir de agora voce terá 15 minutos para realizar o pagamento: ");
         System.out.println( "--------------------------------------------\n");

    }else{

        System.out.println( "Selecione um dos metodos de pagamento validos :)");

    }
         System.out.println("\n\n-------------------------------------------");
         System.out.println( "Seus dados de entrega: ");
         en.info();
         System.out.println( "--------------------------------------------\n\n");
         

    }
}
    