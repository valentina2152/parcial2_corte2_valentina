package bikeparq;

public final class Recargo {

    private Recargo() {
    }

    public static int aplicarRecargoNocturno(int tarifa, int horaEntrada) {
        return tarifa + 2000;
    }
}
