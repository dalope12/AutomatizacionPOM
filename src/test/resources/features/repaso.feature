@tag
Feature: Comprar una camisa de mujer
  Yo como mujer pupi quiero comprar una camisa

  @ComprarCamisa
  Scenario: Comprar una camisa exitosamente
    Given El usuario esta en el portal de ventas
    When agrega al carrito la camisa de mujer 'Faded Short Sleeve T-shirts'
    Then la experiencia lo lleva al 'SHOPPING-CART SUMMARY' y a la url 'http://automationpractice.com/index.php?controller=order'
    
  #@ComprarElConjuntoDeRopa
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
