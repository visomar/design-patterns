Flyweight
=========

The Flyweight design pattern is a structural design pattern which is used to lighten up those objects which are instantiated multiple times, and share parameters intrinsically.  

The intrinsic atributes of an object are those that are repeated independently of the instance of the object. The extrinsic data is the data of the object itself, and it's different from each instance.  

An example of this may be the rendered trees of a forest inside a game. Every tree can share the trunk texture, the texture of its leaves and a series of data that can consume a lot of memory (intrinsic data), and it's only needed as extrinsic data (inherent data of each tree) the coordinates, the height or the diameter of the trunk, to put some examples.  

This pattern allows us to save a lot of memory in those programs in which it can be applied to objects that are instantiated a very large number of times.

Objeto ligero
=============

El patrón de diseño Objeto ligero es un patrón de diseño estructural que se utiliza para aligerar aquellos objetos que se instancian múltiples veces, y que comparten parámetros de forma intrínseca.  

Los atributos intrínsecos de un objeto son aquellos que se repiten independientemente de la instancia del objeto. Los datos extrínsecos son los datos propios de cada objeto, y que difieren entre las distintas instancias.  

Un ejemplo de esto pueden ser los árboles renderizados de un bosque en un videojuego. Todos los árboles pueden compartir la textura del tronco, la textura de las hojas, y una serie de datos que pueden consumir mucha memoria (datos intrínsecos), y simplemente son necesarios como datos extrínsecos (datos propios de cada árbol) las coordenadas, la altura o el diámetro del tronco, por poner unos ejemplos.  

Este patrón nos permite ahorrar mucha memoria en aquellos programas en los que se puede aplicar a objetos que se instancian una cantidad muy grande de veces.
