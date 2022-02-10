## Metodos de String

**extraindo chars**
- charAt() -O nosso primeiro método é bem simples e consiste em retornar apenas um caractere em determinada posição de nossa String,  é o mais usado no dia a dia- TIPO DE RETORNO - char

- getChars()- Copia caracteres de uma string para uma matriz de caracteres-tipo de retorno-void

- getBytes()- Codifica esta String em uma sequência de bytes usando o charset nomeado, armazenando o resultado em uma nova matriz de bytes	-tipo de retorno-byte[]

- toCharArray()-Converte esta string em um novo array de caracteres-tipo de retorno-char[]
_______________________________________________________________________________________________________
**Métodos para fazer Comparação de Strings**

- equals()- Compara duas strings. Retorna true se as strings forem iguais e false se não	-tipo de retorno-boolean

- equalsIgnoreCase()-Compara duas strings, ignorando considerações de maiúsculas e minúsculas -tipo de retorno-	boolean

- regionMatches()-Testa se duas regiões de string são iguais-tipo de retorno-boolean

- startsWith()-Verifica se uma string começa com caracteres especificados-tipo de retorno-boolean

- endsWith() - Verifica se uma string termina com o(s) caractere(s) especificado(s)-tipo de retorno-boolean

- compareTo()-Compara duas strings lexicograficamente-tipo de retorno-int

- compareToIgnoreCase()-Compara lexicograficamente duas strings, ignorando as diferenças de maiúsculas e minúsculas-tipo de retorno-int
______________________________________________________________________________________________________
**Métodos para fazer Buscas**

- indexOf()-Retorna a posição da primeira ocorrência encontrada de caracteres especificados em uma string-tipo de retorno-int

- lastIndexOf()-Retorna a posição da última ocorrência encontrada de caracteres especificados em uma string-tipo de retorno-int

- contains()- Verifica se uma string contém uma sequência de caracteres	-tipo de retorno-boolean
______________________________________________________________________________________________________
**Métodos para modificar uma String ou extraindo parte de uma string(métodos mais usados quando estiver trabalhando com string**

- substring()-Retorna uma nova string que é a substring de uma string especificada	-tipo de retorno-String

- concat()- Acrescenta uma string ao final de outra string	-tipo de retorno-String

- replace()- Pesquisa uma string por um valor especificado e retorna uma nova string onde os valores especificados são substituídos-tipo de retorno-String

- trim()-Remove espaços em branco de ambas as extremidades de uma string-tipo de retorno-String

- replaceFirst()-Substitui a primeira ocorrência de uma substring que corresponde à expressão regular fornecida pela substituição fornecida-tipo de retorno-String

- replaceAll()-Substitui cada substring desta string que corresponde à expressão regular fornecida pela substituição fornecida-tipo de retorno-String

______________________________________________________________________________________________________
**Métodos para transformar letras maiusculas/minusculas**

- toUpperCase()-Converte uma string em letras maiúsculas-tipo de retorno-String

- toLowerCase()-Converte uma string em letras minúsculas-tipo de retorno-String
______________________________________________________________________________________________________
**Métodos para juntar ou transformar strings**

- join() - juntar a string- tipo de retorno -String[]

- split()-Divide uma string em uma matriz de substrings-tipo de retorno-String[]
______________________________________________________________________________________________________
**Métodos diversos**

-codePointAt()- Retorna o Unicode do caractere no índice especificado -tipo de retorno-int

- codePointBefore() - Retorna o Unicode do caractere antes do índice especificado-tipo de retorno-int

- codePointCount()- Retorna o número de valores Unicode encontrados em uma string -tipo de retorno-int

- contentEquals()- Verifica se uma string contém exatamente a mesma sequência de caracteres do 
CharSequence ou StringBuffer especificado-tipo de retorno-boolean

- copyValueOf() Retorna uma String que representa os caracteres do array de caracteres-tipo de retorno-String

- format()-retorna uma string formatada usando a localidade especificada, string de formato e argumentos -tipo de retorno-String

- hashCode()- Retorna o código hash de uma string-tipo de retorno-int

- intern()- Retorna a representação canônica para o objeto string	-tipo de retorno-String

- isEmpty()- Verifica se uma string está vazia ou não	-tipo de retorno-boolean

- length()-Retorna o comprimento de uma string especificada-tipo de retorno-int

- matches()- Pesquisa uma string por uma correspondência com uma expressão regular e retorna as correspondências -tipo de retorno-boolean

- offsetByCodePoints() - Retorna o índice dentro desta String que é deslocado do índice fornecido por pontos de código codePointOffset-tipo de retorno-int

- subSequence()-Devolve uma nova sequência de caracteres que é uma subsequência desta sequência	-tipo de retorno-CharSequence

- toString()- Retorna o valor de um objeto String-tipo de retorno-String

- valueOf()-Retorna a representação de string do valor especificado-tipo de retorno-String