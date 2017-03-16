package teatro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wendel
 */
public class Cadeiras {
        int[][] cad;
        int numColunas;
        int numLinhas;
        int x = 0;
        int y = 0;
        
        public Cadeiras(int ncol, int nlin){
            numColunas = ncol;
            numLinhas = nlin;
            
            cad = new int[numColunas][numLinhas];
           
           for(x=0;x<numColunas;x++){
              for (y=0;y<numLinhas;y++){ 
               cad[x][y] = 0;
                }
           }
    
}
        
        public int getTotal(){
            return numColunas*numLinhas;
        }
        
        public void Ocupa(int col, int lin){
            if(cad[col][lin] == 1)
                System.out.println("Esta cadeira não esta vaga");
            else
            {cad[col][lin] = 1;
            System.out.println("Cadeira ocupada com sucesso");
            }
        }
        
        public void Desocupa(int col, int lin){
            if(cad[col][lin] == 0)
                System.out.println("Cadeira já estava previamente vazia");
            else
            {cad[col][lin] = 0;
             System.out.println("Cadeira desocupada com sucesso");
            }
        }
        
       public void MostraAssentos(){
           int x = 0;
           int y = 0;
           for(x=0;x<numColunas;x++){
              for (y=0;y<numLinhas;y++){ 
               System.out.print(cad[x][y] + " ");
                if(y == numLinhas-1)
                    System.out.println();
                }
           
       }
       }
       
}
       
