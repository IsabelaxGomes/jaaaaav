class Lampada {
    // Estado da lâmpada
    boolean acesa;

    // Contador compartilhado
    public static int numeroLampadas;
    

    public static int getNumeroLampadas() {
        return numeroLampadas;
    }
}


class Casa {
    public static void main(String[] args) {
        Lampada LS1 = new Lampada();
        LS1.numeroLampadas = LS1.numeroLampadas + 1;

        Lampada LS2 = new Lampada();
        LS2.numeroLampadas = LS2.numeroLampadas + 1;

        Lampada LS3 = new Lampada();
        LS3.numeroLampadas = LS3.numeroLampadas + 1;

        System.out.println("Pela LS1 " + LS1.numeroLampadas);
        System.out.println("Pela LS2 " + LS2.numeroLampadas);
        System.out.println("Pela LS3 " + LS3.numeroLampadas);

        /* Posso pegar o número de lâmpadas sem usar nenhuma instância */
        System.out.println("Pela classe " + Lampada.numeroLampadas);

        /* Posso chamar métodos estáticos sem nenhuma instância */
        System.out.println("Pelo método " + Lampada.getNumeroLampadas());
    }
}