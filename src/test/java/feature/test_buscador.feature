Feature: Realizar una consulta a través del buscador
  Como usuario quiero realizar una consulta a través del buscador para obtener un mayor detalle de información

  Scenario: Realizar una consulta a través del buscador de la pantalla Home

    Given El usuario se debe encontrar en la pagina Home principal de imalittletester
    When Situarse en la caja de busqueda Search
    And Ingresar la palabra Selenium
    And Lanzar las busqueda presionando la tecla Enter
    Then Se deben visualizar los resultados de la busqueda