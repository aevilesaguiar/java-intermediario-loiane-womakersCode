## Importações estáticas 

A construção de importação estática permite acesso não qualificado a membros estáticos sem herdar do tipo que contém os membros estáticos. Em vez disso, o programa importa os membros, individualmente:

importar java.lang.Math.PI estático;
ou em massa:
import estático java.lang.Math.*;

A declaração de importação estática é análoga à declaração de importação normal. Onde a declaração de importação normal importa classes de pacotes, permitindo que eles sejam usados ​​sem qualificação de pacote, a declaração de importação estática importa membros estáticos de classes, permitindo que eles sejam usados ​​sem qualificação de classe.
Então, quando você deve usar a importação estática? Com muita parcimônia! Use-o apenas quando estiver tentado a declarar cópias locais de constantes ou abusar da herança (o Antipadrão de Interface Constante). Em outras palavras, use-o quando precisar de acesso frequente a membros estáticos de uma ou duas classes. Se você usar demais o recurso de importação estática, ele poderá tornar seu programa ilegível e insustentável, poluindo seu namespace com todos os membros estáticos que você importar. Os leitores do seu código (incluindo você, alguns meses depois de escrevê-lo) não saberão de qual classe um membro estático vem. Importando tudodos membros estáticos de uma classe pode ser particularmente prejudicial à legibilidade; se você precisar de apenas um ou dois membros, importe-os individualmente. Usada apropriadamente, a importação estática pode tornar seu programa mais legível, removendo o clichê de repetição de nomes de classes.

## Referencias

https://docs.oracle.com/javase/1.5.0/docs/guide/language/static-import.html

