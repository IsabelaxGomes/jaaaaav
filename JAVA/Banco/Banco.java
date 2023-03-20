class Banco{
    
    public static void main (String[]args){
        Conta conta_1= new Conta();
        conta_1.exibir();


        Conta conta_2 = new Conta("João", "joão123", 123);
        conta_2.exibir();

        conta_2.deposito(3000.00);
        conta_2.exibir();
    }
}