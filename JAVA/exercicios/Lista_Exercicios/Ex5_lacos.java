package Lista_Exercicios;




//Imprima os números de 1 a 20, exceto os números múltiplos de 3, ultilizando o continue

class Ex5_lacos{ 
    
   public static void main(String [] args){

    for( int i = 1; i<=20; ++i){
       if (i % 3 ==0) continue;
        System.out.println(i);
       
    }
    
}
}
