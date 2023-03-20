package conversor;
public class ConversaoDeTempo {

    public static double minuto_segundo(double segundo) {
        return segundo * 60;
    }
    public static double hora_minuto(double minuto) {
        return minuto * 60;
    }
    public static double dia_hora(double hora) {
        return hora * 24;
    }
    public static double semana_dia(double dia) {
        return dia * 7;
    }
    public static double mes_dia(double dia) {
        return dia * 30;
    }
    public static double ano_dia(double dia) {
        return dia * 365.25;
    }


}