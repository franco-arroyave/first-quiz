# Informe de seguridad

Por Jose Franco Arroyave Cardona

## Objetivo

Definir controles para mitigar el riesgo de ocurrencia de un evento de seguridad que pueda comprometer la continuidad del negocio.

-------------------------------------------

Como recurso base se empleará la OWASP Top 10 2021, que define los 10 tipos de vulnerabilidades más representativas y a partir de las cuales se describirán los controles mínimos necesarios para certificar la puesta en producción de los diferentes componentes de la aplicación, como son web, mobile, backend y DB.

### A01:2021 - Broken Access Control
* Definir roles que garanticen el mínimo acceso necesario para cada usuario interno y externo de la startup y faciliten la administración de los permisos.
* Segmentar a los desarrolladores en equipos responsables de partes de software independientes como web, mobile, backend y DB, con el fin de compartimentar la información y reducir el volumen en caso de fuga de información.

### A02:2021 - Cryptographic Failures
* Utilizar protocolos de comunicación seguros que utilicen técnicas de encriptación vigentes como TLS 1.2 y 1.3.
* Renovar anualmente las llaves criptográficas.
* Clasificar la información según su grado de sensibilidad y almacenarla debidamente cifrada en las bases de datos.

### A03:2021 - Injection
* Utilizar un ORM para proveer datos a la aplicación.
* Validar los inputs del lado del servidor.

### A04:2021 - Insecure Design
* Utilizar patrones de diseño seguros.
* Limitar el uso de recursos por usuario o servicio.
* Segmentar por capas el sistema, establecer reglas entre las capas según su nivel de exposición.

### A05:2021 - Security Misconfiguration
* Utilizar las configuraciones de seguridad recomendadas para los diferentes servicios de AWS.
* Remover las configuraciones o datos quemados en las fases de prueba y desarrollo del software.

### A06:2021 - Vulnerable and Outdated Components
* Inventariar los componentes como librerías, frameworks, entre otros, para administrar y aplicar actualizaciones garantizando las versiones estables más recientes.
* Remover los componentes en desuso.

### A07:2021 - Identification and Authentication Failures
* Definir un formato de contraseñas con longitud superior a 10 caracteres y complejidad alta, incluyendo mayúsculas, minúsculas, números y caracteres especiales.
* Implementar MFA a través de tokens enviados a los medios de contacto previamente registrados y validados, como correo electrónico y teléfono celular.
* Ocultar debidamente los identificadores de sesión, establecer un período de caducidad de la sesión por inactividad no mayor a 10 minutos.
* Usar tiempos de retardo incremental en casos de intentos de inicio de sesión recurrentes y captcha.

### A08:2021 - Software and Data Integrity Failures
* Utilizar firmas digitales para verificar la data y garantizar que no fue modificada.
* Establecer un proceso de revisión en los cambios del código que minimice la introducción de código malicioso.

### A09:2021 - Security Logging and Monitoring Failures
* Registrar marcas de tiempo y datos de conexión para los logins.
* Establecer políticas de inicios de sesiones sospechosas.
* Registrar los logs en un formato legible.

### A10:2021 - Server-Side Request Forgery
* Analizar y validar todos los datos de entrada proporcionados por el cliente.
* Fortalecer el esquema URL estableciendo una lista de acceso permitido.

## Referencias
OWASP Top 10; 2021; https://owasp.org/Top10/