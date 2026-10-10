# Tipo de Datos Abstractos

La idea central es que no se memorice TDA como una definición.

La secuencia para entenderlo:

**Problema**=>**Datos**=>**Operaciones**=>**Reglas**=>**Abstracción**=>**TDA**=>**Implementación**=>**Clase Java**=>**Estructura de datos**

para después entrar a lo que es una *pila*, *cola*, *lista* y *arboles*

1. Problema:

> Supongamos que tenemos un sistema escolar y queremos manejar estudiantes.

Cada estudiante:

- Matrícula
- Nombre
- Carrera
- Promedio

Hasta ahora estamos de **datos**

Pero el programa no solamente necesita almacenar esos datos. También necesita hacer cosas con ellos:

- Registrar un cliente
- Consultar sus datos
- Cambiar su promedio
- Verificar si está aprobado
- Mostrar información

Entonces aparece una idea importante:

En programación no solamente importa **qué datos tenemos**, sino también **qué operaciones podemos realizar sobre esos datos**.

Nota: Este es el primer paso hacia un TDA.

<br>

2. Dato simple vs algo más complejo:

Ya conocemos: 

```java
int edad;
double promedio;
String nombre;
```
Estos tipos de datos ya los conoce Java.

Por ejemplo:

`int edad = 20;`

Java sabe:

- Qué tipo de valor puede almacenar.
- Cuánto espacio requiere.
- Qué operaciones se pueden realizar.

Con un int:

```java
edad + 1
edad - 1
edad > 18
edad ++
```
Pero si pensamos en:

`Estudiante`

Java originalmente no tiene un tipo llamado **Estudiante**

Necesitamos construirlo.

Aquí comienza a aparecer la idea de **crear nuestros propios tipos de datos**.

<br>

3. ¿Qué sería un tipo de dato?

Se puede definir inicialmente así:

> Un tipo de dato define qué valores pueden existir y qué operaciones pueden realizarse con esos valores

Por ejemplo:

*int*
Valores posibles:

- -10
- 0
- 5
- 100
- 2500

Operaciones: Aritméticas y Relacionales

<br>

*boolean*
Valores posibles:

- True
- False

Operaciones: