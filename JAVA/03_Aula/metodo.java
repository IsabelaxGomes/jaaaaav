class Exemplo {

    // Soma entre números inteiros 
    static int somar (int a, int b) {
        int c = a + b;
        return c;
    }

    //função 

    static float media(float x, int y, int z){
        float resultado;
        resultado = (y + z + x) / (x + y);
        return resultado;
        

   }


    public static void main(String[] args) {
        int a = 3;
        int e = 9;
       

        System.out.println (media (1.5f, 9, a));
       

        
        System.out.println("A soma é: " + e);
    }
}

