# LA FLOTA DE MAXIMO BARCOS-EXAMEN
**Indice:**
- **Introducción**
- **Enunciado del examen**
- **Metodología**

## Introducción

En este examen se pretende que el alumno desarrolle un programa que permita crear una flota de barcos, 
cada uno con sus distintas intereacciones... esto se explica mejor en el enunciado del examen.


## Enunciado del examen

- Todos los barcos tienen un comportamiento en común: los métodos alarma() y
mensajeSocorro(), ¿qué implicaciones tiene esa afirmación a hora de construir
barco? Explícalo con tus propias palabras.

- Del **barco crucero** se quiere guardar los metros de eslora y un contador del
número de camas ocupadas. El contador se utilizará para almacenar el número de
camas que se vayan creado.

- Del **barco portaaviones** se desea almacenar el número de aviones y el número de
marinos. También queremos los métodos get y set de los atributos
correspondientes, ¿Son realmente necesarios? ¿Se utilizan en algún momento?
Explícalo con tus propias palabras.
- Del **barco pesquero** se guardan los metros de eslora, la potencia, el número de
pescadores.

**Cada vez que se cree un barco deberá mostrarse un mensaje indicándose los datos
del barco creado.**

- El método **alarma** muestra un mensaje indicando desde qué tipo de barco se envía
la alarma. Este **método podrá ser accedido** desde fuera de la clase.

- El método mensaje de **socorro** invoca al método **alarma**, y, además, muestra un
mensaje a partir de una cadena que recibe por parámetro. Este **método podrá ser
accedido** desde fuera de la clase.


Haz un diagrama, como el visto en clase de la estructura de clases resultante y
completa los métodos correspondientes y crea un programa principal que utilice
los diferentes tipos de barcos y ejecuta los mensajes de socorro y alarma de
cada uno.

## Metodología


Para poder ir resolviendo el examen, debiamos seguir la metodología TDD, __Test Development Driven__ , que se resume en :

- Escribir casos test para una clase.
- Resolver esos casos test construyendo la clase.
- Refactorizar código.