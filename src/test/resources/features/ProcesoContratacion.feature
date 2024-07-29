# author: Shirley Varón
# language: es


Característica: Proceso de contratación en "OrangeHRM"

  @ProcesoContratacion
  Escenario: Agregar y verificar un nuevo candidato en el sistema
    Dado "Shirley" abre el sitio web de prueba
    Cuando inicio sesión con credenciales válidas y visualiza pagina de "Dashboard"
    Y "Shirley" navega a la sección de reclutamiento y hace clic en el botón agregar
    Y "Shirley" completa los detalles del candidato con información válida
    Entonces los datos deberían coincidir con los ingresados y el estado debería ser "Hired"


