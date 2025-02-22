![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> input2[\ Digite sua frequência \]
        input2 --> verification{ Nota >= 50? \n E \n Frequência >= 75% }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> n1[\ Digite o número 1\]
      n1 --> n2[\ Digite o número 2 \]
      n2 --> soma[ Soma = n1+n2 ]
      soma --> resultado[/ Resultado /]
      resultado --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite um número \]
        input --> verification{ Número é >= 0? }
        verification --> |Sim| A[/ Positivo /]
        verification --> |Não| B[/ Negativo /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite sua idade \]
        input --> input2[\ Digite se possui título de eleitor\]
        input2 --> verification{ Idade >= 16? \n e \n título de eleitor = Sim }
        verification --> |Sim| A[/ Pode votar /]
        verification --> |Não| B[/ Não pode votar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> n1[\ Digite o número 1\]
      n1 --> n2[\ Digite o número 2 \]
      n2 --> maior{ n1 > n2? }
      maior --> |Sim| A[/ n1 é o maior número /]
      maior --> |Não| maior2{ n2> n1 }
      maior2 --> |Sim| B[/ n2 é o maior número /]
      maior2 --> |Não| C[/ n1 e n2 são iguais /]
      A --> finish([ Fim ])
      B --> finish
      C --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> n1[\ Digite o número 1\]
      n1 --> n2[\ Digite o número 2 \]
      n2 --> n3[\ Digite o número 3\]
      n3 --> maior{ n1 > n2 \n e \n n1 > n3 }
      maior --> |Sim| A[/ n1 é o maior número /]
      maior --> |Não| maior2{ n2 > n1 \n e \n n2 > n3 }
      maior2 --> |Sim| B[/ n2 é o maior número/]
      maior2 --> |Não| maior3{ n3 > n1 \n e \n n3 > n2 }
      maior3 --> |Sim| C[/ n3 é o maior número /]
      maior3 --> |Não| igual{ n1 = n2}
      igual --> |Sim| D[/ O primeiro e o segundo número são iguais/]
      igual --> |Não| igual2{ n1 = n3}
      igual2 --> |Sim| E[/ O primeiro e o terceiro número são iguais/]
      igual2 --> |Não| igual3{ n2 = n3}
      igual3 --> |Sim| F[/ O segundo e o terceiro número são iguais/]
      igual3 --> |Não| G[/ Todos os números são iguais/]
      A --> finish([ Fim ])
      B --> finish
      C --> finish
      D --> finish
      E --> finish
      F --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> n1[\ Digite o número 1\]
      n1 --> fatorial[ fatorial = n1! ]
      fatorial --> resultado[/ Resultado /]
      resultado --> finish([ Fim ])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
        start(( Início )) --> input[\ Digite o número \]
        input --> verification{ n % 2 = 2? }
        verification --> |Sim| A[/ o número é par /]
        verification --> |Não| B[/ o número é ímpar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> n[\ Digite o número \]
      n --> verification{ n % 2 = 0 \n E n % 3 = 0 \n E n % 5 = 0? }
      verification --> |Sim| A[/ o número é primo /]
      verification --> |Não| B[/ o número não é primo /]
      A --> finish([ Fim ])
      B --> finish
   ```