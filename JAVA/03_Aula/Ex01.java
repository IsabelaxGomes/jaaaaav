import java.util.Scanner;



     //Crie uma programa que leia dois números inteiros da entrada padrão.
    //Em seguida, crie um método que receba esses dois números inteiros como parametros e retorne o maior valor entre eles. Entã61o imprima esse valor.. 
    // Temos que fazer  a LEITURA, COMPARAÇÃO E IMPRIMIR 

class Ex01 {


    static int maior (int x, int y){
      return Math.max(x,y); // Vai comparar qual é maior 

    } // metodo para comprarar

    public static void main(String [] args){ 

        int a;//variavél doa número a
        int b;// variavél do número b
        
        Scanner sc = new Scanner(System.in); //Para fazer a leitura dos dados da entrada

        System.out.println("Digite o número:");
        a = sc.nextInt();

        System.out.println("Digite o número:");
        b = sc.nextInt();

        int m =  maior (a,b); // Uma variavél que vai receber a função

        System.out.println("O número maior é: " + m);

     





       

        
        
       

        

    }
    
 
    
   
   
   
}