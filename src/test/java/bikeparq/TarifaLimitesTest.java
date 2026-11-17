package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TarifaLimitesTest {

    @Test
    void minutosFueraDelDiaLanzanError() {
        assertThrows(IllegalArgumentException.class,
                () -> Tarifa.calcularTarifa(-1, "carro"));
        assertThrows(IllegalArgumentException.class,
                () -> Tarifa.calcularTarifa(1441, "moto"));
    }

    @Test
    void ceroMinutosEsGratisYOnceCobraUnMinuto() {
        assertEquals(0, Tarifa.calcularTarifa(0, "carro"));
        assertEquals(60, Tarifa.calcularTarifa(11, "carro"));
        assertEquals(30, Tarifa.calcularTarifa(11, "moto"));
    }

    @Test
    void diaCompletoRespetaTopesDeAmbosVehiculos() {
        assertEquals(25000, Tarifa.calcularTarifa(1440, "carro"));
        assertEquals(12000, Tarifa.calcularTarifa(1440, "moto"));
    }
}
