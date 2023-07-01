Feature: Yo como automatizador,
  requiero completar el login Evalart.com
  para validar su funcionalidad

  @login
  Scenario Outline: completar formulario login Evalart
    Given ingreso a la WEB page Evalart
    When completo los campos requeridos <Usuario>, <Contrasena>
    Then Valido que se muestre la pagina inicial

    Examples:
      | Usuario | Contrasena                                       |
      | 638621  | 10df2f32286b7120MS00LTEyNjgzNg==30e0c83e6c29f1c3 |

  @resolverCiclos
  Scenario Outline: completar formulario login Evalart
    Given realizo login con <Usuario>, <Contrasena>
    When completo los ejecicios con <Modulo> y <Dias>
    Then Valido que se muestre la pagina inicial

    Examples:
      | Usuario | Contrasena                                       | Modulo | Dias |
      | 638621  | 10df2f32286b7120MS00LTEyNjgzNg==30e0c83e6c29f1c3 | 5      | -22  |

  @resolverCiclo2
  Scenario Outline: completar formulario login Evalart
    Given realizo login con <Usuario>, <Contrasena>
    When completo los ejecicios con <Modulo1> y <Dias1>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo2> y <Dias2>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo3> y <Dias3>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo4> y <Dias4>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo5> y <Dias5>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo6> y <Dias6>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo7> y <Dias7>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo8> y <Dias8>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo9> y <Dias9>
    And avanzo al siguiente ciclo
    And completo los ejecicios con <Modulo10> y <Dias10>
    And avanzo al siguiente ciclo
    Then se valida la ejecución de los ciclos de ejercicio exitosamente
    
    Examples:
      | Usuario | Contrasena                                       | Modulo1 | Dias1 | Modulo2 | Dias2 | Modulo3 | Dias3 | Modulo4 | Dias4 | Modulo5 | Dias5 | Modulo6 | Dias6 | Modulo7 | Dias7 | Modulo8 | Dias8 | Modulo9 | Dias9 | Modulo10 | Dias10 |
      | 638621  | 10df2f32286b7120MS00LTEyNjgzNg==30e0c83e6c29f1c3 | 5       | -22   | 8       | 34    | 3       | -102  | 5       | -111  | 2       | -52   | 3       | -49   | 7       | 99    | 4       | -60   | 8       | -27   | 5        | 67     |