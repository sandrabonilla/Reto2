# Reto 2

Automatización de la página de despegar haciendo uso del patrón Screenplay y de un conector de Excel

## Requerimientos

El proyecto puede importarse en cualquier IDE de desarrollo, preferiblemente Eclipse.  Se trata de un proyecto Gradle y conviene tener instalada la última versión, al igual que el plugin de Cucumber

### Instalación

Para clonar el proyecto, ejecutar el comando:

```
git clone https://github.com/sandrabonilla/Reto2.git
```
### Driver

El driver utilizado para la prueba es el driver de chrome versión 2.38 <[chromedriver.exe](https://sites.google.com/a/chromium.org/chromedriver/downloads)>.  Sin embargo, es posible ejecutarlo con otros driver realizando una modificación al atributo driver de la anotación @Managed

## Conclusiones

* El patrón Screenplay facilita en gran medida la reutilización de código gracias a la orientación a tareas
* La librería POI provee una implementación sencilla para crear, editar y eliminar archivos de excel
* Es muy importante contar con una buena conexión a internet para realizar pruebas automatizadas, pues esto puede tener una incidencia muy negativa en las pruebas
* El manejo de calendarios es complejo y es muy importante llegar a una solución que no dependa de la fecha actual
* Las popup y modales son elementos que pueden aumentar significativamente la inestabilidad de las pruebas, por lo que es importante contar con una buena estrategia para controlarlas
* Es importante analizar los xpath que generan los navegadores antes de utilizarlos, pues mucha veces no son adecuados