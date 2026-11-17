package bikeparq;

import java.util.*;
import java.util.stream.Collectors;

public class Reportes {

    public static Resumen resumenDelDia(List<Registro> l) {
        int Total = 0, c = 0, m = 0;
        for (int i = 0; i < l.size(); i++) {
            Registro r = l.get(i);
            if (r.tipo() == "carro") {
                c++; Total += r.valor();
            }
            else if (r.tipo() == "moto") {
                m++; Total += r.valor();
            }
        }
        return new Resumen(Total, c, m);
    }

    public static int mayorCobro(List<Registro> l) {
        int x = 0;
        for (Registro r : l) if (r.valor() > x) x = r.valor();
        return x;
    }
}
