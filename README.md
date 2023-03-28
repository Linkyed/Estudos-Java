# Estudos Java
 Repositorio para salvar e testar concecitos mais avançados de java que estou estudando atualmente, até agora já estudei sobre Funções Lambdas e Stream API
 
## Lambdas
 As funções que estudei foi as seguintes:
 
 BinaryOperator
 UnaryOperator
 Function
 Predicate
 Consumer
 Supplier

 Entende a base de todas e percebi que em principio isso serve para criarem pequenas funções que executam tarefas pequenas mas que podem ser juntas e acabar  criando sequencias complexas. O valor disso é pq essas pequenas funções podem ser usadas em diversas partes do codigo, não se limitando a uma função complexa que  s ó sera usada uma vez.
 
 ## Stream API
 Até agora os conceitos de Stream API que estudei foram:
 
 Stream
 Map
 Filter
 MinMax
 Match
 Reduce
 Skip
 Limit
 TakeWhile

 Percebi que as stream são uma otima forma de fazer operações que com listas normais precisariam de linhas e linhas de codigo. Coisas que podem ser resolvidas com MAP ou Filter em streams, precisan de loops while ou for em listas normais para no fim resolver da mesma forma. E não só isso, streams são muito completas, e encadeando operações em cima de outras oporações podem ser realizados manipulações em uma sequencia de dados de forma extremamente mais simple doque sem as streams.

 ## Tratamento de Erro
 O que estudei de tratamento de erros até agora:

 Error
 Exception
 RuntimeException
 Finnaly

 Esse já era um topico que eu já sabia grande parte, criar exceções, lançar elas, tratar elas e etc. A unica coisa que aprendi agora é a divisão entre as Checadas e não checadas, onde as não checadas não necessariamanete precisam do tratamento de erro, ja as checadas sempre precisam ser tratadas. Isso resolve certos problemas que eu tinha de sempre ter que ficar tratando uma função, mesmo que só em um determinado ponto do codigo que ela precisava ser tratada

 ## Generics
 O que estudei de Generics até agora:

 Criação de classe Generic
 Criação de estrutura Chave/Valor usando Generic
 Criação de Metodos usando Generic

 Generics é uma otima forma de criar classes que podem servir em mais contesto e ao mesmo tempo que não precisam ficar fazendo conversões, como por exemplo a Caixa que foi o objeto que estudei, a mesma classe Caixa pode guarda diferentes tipos de conteudo (String, Integer, Double, ...) usando o Generics, que alem de permetir esse armazenamente de diferentes tipos de dado em uma classe, ainda retira a parte de transformação de valores para evitar erros.

