# Vehicle Order Processing API
API RESTful para procesar órdenes de vehículos en formato XML y retornar respuestas en JSON, del sistema GTS Hub (Global Trade Services).

## Tecnologías
- Java 17
- Spring Boot 4.0.0

## Cómo Ejecutar
1. Compilar el proyecto
```
./gradlew build
```
2. Ejecutar la aplicación
```
./gradlew bootRun
```
&nbsp; &nbsp; &nbsp; O ejecutar el JAR:
```
java -jar build/libs/order-process-0.0.1-SNAPSHOT.jar
```
3. Verificar que está corriendo. La aplicación estará disponible en:
```
http://localhost:8080
```

## Documentación API 
Verificar Swagger UI: 
```
http://localhost:8080/swagger-ui.html
```
OpenAPI JSON:
```
http://localhost:8080/swagger-ui.html
```

## Endpoints
### POST /api/vehicles/process
Procesa una orden de vehículo en formato XML.

Request:
- Content-Type: application/xml
- Body: XML con estructura de VehicleOrder

Response:
- Content-Type: application/json
- Status Codes:
    - ```200 OK``` - Orden procesada exitosamente
    - ```400 BAD REQUEST``` - Error de validación
    - ```500 INTERNAL SERVER ERROR``` - Error inesperado

## Probando el API
### Con cURL
```
curl -X POST http://localhost:8080/api/vehicles/process \
-H "Content-Type: application/xml" \
-d @src/main/resources/sample-order.xml
```
### Con Postman
- Method: ```POST```
- URL: ```http://localhost:8080/api/vehicles/process```
- Headers:
  - Content-Type: ```application/xml```
- Body (raw): Pegar el contenido del XML de ejemplo

### Con Swagger UI
- Ir a ```http://localhost:8080/swagger-ui.html```
- Expandir el endpoint ```POST /api/vehicles/process```
- Click en "Try it out"
- Pegar el XML de ejemplo en el campo Request body
- Click en "Execute"

## Troubleshooting
### La aplicación no inicia
1. Verificar que Java 17 esté instalado: java -version
2. Verificar que el puerto 8080 esté disponible
3. Revisar los logs en la consola

### Error al procesar XML
1. Verificar que el ```Content-Type sea application/xml```
2. Validar que el XML esté bien formado
3. Revisar los ejemplos en Swagger UI

### No aparece Swagger
1. Verificar que la URL sea: ```http://localhost:8080/swagger-ui.html```
2. Verificar que la dependencia ```springdoc-openapi-starter-webmvc-ui``` esté en el ```build.gradle```

## Licencia
Este proyecto fue desarrollado por el equipo de GTSHub como herramienta de evaluación técnica.

**Uso:** Exclusivamente para procesos de selección y evaluación de candidatos.

---
Si estás aquí como parte de un proceso de entrevista, ¡Buena suerte!

*¿Preguntas sobre el proyecto? Contacta al equipo de Talent Acquisition.*

© 2025 GTSHub. Todos los derechos reservados.
