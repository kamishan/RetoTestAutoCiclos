Feature: Yo como automatizador,
  requiero completar los ciclos de ejercicios en Evalart.com,
  para validar su funcionalidad y obtener el codigo de finalización de la prueba

  @resolverCiclos
  Scenario Outline: completar los distitos ciclos de ejercicios y
  obtener el codigo de finalización de la prueba Evalart
    Given realizo login con <Usuario>, <Contrasena>
    When completo los ejercicios
    Then se valida la ejecución de los ciclos de ejercicio, y se obtiene el codigo de finalización de la prueba exitosamente

    Examples:
      | Usuario | Contrasena                                       |
      | 731981  | 10df2f32286b7120Mi00LTE4OTEzNw==30e0c83e6c29f1c3 |