package bikeparq;

// NO MODIFIQUE ESTE ARCHIVO. Estas pruebas deben seguir pasando después del Punto 4.

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ReportesTest {

    private static final List<Registro> REGISTROS = List.of(
            new Registro("carro", 3000),
            new Registro("moto", 1500),
            new Registro("carro", 600),
            new Registro("bicicleta", 999));

    @Test
    void resumenSumaSoloCarrosYMotos() {
        assertEquals(new Resumen(5100, 2, 1), Reportes.resumenDelDia(REGISTROS));
    }

    @Test
    void resumenDeUnDiaSinRegistros() {
        assertEquals(new Resumen(0, 0, 0), Reportes.resumenDelDia(List.of()));
    }

    @Test
    void mayorCobroDelDia() {
        assertEquals(3000, Reportes.mayorCobro(REGISTROS));
    }

    @Test
    void mayorCobroSinRegistrosEsCero() {
        assertEquals(0, Reportes.mayorCobro(List.of()));
    }
}
