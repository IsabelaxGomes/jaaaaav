package conversor;
public class ConversaoDeVolume {
    public static double litro_centimetro (double litro) {
        return litro * 1000;
    }
    public static double metro_litro (double metro) {
        return metro * 1000;
    }
    public static double metro_pes (double metro) {
        return metro * 35.32;
    }
    public static double galao_polegada (double galao) {
        return galao * 231;
    }
    public static double galao_litro (double galao) {
        return galao * 3785;
    }
}