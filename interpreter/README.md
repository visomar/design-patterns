Interpreter
===========

With this design pattern we can design and analyze (totally or partially) the grammar of a concrete language. This means that, given an input, the program should be able to analyze it, identify strings (or strings inside strings, and so on), and apply actions if that input follow the programmed rules, defining with it a specific language.  

Conceptually this pattern is, in a very summarized way, like applying a Pattern-Matching with regular expressions:
  * Some sentences are created as input
  * They are analyzed with the pattern of the regex, which defines a grammar for this language
  * For each match, an action is applied

A good example of an application of this Interpreter pattern would be a system which receives as inputs roman numbers, and the result must be their related numbers with decimal representation.
MCMXCIX -> 1999

In order to build this design pattern we need to implement the following entities:
  * An interface that represents the abstract expression, AbstractExpression
  * Concrete expressions that are definitive (and don't generate new expressions), TerminalExpression
  * Concrete expressions that are composed of more expressions (definitve and not definitve), NonTerminalExpression
  * A context that has global information for the Interpreter pattern
  * A client that builds the expression instances, and calls the actions of the Interpreter pattern

After re-reading myself I can see that I've achieved the same thing I got with the readings I had done so far, that is, not understand anything, so I recommend that you see examples of this pattern, it's much easier to understand with that.

Intérprete
==========

Con este patrón de diseño podemos diseñar y analizar (total o parcialmente) la gramática de un lenguaje concreto. Esto significa que dado un input, el programa es capaz de analizarlo, identificando cadenas (o cadenas dentro de cadenas, y así sucesivamente), y realizar acciones si este input cumple las reglas programadas, definiendo con ello un lenguaje concreto.  

Conceptualmente este patrón es, de forma muy resumida, como aplicar un Pattern-Matching con expresiones regulares:
  * Se crean sentencias o frases a modo de input
  * Se analizan con el patrón de la expresión regular, que define una gramática para este lenguaje
  * Para cada coincidencia, se aplica una acción

Un ejemplo de aplicación de patrón Intérprete sería un sistema que recibe como entrada números romanos, y el resultado deben ser sus corresponidentes números con representación decimal.
MCMXCIX -> 1999

Para este patrón de diseño tenemos que poder construir las siguientes entidades:
  * Una interfaz que sea una expresión abstracta, AbstractExpression
  * Expresiones concretas que son definitivas (y no derivan en nuevas expresiones), TerminalExpression
  * Expresiones concretas que están compuestas por más expresiones (definitivas y no definitivas), NonTerminalExpression
  * Un contexto que contiene información que es global para el patrón Intérprete
  * Un cliente que construye las instancias de las expresiones, e invoca las acciones del patrón Intérprete

Releyéndome veo que he conseguido lo mismo que con las lecturas que había hecho hasta ahora, no entender nada, por lo que te recomiendo que veas ejemplos de este patrón, se entiende mucho mejor.