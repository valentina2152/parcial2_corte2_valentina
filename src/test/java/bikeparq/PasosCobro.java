package bikeparq;

// Pasos del BDD. Los pasos que ya están aquí funcionan: no los cambie.

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasosCobro {

    private String tipo;
    private int cobro;

    @Given("un vehículo tipo {string}")
    public void unVehiculoTipo(String tipo) {
        this.tipo = tipo;
    }

    @When("permanece {int} minutos")
    public void permanece(int minutos) {
        cobro = Tarifa.calcularTarifa(minutos, tipo);
    }

    @Then("el cobro es de {int} pesos")
    public void elCobroEsDe(int esperado) {
        assertEquals(esperado, cobro);
    }

    // PUNTO 3: agregue aquí los pasos de sus escenarios del recargo nocturno.
    private int tarifa;
    private int total;

    @Given("una tarifa de {int} pesos")
    public void unaTarifaDe(int tarifa) {
        this.tarifa = tarifa;
    }

    @When("el vehículo entró a las {int} horas")
    public void elVehiculoEntroALas(int hora) {
        total = Recargo.aplicarRecargoNocturno(tarifa, hora);
    }

    @Then("el total a pagar es de {int} pesos")
    public void elTotalAPagarEsDe(int esperado) {
        assertEquals(esperado, total);
    }
}
