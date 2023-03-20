 import java.util.Scanner;
 
 class Calculadora {
        public static void main (String [] args){
            Scanner sc = new Scanner (System.in);
            int tipoConversao;


            System.out.println("Qual seria a conversão? 0- Area, 1- Volume, 2- Tempo");
            tipoConversao = sc.nextInt();

            System.out.println("Qual a unidade inicial:");

            if (tipoConversao = 0){
                System.out.println(" 0 - metros_pes");
                System.out.println("1 - pes_centimetros");
                System.out.println("2 - milhas_acre");
                System.out.println("3 - acre_pes");
                
            }

            System.out.println("Qual a unidade final?");
        }
    
}
