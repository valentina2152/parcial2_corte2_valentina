package bikeparq;

import java.util.List;

public class Reportes {

    public static Resumen resumenDelDia(List<Registro> registros) {
        int total = 0;
        int carros = 0;
        int motos = 0;
        for (Registro registro : registros) {
            if ("carro".equals(registro.tipo())) {
                carros++;
            } else if ("moto".equals(registro.tipo())) {
                motos++;
            } else {
                continue;
            }
            total += registro.valor();
        }
        return new Resumen(total, carros, motos);
    }

    public static int mayorCobro(List<Registro> registros) {
        int mayor = 0;
        for (Registro registro : registros) {
            mayor = Math.max(mayor, registro.valor());
        }
        return mayor;
    }
}