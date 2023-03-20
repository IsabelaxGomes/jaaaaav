import Conta.conta_nenhum;
import Conta.conta_private;
import Conta.conta_protected;
import Conta.conta_public;
class Caixa {
    public static void main(String[] args) {
        conta_public cpb = new conta_public();
        conta_protected cpt = new conta_protected();
        conta_nenhum cn = new conta_nenhum();
        conta_private cpv = new conta_private();

        /* Acessando public */
        System.out.println(cpb.saldo);

        /* Acessando protected */
        //System.out.println(cpt.saldo);

        /* Acessando nenhum */
        //System.out.println(cn.saldo);

        /* Acessando private */
        //System.out.println(cpv.saldo);
    }
}