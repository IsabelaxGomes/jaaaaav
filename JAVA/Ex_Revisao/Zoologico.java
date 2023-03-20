import Reinos.Animal;

public class Zoologico {
    //Ex 10, criar zoologico;
    
    public static void main (String [] args){

        Animal animais [] = new Animal[100]; //Vetor com nome animais do tipo Animal 
        
        
       

        //Para preencher com os 100 animais//instancias 

        for(int i=0; i < 100; i++){
            animais[i] = new Animal();
            //Ex13 
            //System.out.println("Nome" + animais[i].getNome()+
            // "Idade" + animais[i].getIdade());
            animais[i].imprimirDetalhes();
        }

        

        //Ex15
        Animal h = new Animal("Hashirama" , 4);

        //Ex16
        //System.out.println("Nome" + h.getNome()+
            // " Idade" + h.getIdade());

        //Ex18
        h.imprimirDetalhes();



    }

}
