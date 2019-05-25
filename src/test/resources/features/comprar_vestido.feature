#Author: da.lope@hotmail.com
@tag
Feature: Compra de un vestido
  Yo como usuario quiero realizar el proceso de compra de un vestido y tener el comprobante de la transaccion.

  @CompraExitosaDeUnVestido
  Scenario: El usuario se dirige a la opcion DRESSES, elige el vestido mas costoso, realiza el proceso de compra y obtiene el comprobante de la transaccion realizada en un archivo de texto.
    Given El usuario esta en el portal de ventas en la opcion DRESSES
    When Selecciona el vestido mas costoso
    And realiza el proceso de compra
    Then finaliza la compra
    And obtiene el comprobante de la transaccion en un archivo de texto
