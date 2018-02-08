Builder
=======

Do you need to build objects whose creation logic (probably in its constructor) is very complex?  
Do you use a lot of parameters in the constructor method, and SonarLint is telling you that you should reduce the number of parameters to 7, and you don't know how to switch off SonarLint?  

Then stop worrying, my friend, because this is your pattern.  

With the Builder pattern, you can decouple completely the logic of creation of objects from its own class, and keep the object immutable once the construction is finished. Furthermore, the pattern offers other benefits, such as, for example, avoid telescopic constructors, or allow order switching of parameters at the moment of constructing the object.

Constructor
===========

¿Necesitas crear objectos cuya lógica de creación (probablemente en su constructor) sea muy compleja?  
¿Gastas muchos parámetros en el método constructor y SonarLint te está diciendo que no gastes más de 7, y no sabes como desactivar SonarLint?  

Pues deja de preocuparte, amigo, porque este es tu patrón.  

Con el patrón constructor, puedes desacoplar completamente la lógica de creación de objetos de su propia clase, y mantener la inmutabilidad del objeto tras la construcción. Además, el patrón ofrece otros beneficios, como, por ejemplo, evitar los constructores telescópicos, o poder variar el orden de los parámetros en el momento de construir o instanciar el objeto.
