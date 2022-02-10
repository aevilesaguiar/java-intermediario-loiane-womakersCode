## classes-StringBuilder e StringBuffer

 Classes utilizadas para concatenas várias string ao mesmo tempo. Forma de maior performance.

Java fornece três classes para representar uma sequência de caracteres: String, StringBuffer e StringBuilder. A classe String é uma classe imutável, enquanto as classes StringBuffer e StringBuilder são mutáveis. Existem muitas diferenças entre StringBuffer e StringBuilder. A classe StringBuilder é introduzida desde o JDK 1.5.


Diferença entre string Buider e StringBuffer
- StringBuffer é sincronizado, ou seja, thread-safe. Isso significa que dois threads não podem chamar os métodos de StringBuffer simultaneamente.

- StringBuffer é menos eficiente que StringBuilder.

- StringBuilder não é sincronizado, ou seja, não é seguro para threads. Isso significa que dois threads podem chamar os métodos de StringBuilder simultaneamente.

- StringBuilder é mais eficiente que StringBuffer.