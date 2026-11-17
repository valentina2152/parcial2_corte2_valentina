package bikeparq;

public final class Recargo {

    private static final int RECARGO_NOCTURNO = 2000;

    private Recargo() {
    }

    public static int aplicarRecargoNocturno(int tarifa, int horaEntrada) {
        if (horaEntrada >= 20 || horaEntrada <= 5) {
            return tarifa + RECARGO_NOCTURNO;
        }
        return tarifa;
    }
}
