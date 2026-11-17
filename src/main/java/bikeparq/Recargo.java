package bikeparq;

public final class Recargo {

    private static final int RECARGO_NOCTURNO = 2000;

    private Recargo() {
    }

    public static int aplicarRecargoNocturno(int tarifa, int horaEntrada) {
        if (horaEntrada < 0 || horaEntrada > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (tarifa == 0) {
            return 0;
        }
        if (horaEntrada >= 20 || horaEntrada <= 5) {
            return tarifa + RECARGO_NOCTURNO;
        }
        return tarifa;
    }
}
