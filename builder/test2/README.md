Inherited builders
==================

I've wanted to include this example as part as the list of examples I'm including in this repository because I ran into this problem not so long ago, and I think I can use it again in the future, and maybe someone can be interested in it aswell.
As it is written, you could implement it using the Factory Method pattern, but instead, think of this problem as it satisfies the problematic of having a lot of attributes, or maybe having a very complex logic of object creation, and you'll see that this solution simplifies the work to be done.  

The problem is this one: I need to create objects that inherit a big amount of parameters from another parent object, but each one of them has a special attribute which is not shared with the rest of objects.  

Being unable to inherit the static class included in the parent class, the subclasses need to include a Builder in each one of them, and this would replicate a lot of code needlessly, specially if the majority of attributes are included in the parent class.  

With this solution we can extend the Builder class included in the parent class, and keep the whole functionality of the pattern inside each subclass.  

Constructores heredados
=======================

He querido incluir este ejemplo como parte de la lista de ejemplos que estoy poniendo en este repositorio, ya que me topé con esta problemática hace poco, y creo que puede servirme otra vez en el futuro, y a todo aquel que le pueda interesar.
Tal y como está expresado, podría perfectamente construirse con un patrón de Método de Factoría, pero imaginad que cumple las características de tener muchos atributos, o quizá una lógica de creación de objetos compleja, y veréis que de esta manera se simplifica mucho el trabajo de creación de objetos.  

La situación es la siguiente: Necesito crear objetos que heredan una gran cantidad de parámetros de un objeto padre, pero cada uno de ellos tiene alguna característica especial, que no comparte con el resto.  

Como es imposible heredar la clase estática incluida en la clase padre, es necesario crear un Constructor en cada subclase, y claro, esto replicaría mucho código de forma innecesaria, sobretodo si la gran mayoría de atributos están recogidos en la clase padre.  

Con esta solución podemos ir extendiendo la clase Constructor incluida en la clase padre, y seguir obteniendo toda la funcionalidad del patrón en cada subclase.
