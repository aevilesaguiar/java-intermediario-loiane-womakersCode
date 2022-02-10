## String: Construtores

Quando usamos o operador new é criado uma referencia de memória e essa referencia de memoria pode apontar para um objeto java, no caso da string ele vai alocar espaço na memoria suficiente para guradar os caracteres;

Quando fazemos atribuição simples , existe uma especie de pool , um lugar especial onde são criadas as strings atraves de atribuição simples. Verifica se existe no pool? se sim então usa a mesma referencia, senão aloca numa referencia diferente.
