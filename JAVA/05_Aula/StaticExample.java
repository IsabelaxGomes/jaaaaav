class LampadaStatic {
    public static boolean acesa;
}

class LampadaNormal {
    public boolean acesa;
}

class Casa {
    public static void main(String[] args) {
        LampadaStatic LS1 = new LampadaStatic();
        LampadaStatic LS2 = new LampadaStatic();
        LampadaStatic LS3 = new LampadaStatic();
        //static não é independente, então quando coloco false para um, todos viram false

        LampadaNormal LN1 = new LampadaNormal();
        LampadaNormal LN2 = new LampadaNormal();
        LampadaNormal LN3 = new LampadaNormal();

        // Vamos acender as duas primeiras
        // e apagar a terceira
        LS1.acesa = true;
        LS2.acesa = true;
        LS3.acesa = false;

        LN1.acesa = true;
        LN2.acesa = true;
        LN3.acesa = false;
        //elementos independentes

        // Vamos imprimir o estado de cada lâmpada
        System.out.println("Lâmpadas static:");
        System.out.println(LS1.acesa);
        System.out.println(LS2.acesa);
        System.out.println(LS3.acesa);
        System.out.println();
        System.out.println("Lâmpadas normais:");
        System.out.println(LN1.acesa);
        System.out.println(LN2.acesa);
        System.out.println(LN3.acesa);
    }
}