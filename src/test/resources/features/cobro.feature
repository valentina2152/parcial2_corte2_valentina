# language: es
Característica: Cobro por permanencia en el parqueadero BikeParq
  Como cajero del parqueadero
  quiero que el sistema calcule el cobro
  para no hacer cuentas a mano

  Escenario: Un carro permanece una hora
    Dado un vehículo tipo "carro"
    Cuando permanece 60 minutos
    Entonces el cobro es de 3000 pesos

  # PUNTO 3: escriba aquí sus 3 escenarios del recargo nocturno.

  Escenario: Una entrada nocturna suma dos mil pesos a la tarifa
    Dado una tarifa de 3000 pesos
    Cuando el vehículo entró a las 22 horas
    Entonces el total a pagar es de 5000 pesos

  Escenario: Una entrada diurna conserva la tarifa sin recargo
    Dado una tarifa de 3000 pesos
    Cuando el vehículo entró a las 10 horas
    Entonces el total a pagar es de 3000 pesos

  Escenario: La tarifa cero por tiempo de gracia no paga recargo de noche
    Dado una tarifa de 0 pesos
    Cuando el vehículo entró a las 23 horas
    Entonces el total a pagar es de 0 pesos
