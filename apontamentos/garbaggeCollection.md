## Garbage Colection(Coletor de Lixo)

## O que é Coleta Automática de Lixo?
A coleta de lixo automática é o processo de examinar a memória heap, identificar quais objetos estão em uso e quais não estão e excluir os objetos não utilizados. Um objeto em uso, ou um objeto referenciado, significa que alguma parte do seu programa ainda mantém um ponteiro para esse objeto. Um objeto não utilizado, ou objeto não referenciado, não é mais referenciado por nenhuma parte do seu programa. Assim, a memória usada por um objeto não referenciado pode ser recuperada.

Em uma linguagem de programação como C, alocar e desalocar memória é um processo manual. Em Java, o processo de desalocação de memória é tratado automaticamente pelo coletor de lixo. O processo básico pode ser descrito como segue.


**O garbagge collection é realizado de tempos em tempos e é gerenciado pela JVM**
