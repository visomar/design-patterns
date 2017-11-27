Singleton
=========

The Singleton pattern lets you access the same instance of **one** object throughout the entire virtual machine.  
This pattern is not the simplest one, but it is the easiest to implement. It's commonly used when you have resources shared or accessed in different points of your application, and you **need** them to be the same instance, thus restricting the creation of more than one object.  

Three simple steps to make a singleton pattern:  
  * Private constructor, always.
  * One private member which type is the same as the singleton class. This will be the unique "instance".
  * One public method to access the instance of the class.  

**Note**: Don't make the mistake of confusing this pattern with the Factory pattern. If your *getInstance* method has parameters, or if it hasn't but doesn't behave as explained, your goal probably is using something different from a Singleton.    


Singleton (Instancia única)
===========================

El patrón Singleton te permite acceder a la misma instancia de **un** objeto a través de toda la máquina virtual.  
Este patrón no es el más simple, pero sí que es el más fácil de implementar. Se usa comúnmente cuando tienes recursos compartidos o accedidos en diferentes puntos de tu aplicación, y **necesitas** que sean siempre la misma instancia, de ahí que se restrinja la creación de más de un objeto.  

Tres sencillos pasos para hacer un patrón singleton:  
  * Constructor privado, siempre.
  * Un miembro privado (jeje) cuyo tipo sea el mismo que la clase singleton. Este será la "instancia" única.
  * Un método público para acceder a la instancia de la clase.  

**Nota**: No cometas el error de confundir este patrón con el patrón Factoría (Factory). Si tu método *getInstance* tiene parámetros, o si no los tiene pero no se comporta como se ha explicado, tu meta sea probablemente usar algo diferente a un Singleton.
