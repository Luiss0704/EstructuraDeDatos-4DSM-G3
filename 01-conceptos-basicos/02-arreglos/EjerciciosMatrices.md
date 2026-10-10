# Ejercicios con matrices

1. Ojetivos:
- Aplicar la lógica de arreglos bidimensionales (matrices) en Java utilizando el paradigma de POO implementando validaciones de dimesiones, recorridos de índices y encapsulación.

<br>
<br>

## Ejercicio 1
### Sistema de reserva de asientos
#### Matriz MxN (No cuadrada)

<br>

Diseña un método que se llame ```reservaAsiento(fila, columa)``` que controle el mapa de ocupación de un teatro, sala o autobus.

- La matriz inicializará en un ```false``` **(libre)**.
- Si el asiento solicitado contiene ```false```, cambiar a ```true``` **(ocupado)** y muestre un mensaje de éxito.
- Si el asiento ya contiene ```true```, notifica que está **ocupado**.
- Validar que las coordenadas ingresadas no excedan los límites de la matriz.


<br>
<br>
<br>

## Ejercicio 2
### Acumulado de ventas por sucursal y mes
#### Matriz MxN (No cuadrada)

<br>

Una empresa registra las ventas **enteras** de **_M_** sucursales en **_N_** meses.

- Implementar un método que calcule la suma por cada fila _(total por sucursal)_.
- Calcular la suma por cada columna _(total por mes)_.
- Genera un reporte formateado que muestre ambos totales en un sólo panel de texto.


<br>
<br>
<br>

## Ejercicio 3
### Diagnóstico de matriz identidad y diagonal principal
#### Matriz NxN (Cuadrada)

<br>

- Implementa un módulo para análisis algebráico:
    - **Validación previa**: Comprueba si la matriz es cuadrada. Si no lo es, cancela la operación y muestra un mensaje de advertencia.
- Si es cuadrada, evalúa si es una **matriz identidad** (1s en la diagonal principal y 0s en el resto de la matriz).
- Calcula e impmrime la summa de los elementos de la diagonal principal.


<br>
<br>
<br>

## Ejercicio 4
### Transposición dinámica de matriz
#### Matriz MxN --> NxM (No cuadrada)

<br>

- Crea un método ```obtenerTranspuesta()``` que invierta la orientación de los datos.
- La función debe retornar una nueva instancia de la clase ```Matriz``` con dimensiones invertidas **_NxM_**.
- Copia cada elemento siguiendo la regla de transposición ```transpuesta[j][i]```

<br>
<br>
<br>

## Ejercicio 5
### Rotación de la matriz a 90° en sentido horario
#### Matriz NxN (Cuadrada)

<br>

- Simula el giro de una matriz cuadrada de pixeles o mapa:
    - **Validación previa**: Comprueba si la matriz es cuadrada. Si no lo es, cancela la operación y muestra un mensaje de advertencia.
- Retornar una nueva instancia de ```Matriz``` rotada a 90° a la derecha.