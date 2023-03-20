class Paciente {

    //Atributos
    String nome;
    String sexo;
    Double peso;
    Double altura;
    int  dataNascimento;
    int quarto;



    //Métodos 

    void mostrarDados(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Sexo:" + this.sexo);
        System.out.println("Peso:" + this.peso);
        System.out.println("Altura:" + this.altura);
        System.out.println("Data de nascimento:" + this.dataNascimento);
        System.out.println("Quarto" + this.quarto);

     }

     void mudarQuarto(int quarto){
       // quarto = novoQuarto;
        this.quarto =quarto;

     }
    
}
