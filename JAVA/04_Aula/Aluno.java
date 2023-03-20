public class Aluno {

    //Atributos 
    String nome;
    int matricula;
    int ano;
    int anoMAtricula;
    String periodo;

    //Métodos
    String mostrar_dados(){
        String mostrar;
         mostrar = nome + 
                ',' + matricula + 
                "," + periodo + 
                ',' + ano + 
                "," + anoMAtricula;
        return mostrar;
                

    }
    void passar(){
        this.ano = this.ano + 1;

    }
    void reprovar(){


    }
    float calcularMensalidade(){
        return 98f;

    }

    



    
}
