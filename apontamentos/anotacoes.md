## Anotations 

Foram introduzidas a partir do Java5, as anotações são metadados mas nós chamamos de anotações ou
anotations , ou seja é um recurso que permite embutir informações complementares no código fonte.
Essas anotações podem ser consumidas de tremaneiras pelo o código fonte.
- Informações para o compilador;
- Runtime(passar informações em tempo de execução);
- Compile ou Deploy-time( tempo de compilação ou deploy-web) . (O código fonte pode utilizar essas informações, esses metadados para compilar o código fonte ou então  na hora de fazer o deploy. O deploy já é a parte de java web, onde se gera o pacote da aplicação que seria um arquivo .war no desktop agente gera o .jar e no web é .war, e atraves dessas anotações o container, ou seja o servidor de aplicações vai conseguir ler essas informações e vai conseguir configura a aplicação corretamente  )

**As anotations aparecem precedidas de um arroba @ **

Ex: @Override, @Inherited, @Deprecated, @SupressWarnings

*Nós podemos criar as nossas próprias anotações*