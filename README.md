# Reto 5

## Práctica Laboratorio(3): TDD y Pruebas Unitarias con SpringBoot

1. Principales diferencias entre subdirectorios java en main y java en test:
La principal diferencia radica en la apariencia de estos directorios, Intellij Idea reconoce y configura automaticamente esta estructura estandar.
por otra parte tenemos que en el subdirectorio src/main/java se almacena el código fuente principal de la aplicación
y el subdirectorio src/test/java almacena el código de las pruebas, es decir, las pruebas que verifican que el codigo principal funcione correctamente
Además podemos encontrar otros subdirectorios como resources dentro de main y test que se usan para almacenar recursos adicionales como archivos de configuración, imagenes, entre otros.

2. Diferencias entre las dependencias configuradas en el reto3 vs reto05
La diferencia principal es la adición de dependencias específicas para el testing en el laboratorio actual, lo que sugiere que este laboratorio incluye un enfoque en pruebas, 
asegurando que la aplicación funcione correctamente a través de casos de prueba bien definidos.
Las testImplementation te proporcionan todas las clases y anotaciones necesarias para
escribir y ejecutar pruebas unitarias con JUnit 5

3. Acyualización del Gradle
principalmente lo que se observa luego realizar la accion de actualizar el gradle, son los cambios en las versiones de las librerias , asi como tambien nuevas dependencias que fueron añadidas

   
### EJECUCIÓN DE LOS TEST
#### ¿Qué puedes decir sobre el tiempo de ejecución de la prueba?.

El tiempo de ejecución de la prueba fue de 55ms, lo cual resulta un tiempo razonable e indica que las pruebas estan bien optimizadas y que los metodos que he probado son eficientes

#### ¿Qué observas sobre el antes y después del directorio build?.
Principalmente que el archivo index.html cambia cada que se realiza un Run Test

#### Dirígete al directorio “reports”, ubica el index.html, y ábrelo en el navegador de tu preferencia ¿que puedes interpretar del contenido?.

Se observa una metrica que dice que las pruebas han sido exitosas al 100% ademas de los test relacionados, el tiempo y el resultado de cada test

#### ¿El "análisis estático" de este código realizado previamente te permite adelantarte a los resultados?.
El analisis estatico permite adelantarse a los resultados en ciertos aspecto, como por ejemplo identificacion de errores tempranos como errores de sintaxis, tambien se podrian detectar errores en variables, metodos o clases que esten declarados correctamente. Por ejemplo, verificaría si sut está correctamente inicializado y si los métodos sayHello y getAllCategories devuelven el tipo esperado.
#### ¿Se lograron los resultados esperados?
Si, los resultados que se esperaban en los metodos era el retorno de "Hello" o "Goodby", por lo cual tuvieron un 100% de exito.  
#### Print screen del resultado
![Resultados esperados](/images/resultados-esperados.png)

## Pongamos a fallar la prueba

El tiempo de ejecución fue de 81ms, un poco mas lento en comparacion con la prueba anterio. La prueba ha detectado correctamente que el método sayHello ya no está devolviendo el valor esperado.

### PrintScreen del resultado

![Resultados esperados](/images/prueba-fallida.png)

#### PrintScreen de pruebas con cobertura 

![pruebas_de_cobertura](/images/pruebas-de-cobertura.png)
