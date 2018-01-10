Factory Method
==============

This pattern exposes a method that manages the creation of objects which implement certain interface. The client who/which launches the creation of the instance doesn't know the actual implementation nor the type of the subclass used by the object. Each subclass handles its own creation process.  
The entities that participate in this pattern are the following:  
  * The interface of the factory itself, Factory or Creator. It can be optional, since each factory will have its own methods.
  * The implementation(s) of the factory interface, ConcreteCreator
  * The interface which is given to the client to work with the created objects, Product
  * Each one of the concrete implementations of the product interface, ConcreteProduct  

The explanation can be somewhat complex, but the behavior is very easy. Imagine one of those cartoon machines: big and with a conveyor belt that goes from the inside to outside of the machine. The machine creates a dinosaur when you press a button, and the only input it needs is a selector in which you choose the type of the dinosaur: a Deinonychus, a Parasaurolophus or maybe a Stegoceras, for example. You press the button and get, via the conveyor belt, your dinosaur egg. Easy, right? Well, that's what this pattern does.  

This pattern is useful when the client which is going to use the type of object doesn't need to know the actual type of object:
  * An application that obtains a user (which can be an Admin, an Editor, a Publisher, a Guest, etc.) and prints some information about him/her.
  * A program that generates an image of certain type or extension. The type is passed as an input parameter by the user. Then the image is included in a document.
  * It's necessary to create a new zone for your theme park, and you need to fill it with concrete types of dinosaurs (vegetarian if possible!).


Método de Factoría / Fábrica de objetos
=======================================

Este patrón permite exponer un método que se encarga de crear objetos que implementan cierta interfaz. El cliente que ejecuta la creación de la instancia no conoce la implementación o el tipo de subclase que tiene el objeto. Cada subclase se encarga de su propio proceso de creación.  

Las entidades que participan en este patrón son las siguientes:  
  * La interfaz de la factoría, Factory o Creator. Puede ser opcional, ya que cada factoría tendrá sus métodos.
  * La(s) imlementación(es) de la interfaz de factoría, ConcreteCreator
  * La interfaz que se le da a conocer al cliente, y que representa los objetos creados, Product
  * Cada una de las implementaciones concretas de la interfaz de producto, ConcreteProduct  

La explicación puede ser algo compleja, pero el funcionamiento es muy sencillo. Imagina una máquina como las de los dibujos animados: grande y con una cinta transportadora que sale de ella. La máquina crea un dinosaurio con solo pulsar un botón, y el único parámetro de entrada que necesita la máquina es un selector en el que indicas si quieres que el dinosaurio que vas a obtener sea un Deinonychus, un Parasaurolophus o un Stegoceras, por ejemplo. Pulsas el botón y obtienes por la cinta transportadora tu huevo de dinosaurio. Fácil, ¿verdad?. Pues eso es lo que hace este patrón.  

Este patrón es interesante cuando el cliente que va a usar el tipo de objeto no necesita saber el tipo de objeto que está manejando:  
  * Una aplicación que obtiene un usuario (puede ser Admin, Editor, Publisher, Guest, etc.) e imprime información de este.
  * Un programa que genera una imagen de cierto tipo o extensión. El tipo se pasa como parámetro por el usuario. Después la imagen se incluye en un documento.
  * Es necesario crear una nueva zona de tu parque temático, y necesitas rellenarla con unos tipos concretos de dinosaurios (vegetarianos a ser posible!).