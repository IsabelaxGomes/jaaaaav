     package Reinos;
 
 public class Animal {


    //Implemente esse modelo como uma classe pública do Java,considerando os tipos definidos no exercício 4.
    // Lembre-se dedeixar suas operações funcionais.
    

    //Atributos
    
       private  String nome;
       private int idade;
       private String especie;
       private  String cor;
       private static int contador;

       
       private String novoNome;;


    //Operações - Métodos




    //Criação de get e set
    //public String getNome(){ retornar 
       // return this.nome;

   // }
    //public void  setNome(String nome){ receber
        //if se não quiser algo 
      //  this.nome = nome;

   // }











     //tem um sinal de mais então public 

     //ex13//
     public String getNome(){
          return nome;

     }

     public int getIdade(){
          return idade;
     }
     // PARA RETORNAR NO ZOOLOGICO, POIS SÃO PRIVATOS 


    public  void envelhecer  (){

        //retorno vai ser void 
        idade = this.idade + 1;
        // this.idade = this.idade +1;
        //os dois estão certos mais o this duas vezes é mais seguro 


    }

    //Ex17 
    public void imprimirDetalhes(){
     System.out.println("_________________________________");
     System.out.println("Nome:" + this.nome + "" + "Idade:" + this.idade + "" + "Especie:" + this.especie + "" + "Cor:" + cor + "Número:" + contador) ;
     System.out.println("_________________________________");



    }

    //tem um sinal de mais então public 
    public void recolorir (String novaCor){

     //this.cor = novaCor; ex07


     // Exercios 9

     if(novaCor.equals("Azul") || novaCor.equals("Verde") ||
      novaCor.equals("Marrom")  ||novaCor.equals("Preto") ||
      novaCor.equals("Branco")) {

      
     this.cor = novaCor;

     System.out.println("Nova cor cadastrada");
    

     }else{
     
          System.out.println("ERRO: Cor inválida!");
   

    }
}

    public void renomear (String novoNome){

         //this.nome = novoNome; eX 07

         ///////////////////////////////////////////////////////////////////////////////////////////////// Ex 8 
         //equals vai comprar as Strings 
         //IgnoreCase = tanto faz se escrever em letra maiucusla ou Minuscula mas usar só o equals tão está certo
         
         if(novoNome.equalsIgnoreCase("Bife") || novoNome.equalsIgnoreCase("Picanha")){
          System.out.println("ERRO: Por favor não faça isso!!");

         }else{

        
         this.nome = novoNome;
      }
     }


      // CRIANDO UM CONTRUTOR, QUE VAI TER O MESMO NOME QUE A CLASSE

      public Animal(){

          this.nome = "Indefinido";
          this.especie = "Nenhuma";
          this.idade= 0;
          this.cor= "Azul";
          this.contador++;

          //Todo o animal que é criado vai receber essas caracteristicas; ou seja os 100 são assim

      }

      //Ex 14 //Um novo contrutor que está recebendo algo 
      public Animal(String novoNome, int novaIdade){
          this.nome = novoNome;
          this.idade= novaIdade;
          this.contador++;
          
      }

    
    
}


