## Enumeradores e constantes

**constantes**
São declarados com o atributo final, ou seja que não podem ser alterados, e quando for relacionado a constante deve ser declarado com caixa alta.
Ex: public static final int SEGUNDA=1;

**ENUM**
Mais elegantes e dar um maior controle aos desenvolvedores. Eles são tratados como uma classe.
Seguem o padrão de constantes, com caixa alta.

ENum significa "Tipo enumerado". É um tipo de dados com um conjunto fixo de constantes que você define.

Vantagens do enum:

- enum melhora a segurança de tipo na verificação em tempo de compilação para evitar erros em tempo de execução.
- enum pode ser facilmente usado no switch
- enum pode ser atravessado
- enum pode ter campos, construtores e métodos
- enum pode implementar muitas interfaces, mas não pode estender nenhuma classe, porque estende internamente a classe Enum

## Nota
- enums não podem estender nenhuma classe.
- Um enum não pode ser uma superclasse.
- a ordem de aparência das constantes enum é chamada de "ordem natural" e também define a ordem usada por outros itens: compareTo, ordem de iteração dos valores, EnumSet, EnumSet.range.
- Uma enumeração pode ter construtores, estáticos e blocos de instância, variáveis ​​e métodos, mas não pode ter métodos abstratos.

