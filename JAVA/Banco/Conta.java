public class Conta {
    //Atributos
    String cliente;
    String senha;
    Double saldo;

    //Metodos 
   
    void deposito (double valorDepositado){
        System.out.println("Valor depositado é:" + valorDepositado);
        this.saldo = this.saldo + valorDepositado;
    }

    void retirada (double valorRetirado){
        System.out.println("VaLor retirado:" + valorRetirado);
        this.saldo = this.saldo - valorRetirado;
    }


    //Contrutor
    public Conta (){
        System.out.println("Criando conta vazia");
        cliente = "";
        senha = "";
        saldo = 5000.0;

    }
    //Contrutor 
    public Conta(String cliente, String senha, double saldo){
        System.out.println("Criando conta preenchida");
        this.cliente = cliente;
        this.senha= senha;
        this.saldo = saldo;
}

    void exibir(){
        System.out.println("Cliente"+ this.cliente);
        System.out.println("Senha: "+ this.senha);
        System.out.println("Saldo:" + this.saldo);
    }
}


