# Serenity BDD Project with Cucumber and Screenplay

Este proyecto utiliza Serenity BDD junto con Cucumber y Screenplay para la automatización de pruebas funcionales de una aplicación web. Serenity proporciona una poderosa biblioteca de reportes y Cucumber permite escribir pruebas en un formato legible para humanos. Screenplay es un patrón de diseño que mejora la legibilidad y mantenibilidad de las pruebas.

## Requisitos

- JDK 1.8.0
- Gradle 7.1
- Cucumber 3.2.5
- Firefox o Chrome (se recomienda tener el controlador correspondiente) en estas pruebas se utilizo firefox

## Instalación

1. **Clonar el repositorio:**

    ```sh
    git clone https://github.com/MariaFranco2161/Serenity-NTTDATA-challenge
    cd tu-repo
    ```

2. **Configurar las dependencias:**

    Asegúrate de tener gradle instalado y ejecuta el siguiente comando para descargar las dependencias del proyecto:


## Estructura del Proyecto

- **src/main/java**: Contiene el código fuente de la aplicación.
- **src/test/java**: Contiene las pruebas automatizadas.
- **src/test/resources**: Contiene los archivos de características de Cucumber (`.feature`) y otros recursos necesarios para las pruebas.

## Configuración

### Configuración de Serenity

El archivo de configuración de Serenity se encuentra en `src/test/resources/serenity.conf` o `serenity.properties`. Asegúrate de configurar los parámetros según tu entorno de prueba:

```properties
serenity.driver=firefox
