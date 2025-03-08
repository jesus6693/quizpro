
**Instrucción:** Desarrolla un programa en Java que genere la secuencia de Fibonacci hasta un límite especificado por el usuario. El programa debe:

1. Solicitar al usuario un número entero positivo como límite
2. Generar y mostrar todos los números de la secuencia de Fibonacci que sean menores o iguales al límite ingresado
3. Al final, mostrar cuántos números de la secuencia fueron generados y la suma de todos ellos

Recuerda que la secuencia de Fibonacci comienza con 0 y 1, y cada número subsiguiente es la suma de los dos anteriores (0, 1, 1, 2, 3, 5, 8, 13, 21, ...).

Ejemplo: Si el usuario ingresa 50 como límite, el programa debería mostrar: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 (10 números generados, suma: 88).

analisis
en este ejercicio se requiere de un programa el cual le solicite al usuario que ingrese un numero positivo como limite esto quiere decir que hasta ese numero se podra tener en cuenta por ejemplo limite=20 entonces esto quiere decir que los demas numeros pueden ser< o = a el limite,luego de estos los numeros que fueron ingresados iniciando en 0 y luego en 1 se iran sumando entre ellos t¿y dando el valor resultante del siguiente ejemplo 0+1=1 luego 1+1=2 1+2=3...... y asi susecivamente hasta que llegue al numero limite.

diseño
para iniciar el programa comenzamos con plublic class quiz, luego public static void main (string[]args)luego scanner imput para poder inicial como tal el programa, system.out.println() luego se debe hacer un sumador el cual inicie en 0 y 1, leugo este se ira sumando .