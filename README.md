# Método de Euler 

## Descripción

Este proyecto implementa el Método de Euler mediante una estructura modular en Java para resolver ecuaciones diferenciales ordinarias de primer orden.

El problema que resuelve es:

\[
y'=x-y
\]

Con las condiciones iniciales:

- x inicial = 0
- y inicial = 1
- x final = 0.3
- Tamaño de paso inicial (h) = 0.1

## Estructura del programa

El programa está dividido en tres clases:

- **Main.java:** establece las condiciones iniciales y ejecuta el método.
- **MetodoEuler.java:** implementa el algoritmo numérico de Euler.
- **EvaluarF.java:** evalúa la función diferencial f(x,y) = x - y.

## Requisitos

- Java JDK instalado.
- IDE compatible con Java o terminal.
- Git instalado para clonar el repositorio.

## Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

Entrar en la carpeta del proyecto:

```bash
cd MetodoEuler
```

## Compilación

Desde la carpeta raíz del proyecto, ejecutar:

```bash
javac MetodoEuler/*.java
```

## Ejecución

```bash
java MetodoEuler.Main
```

## Modificación del tamaño de paso

Para experimentar con diferentes tamaños de paso, modificar la variable `h` dentro de `Main.java`.

Valores solicitados:

- h = 0.1
- h = 0.05
- h = 0.01

Cada ejecución permitirá observar cómo cambia la aproximación numérica y el error absoluto.

## Datos

Camila amor del angel cervantes 

Métodos Numéricos

Víctor Hugo Vásquez Herrera 
