package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TarifaTest {

    @Test
    void cp01CarroUnaHoraCuestaTresMil() {
        int minutos = 60;
        String tipo = "carro";
        int resultado = Tarifa.calcularTarifa(minutos, tipo);
        assertEquals(3000, resultado);
    }

    @Test
    void cp02MotoDiezMinutosNoPaga() {
        int minutos = 10;
        String tipo = "moto";
        int resultado = Tarifa.calcularTarifa(minutos, tipo);
        assertEquals(0, resultado);
    }

    @Test
    void cp03BicicletaLanzaError() {
        int minutos = 60;
        String tipo = "bicicleta";
        assertThrows(IllegalArgumentException.class,
                () -> Tarifa.calcularTarifa(minutos, tipo));
    }
}