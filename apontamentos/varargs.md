## Varargs

Varargs nos ajuda a evitar escrever código clichê introduzindo a nova sintaxe que pode lidar com um número arbitrário de parâmetros automaticamente – usando um array

Podemos defini-los usando uma declaração de tipo padrão, seguida por reticências:

public String formatWithVarArgs(String... values) {
    // ...
}

**Varargs são fáceis de usar. Mas existem algumas regras que devemos ter em mente:**

Cada método pode ter apenas um parâmetro varargs
O argumento varargs deve ser o último parâmetro

O uso de varargs pode levar à chamada Poluição de Heap .

Toda vez que usamos varargs , o compilador Java cria um array para armazenar os parâmetros fornecidos. Nesse caso, o compilador cria uma matriz com componentes de tipo genérico para conter os argumentos.
Quando usamos varargs com tipos genéricos, pois há um risco potencial de uma exceção fatal em tempo de execução, o compilador Java nos avisa sobre um possível uso inseguro de varargs :
warning: [varargs] Possible heap pollution from parameterized vararg type T
O uso de varargs é seguro se e somente se:

Não armazenamos nada no array criado implicitamente. Neste exemplo, armazenamos um  List<Integer>  nesse array
Não deixamos uma referência ao array gerado escapar do método (mais sobre isso depois)

Simplificando, o uso de varargs é seguro se os usarmos para transferir um número variável de argumentos do chamador para o método e nada mais!

## Referencias

https://www.baeldung.com/java-varargs