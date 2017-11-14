Chain of responsibility
=======================

Pretty straightforward and super easy to understand.  
You have a client, an object who/which is going to generate a request.  
You have a request, call it a package, a structure... whatever object that fits you.  
And you have handlers, entities who will handle the request **OR** will deliver it to a designated successor which can itself handle the request **OR** deliver it to a designated successor... you get the idea.  

This pattern allows (and it's a basic requirement of the pattern itself) requests to not be handled by any handler. In case you include this pattern in your code, you should be aware of this.

Cadena de responsabilidad
=========================

Bastante sencillo y super fácil de entender.  
Tienes un cliente, un objeto que va a generar una petición.  
Tienes una petición, llámalo paquete, estructura... cualquier objeto que te sirva.  
Y tienes manejadores (jo, en inglés queda mejor, eh?), entidades que manejan la petición **O** la delegan a un sucesor designado que, a su vez, manejará la petición **O** la delegará a un sucesor designado... se entiende, no?

Este patrón permite (y es un requisito básico del propio patrón) que algunas peticiones no sean manejadas por ningún manejador. En caso de que incluyas este patrón en tu código, debes tener esta consideración en cuenta.
