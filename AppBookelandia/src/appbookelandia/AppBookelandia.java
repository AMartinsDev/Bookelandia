package appbookelandia;

import appbookelandia.model.Cliente;
import java.time.LocalDate;
import java.util.Scanner;


public class AppBookelandia {

    public static void main(String[] args) {
       
        //*Tipos de dados, Ex: int, String, float, double...
        String nome = "Arthur";
        
        //Comando de saída:
        System.out.println ("Digite o seu nome:");
        
       
        //Comando de entrada, Instanciando uma classe scanner para entrada de dados
        Scanner sc = new Scanner (System.in);
        nome = sc.nextLine();
        
        Cliente c1 = new Cliente();
        
        c1.setCpf("02971248596");
        
        System.out.println("O cpf de " + nome + " eh: " + c1.getCpf());
        
        Cliente c2 = new Cliente (LocalDate.now(), "Arthur Silva Martins", "02971206757");
        
        System.out.println(" " + c2.getData_de_cadastro() + " " + c2.getCpf() + " " + c2.getNome() + " ");
        
        
    }
    
}
