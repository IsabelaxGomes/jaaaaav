class Casa {
    

    public static void main(String[] args) {
        
        //Está puxando da pasta Janela.java

        // Criando 3 instâncias de janela
        Janela janela_1 = new Janela();
        Janela janela_2 = janela_1;
        Janela janela_3 = new Janela();
        Janela janela_4 = new Janela();
        Janela janela_5 = new Janela();


        // Abrindo as duas primeiras e fechando a terceira
        janela_1.abrir();
        janela_2.fechar();
        janela_3.abrir();
        janela_4.abrir();
        janela_5.fechar();
        

        // Mostrando o estado de cada uma
        System.out.println(janela_1.mostrarEstado());
        System.out.println(janela_2.mostrarEstado());
        System.out.println(janela_3.mostrarEstado());
        System.out.println(janela_4.mostrarEstado());
        System.out.println(janela_5.mostrarEstado());
        

    
    }
}