package bikeparq;

public final class Recargo {

    private static final int RECARGO_NOCTURNO = 2000;
    private static final int HORA_MINIMA = 0;
    private static final int HORA_MAXIMA = 23;
    private static final int INICIO_NOCHE = 20;
    private static final int FIN_NOCHE = 5;

    private Recargo() {
    }

    public static int aplicarRecargoNocturno(int tarifa, int horaEntrada) {
        if (horaEntrada < HORA_MINIMA || horaEntrada > HORA_MAXIMA) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (tarifa == 0) {
            return 0;
        }
        if (esHorarioNocturno(horaEntrada)) {
            return tarifa + RECARGO_NOCTURNO;
        }
        return tarifa;
    }

    private static boolean esHorarioNocturno(int horaEntrada) {
        return horaEntrada >= INICIO_NOCHE || horaEntrada <= FIN_NOCHE;
    }
}
