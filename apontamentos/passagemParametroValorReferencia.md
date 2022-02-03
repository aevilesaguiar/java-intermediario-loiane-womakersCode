## Passagem de Parametro por valor e por Referencia 

Para podermos entender com funciona a passagem de parâmetros em Java, vamos primeiro explorar um pouco as áreas da memória (stack e heap):

![image](https://user-images.githubusercontent.com/52088444/152445374-52049c66-57a6-448e-95ec-e72d732f0057.png)

Na área STACK ficam as variáveis locais dos métodos que pertencem a um dos 8 tipos primitivos do Java (byte, short, int, long, float, double, boolean e char) e também as referências para os objetos armazenados na área de HEAP.

Na área de HEAP ficam os objetos.

O que aconteceu é que, ao passarmos uma variável (tipo primitivo) como parâmetro para os métodos em Java, esse método recebe uma cópia do valor da variável e, da mesma forma, se passarmos um objeto como parâmetro ele recebe uma cópia do valor da referência desse objeto.

Se alterarmos o valor da variável dentro do método, como é uma cópia, não afetará seu valor externamente. No caso de objetos, ele acessa o objeto na área de HEAP por meio da cópia da referência que recebeu como argumento, que aponta para o mesmo objeto instanciado fora do método, e por isso, uma alteração feita em um objeto dentro do método alterará seu valor fora dele.

Tipos Primitivos: passagem por valor
Tipos classe, enum, array: passagem por referencia

## Referencias
http://www.igordev.com.br/2016/02/passagem-de-parametros-java.html#:~:text=Como%20j%C3%A1%20sabemos%2C%20em%20Java,em%20Java%2C%20apenas%20por%20valor.