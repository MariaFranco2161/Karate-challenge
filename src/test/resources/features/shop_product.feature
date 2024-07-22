Feature: Purchase products
  @happyPath
  Scenario: Compra de productos
    Given que el usuario esta en la pagina principal de DemoBlaze
    When el usuario agrega los siguientes productos al carrito:
          | Samsung galaxy s6   |
          | Nokia lumia 1520  |
    And el usuario visualiza el contenido del carrito
    And el usuario va a realizar el pedido
    And el usuario completa el formulario de compra con:
      | Nombre    | Maria Franco |
      | Pais      | Ecuador      |
      | Ciudad    | Guayaquil    |
      | Tarjeta   | 1234567890123456 |
      | Mes       | 12           |
      | Anio       | 2025         |
    Then el usuario finaliza la compra exitosamente