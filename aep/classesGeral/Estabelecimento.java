package classesGeral;

import java.util.Scanner;

public class Estabelecimento {
    private int Id;
    public  String nome;
    public  String cnpj;
    Scanner ler = new Scanner(System.in);

    public String getCnpj(String Cnpj) {
        
       Cnpj = "0000-2222-3002-1111";

        this.cnpj = Cnpj;

        return cnpj;
    }
}
