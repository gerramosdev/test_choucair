#language: es

@Regresion
Característica: Registro de contratacion en OrangeHRM

  Como usuario, quiero acceder a OrangeHRM para registrar una nueva contratacion

  Esquema del escenario: Acceder al sistema y registrar una contratacion
    Dado que el Usuario accede a OrangeHRM
    Cuando inicio sesion con las credenciales de un usuario valido
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y me dirijo a la seccion Recruitment y presiono el boton +Add
    Y lleno el formulario de registro de contratacion con
      | nombre   | segundoNombre   | apellido   | email   | vacante   | numeroTelefonico   | palabraClave   | fechaInicio   | notas   |
      | <nombre> | <segundoNombre> | <apellido> | <email> | <vacante> | <numeroTelefonico> | <palabraClave> | <fechaInicio> | <notas> |
    Y guardo los datos de la nueva contratacion
      | entrevista   | entrevistador   | fechaInicio   |
      | <entrevista> | <entrevistador> | <fechaInicio> |
    Entonces confirmo que la nueva contratacion fue registrada correctamente
      | estado   |
      | <estado> |

    Ejemplos:
      | usuario | contrasenna | nombre | segundoNombre | apellido | email                 | vacante               | numeroTelefonico | palabraClave | fechaInicio | notas               | entrevista      | entrevistador  | estado |
      | Admin   | admin123    | German | Sain          | Perez    | Inge_gesape@gmail.com | Payroll Administrator | 3009458833       | QA Choucair  | 2000-19-07  | Postulacion QA 2025 | ChoucairTesting | Charles Carter | Hired  |
