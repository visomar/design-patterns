Command
=======

This pattern defines an operation on an object in the form of another object instead of belonging to it as another method.  
It's quite difficult to understand given that, traditionally, in OOP languages, by design, an object or class is a sustantive, whereas any of its methods are the actions, or verbs, that sustantive allows. With the Command pattern this approach changes slightly, but it has certain benefits or perks that make its application worth the design deviation.  

Some of those benefits are:  
  * The request objects allow a better management (queues, history, rollbacks, etc.)
  * Can have callback functionality
  * Actions and objects are decoupled, and that improves maintenance  

Actually, the way you identify a place where you can use this pattern is when you need something extra to do with the methods like queuing, undoing, and so on.

The entities that participate in this pattern are the following:  
  * The command interface, Command
  * The implementation(s) of the command itself, ConcreteCommand
  * The object on which the action is applied, Receiver
  * The object that invokes the action, Invoker

**Note**: A common problem is code or logic duplicated inside the Receiver and the ConcreteCommands. This is what this pattern is for, so be careful with this.  


Orden
=====

Este patrón define una operación sobre un objeto en forma de otro objeto en lugar de formar parte del primero como un método más.  
Es algo complicado de entender dado que tradicionalmente, en el paradigma de programación orientada a objetos se entiende por diseño que un objeto o clase es un sustantivo, mientras que cualquiera de sus métodos son las acciones, o verbos, que permite ese sustantivo. Con el patrón Orden este planteamiento cambia ligeramente, pero tiene ciertos beneficios que hacen que su utilidad compense el desvío de diseño.  

Algunos de estos beneficios son:  
  * Los objetos de las peticiones permiten una mejor gestión (colas, histórico, rollbacks, etc.)
  * Se puede incluir funcionalidad de callback
  * Las acciones sobre el objeto y los propios objetos están desacoplados, lo que mejora las tareas de mantenimiento  

De hecho, una manera de identificar el sitio donde puedes usar este patrón es cuando necesitas hacer algo extra con los métodos, como encolar, deshacer, etcétera.s

Las entidades que participan en este patrón son las siguientes:  
  * La interfaz de orden, Command
  * La implementación o implementaciones de las órdenes, ConcreteCommand
  * El objeto sobre el que se aplica la acción, Receiver
  * El objeto que invoca la acción, Invoker

**Nota**: Un problema común es encontrar piezas de código o lógica duplicada dentro del Receptor y de la implementación de la orden. Esto es lo que soluciona este patrón, por lo que debes ir con cuidado.
