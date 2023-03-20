public class Janela {
    /* Atributos */
    boolean aberta;

    /* Métodos */
    void abrir() {
        aberta = true;
    }

    void fechar() {
        aberta = false;
    }

    boolean mostrarEstado() {
        return aberta;
    }
}

