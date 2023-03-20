import java.util.*;
public class read_write {

    // FunÃ§Ã£o main
    public static void main (String[] args) {
        String nome;
        int idade;
        double saldo;
        boolean premium;

        Scanner sc = new Scanner(System.in); //Para fazr a leitura dos dados da entrada
        /* ImpressÃ£o do texto */
        System.out.println("OlÃ¡, bem vindo ao nosso programa!");

        /* Leitura do Nome */
        System.out.println("Digite seu nome:");
        nome = sc.nextLine(); //Para Ele dar a saída do dados informados

        /* Leitura da Idade */
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        /* Leitura do Saldo */
        System.out.println("Digite seu saldo:");
        saldo = sc.nextDouble();

        /* Leitura do premium */
        System.out.println("VocÃª Ã© premium? (True/False)");
        premium = sc.nextBoolean();
        
        /* Informa os dados obtidos */
        System.out.println("Entendido, vocÃª Ã© o " + nome);
        System.out.println("    Saldo:" + saldo);
        System.out.println("    Idade:" + idade);
        System.out.println("    Premium:" + premium);

        /* Fecha o scanner */
        sc.close();
    }
}
    

