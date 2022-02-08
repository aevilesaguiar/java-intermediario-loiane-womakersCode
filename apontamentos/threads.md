## Threads

Como um tópico pode saber quando o outro terminou? Thread fornece um meio pelo qual você pode responder a essa pergunta. O multi-threading Java oferece duas maneiras de descobrir que

- **isAlive()**: Testa se este segmento está ativo. Um encadeamento está ativo se foi iniciado e ainda não terminou. Há um período de transição de quando um segmento está em execução até quando um segmento não está em execução. Após o retorno do método run(), há um curto período de tempo antes que o encadeamento pare. Se quisermos saber se o método de início da thread foi chamado ou se a thread foi encerrada, devemos usar o método isAlive(). Este método é usado para descobrir se um encadeamento foi realmente iniciado e ainda não foi encerrado;

- **join()**: Quando o método join() é chamado, o thread atual simplesmente espera até que o thread com o qual está se juntando não esteja mais ativo.
Ou podemos dizer que o método que você usará mais comumente para esperar que um thread termine é chamado join(). Este método espera até que o encadeamento no qual é chamado termine. Seu nome vem do conceito de thread de chamada, aguardando até que o thread especificado se junte a ele. Formas adicionais de join() permitem que você especifique um período máximo de tempo que deseja aguardar até que o encadeamento especificado termine.

## MÉTODO setPriority(), para definir as prioridades de cada thread

## Sincronização é o ato de coordenar as atividades de 2 ou mais threads

Motivo: quando 2 ou mais threads precisam acessar um recurso compartilhado , ou somente I thread pode acessar o recurso por vez.

No Java usamos a palavra chave synchronized em métodos(assinatura) ou em um bloco de códigos.


## Métodos notity, wait e notifyAll

O revezamento entre as Threads é feito pelos os métodos:

- Wait(espera): bloqueia a execução da Thread temporariamente, ou seja, coloca a thread em modo de espera; 
**A thread fica em mode de espera até que seja notificada**
E para fazer a notificação nós temos dois métodos:

- notify: notifica uma thread que estava esperando, ou seja, retorna a execução da thread;

**ou então caso existe mais de uma thread usaremos o método**
- notifyAll: notifica todas as threads, que aquele objeto em questão está disponível,e a thread que tem maior prioridade ganha acesso ao objeto.

## Threads : suspend, resume e stop (removidos após o java2)

- O método suspend foi substituido por causas problemas de deadlock
- O suspend também foi removido pois não funciona sem o suspende
- o método stop foi substituido pelo o método interrupt.

- Suspend: suspende  temporariamente a execução da Thread;
- Resume: resume a execução da Thread;
-Stop: termina a execução da Thread;


## Deadlock

Deadlock descreve uma situação em que dois ou mais threads são bloqueados para sempre, esperando um pelo outro.


Deadlock é a dependência cíclica que acontece entre duas ou mais threads compartilhando dois ou mais recursos (variável, bloco de código etc.). Em outras palavras, uma thread T1 depende de outra T2, sendo que esta T2depende, por sua vez, de T1.

Esse tipo de dependência acontece exclusivamente por falha na lógica pelo programador, que, desenvolve uma aplicação multithreaded , precisa se preocupar não apenas com deadlock , mas com outros conceitos relativos à programação, como starvation , livelock e race condition , sendo este último provavelmente o mais comum de acontecer.
