package Lista_Exercicios;
import java.util.Scanner;

class Exercicios_07{

    
    public static void main(String [] args){
                //metodo main 

    int numero;


    System.out.println("Primeira Lista - Exercicio 07");

    System.out.println("Digite o número");

    Scanner numSca = new Scanner(System.in); // Leitura dos dados
    numero = numSca.nextInt();

    if( numero > 0){
        System.out.println("Esse número é positivo");
    }
    else if (numero < 0){
        System.out.println("Esse núemero é negativo");
    }
    else if (numero == 0){
        System.out.println("Esse núemero é igual a 0");

    }
}
}


