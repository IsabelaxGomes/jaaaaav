package conversor;
public class ConversaoDeArea {
    public static double metro_pes(double metroQuadrado) {
        return metroQuadrado * 10.76;
    }

    public static double pes_centimetro(double pesQuadrado) {
        return pesQuadrado * 929;
    }

    public static double milha_acre(double milhas) {
        return milhas * 640;
    }

    public static double acre_pe(double acre) {
        return acre * 43560;
    }

}