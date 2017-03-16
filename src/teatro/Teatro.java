/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;
import java.util.Scanner;
/**
 *
 * @author Wendel
 */
public class Teatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opt, linha, coluna;
        Cadeiras cad = new Cadeiras(11,21);
        
        do{
        System.out.println("Menu:");
        System.out.println("1 - Adicionar à cadeira");
        System.out.println("2 - Remover da cadeira");
        System.out.println("3 - Mostrar todas as cadeiras");
        System.out.println("0 - Fim...");
        opt = scan.nextInt();
        
        switch(opt){
            case 0:
                System.out.println("Volte Sempre!");
                break;
            case 1:
            { System.out.println("Digite a coluna e a linha respectivamente");
                coluna = scan.nextInt();
                linha = scan.nextInt();
                cad.Ocupa(coluna, linha);}
                break;
            case 2:
            {   System.out.println("Digite a coluna e a linha respectivamente");
                coluna = scan.nextInt();
                linha = scan.nextInt();
                cad.Desocupa(coluna, linha);}
                break;
            case 3:
            {   cad.MostraAssentos();
                break;}
            default:
                System.out.println("Comando inválido");
        }
        }while ( opt!= 0);
   
    
    }
    
}
