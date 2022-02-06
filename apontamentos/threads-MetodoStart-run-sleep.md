## Threads

- Multitarefas: processos e threads

**Processo: é como se fosse um programa sendo executado**

**Thread: é a menor unidade de código que pode ser executada**

Dentro de um programa podemos ter várias threads, ou seja permite ao programa executar 2 ou mais tarefas ao mesmo tempo.

Exemplo: editor de testo pode formatar um texto( ao clicar em um botão), e ao mesmo tempo pode enviar o texto para impressão

Vantagens de usar Threads:

- PROGRAMAS MAIS EFICIENTES

## Ciclos de vidas das Threads (tarefas)

![image](https://user-images.githubusercontent.com/52088444/152663235-50aa4b29-4627-41eb-b622-305ed8751884.png)

- Existem 5 estados importantes

## Criando uma Thread

- Extender a classe Thread ( do pacote java.lang)
![image](https://user-images.githubusercontent.com/52088444/152663320-6c503131-f207-48d6-b363-d63e6ae1def5.png)

- Implementar interface Runnable

## 3 métodos importantes de uma thread

- start(inicia a thread para execução): inicia o método run;
- run(deixa a thread em execução): executa a tarefa da thread;
- sleep(coloca a thread para dormir por algum tempo): coloca a thread para dormir po X milisegundos;

## Qual abordagem é melhor?

- Quando fazemos extends da Thread , o único método que precisa ser sobreposto é o run;
- Quando implementamos Runnable, também precisamos implementar o método run;
- Com a classe Runnable , podemos extender qualquer outra classe;
- Se não for sobrepor qualquer outro método da classe Thread , pode ser melhor usar a classe Runnable.
