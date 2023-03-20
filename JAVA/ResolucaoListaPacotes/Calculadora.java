import java.util.Scanner;
//import conversor.ConversaoDeArea;
//import conversor.ConversaoDeTempo;
//import conversor.ConversaoDeVolume;

class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoConversao;

        System.out.println("Que conversão quer fazer? 0 - Area, 1 - Volume, 2 - Tempo");
        tipoConversao = sc.nextInt();

        
        
        System.out.println("Qual a conversão desejada?");


        if (tipoConversao == 0) {
            System.out.println("0 - metro_pes");
            System.out.println("1 - pes_centimetro");
            System.out.println("2 - milha_acre");
            System.out.println("3 - acre_pe");

            int opcao = sc.nextInt();

            System.out.println("Digite um valor para converter?");
            double valorLido = sc.nextDouble();

            switch(opcao) {
                case 0:
                    System.out.println(ConversaoDeArea.metro_pes(valorLido));
                    break;
                case 1:
                    System.out.println(ConversaoDeArea.pes_centimetro(valorLido));
                    break;
                case 2:
                    System.out.println(ConversaoDeArea.milha_acre(valorLido));
                    break;
                case 3:
                    System.out.println(ConversaoDeArea.acre_pe(valorLido));
                    break;
            }

        } else if (tipoConversao == 1) {
            System.out.println("0 - litro_centimetro");
            System.out.println("1 - metro_litro");
            System.out.println("2 - metro_pes");
            System.out.println("3 - galao_polegada");
            System.out.println("4 - galao_litro");

            int opcao = sc.nextInt();

            System.out.println("Digite um valor para converter?");
            double valorLido = sc.nextDouble();

            switch(opcao) {
                case 0:
                    System.out.println(ConversaoDeVolume.litro_centimetro(valorLido));
                    break;
                case 1:
                    System.out.println(ConversaoDeVolume.metro_litro(valorLido));
                    break;
                case 2:
                    System.out.println(ConversaoDeVolume.metro_pes(valorLido));
                    break;
                case 3:
                    System.out.println(ConversaoDeVolume.galao_polegada(valorLido));
                    break;
                case 4:
                    System.out.println(ConversaoDeVolume.galao_litro(valorLido));
                    break;
            }
        } else if (tipoConversao == 2) {
            System.out.println("0 - minuto_segundo");
            System.out.println("1 - hora_minuto");
            System.out.println("2 - dia_hora");
            System.out.println("3 - semana_dia");
            System.out.println("4 - mes_dia");
            System.out.println("5 - ano_dia");


            int opcao = sc.nextInt();

            System.out.println("Digite um valor para converter?");
            double valorLido = sc.nextDouble();

            switch(opcao) {
                case 0:
                    System.out.println(ConversaoDeTempo.minuto_segundo(valorLido));
                    break;
                case 1:
                    System.out.println(ConversaoDeTempo.hora_minuto(valorLido));
                    break;
                case 2:
                    System.out.println(ConversaoDeTempo.dia_hora(valorLido));
                    break;
                case 3:
                    System.out.println(ConversaoDeTempo.semana_dia(valorLido));
                    break;
                case 4:
                    System.out.println(ConversaoDeTempo.mes_dia(valorLido));
                    break;
                case 5:
                    System.out.println(ConversaoDeTempo.ano_dia(valorLido));
                    break;
            }
        } else {
            System.out.println("Conversão inexistente!");
        }

    }
}