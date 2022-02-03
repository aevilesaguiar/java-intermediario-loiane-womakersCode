# enums

- Com enums podemos ter metodos, atributos, construtores e metodos abstratos(pode ser atarves de uma interface ou declarar dentro do proprio enum);
- Enums extends a classe java.lang.Enum
- Podem ser comparados usando ==
- Quando comparamos classes não usamos o operador igual do java (==) e sim equal
- Não podem ser ser instanciadas com new (um exemplo quando passamos SEGUNDA(1) já estamos ichamando o construtor do enum )
- Podem implementar interfaces 
- Não existe herança dentro de enum
- Podem ser declarado separadamente ou dentro de classe
- Não precisamos declarar nenhum modificador de acesso, por que o enum já possui internamente


## values()

O método values ele retorna um array de todos os valores que estãod entro dos enumerados


## valuesof()

Obter os valores de um enum através de uma string
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

