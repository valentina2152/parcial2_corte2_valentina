package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RecargoTest {

    @Test
    void horaFueraDeRangoLanzaErrorInclusoConTarifaCero() {
        for (int hora : new int[]{-1, 24}) {
            assertThrows(IllegalArgumentException.class,
                    () -> Recargo.aplicarRecargoNocturno(3000, hora));
            assertThrows(IllegalArgumentException.class,
                    () -> Recargo.aplicarRecargoNocturno(0, hora));
        }
    }

    @Test
    void tarifaCeroNoPagaRecargoDeNoche() {
        assertEquals(0, Recargo.aplicarRecargoNocturno(0, 23));
        assertEquals(0, Recargo.aplicarRecargoNocturno(0, 5));
    }

    @Test
    void diaNoCambiaTarifaIncluidosLosLimites() {
        for (int hora : new int[]{6, 10, 19}) {
            assertEquals(3000, Recargo.aplicarRecargoNocturno(3000, hora));
        }
    }

    @Test
    void nocheSumaDosMilIncluidosLosLimites() {
        for (int hora : new int[]{0, 5, 20, 22, 23}) {
            assertEquals(5000, Recargo.aplicarRecargoNocturno(3000, hora));
        }
    }
}
