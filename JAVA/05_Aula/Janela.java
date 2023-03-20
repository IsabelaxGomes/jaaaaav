 class Janela {
    //estadoda janela
    //atributos dados

    boolean aberta;
    static int nJanelas;
    //metodos são funções


    public Janela(){

        aberta= true;
        nJanelas++;


    }

    public Janela (boolean aberta){
        this.aberta = aberta;
        nJanelas++;

    }
}
 
Janela j = new Janela();