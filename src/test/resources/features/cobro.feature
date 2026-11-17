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
