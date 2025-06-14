# INF01121-Trabalho-Final

<!-- TOC -->
- [INF01121-Trabalho-Final](#inf01121-trabalho-final)
  - [3 DETALHAMENTO DA LINGUAGEM](#3-detalhamento-da-linguagem)
    - [3.1 Paradigma de Orientação a Objetos em Java](#31-paradigma-de-orientação-a-objetos-em-java)
      - [3.1.1 Definição de classes](#311-definição-de-classes)
      - [3.1.2 Herança](#312-herança)
      - [3.1.3 Encapsulamento](#313-encapsulamento)
    - [3.2 Paradigma Funcional em Java](#32-paradigma-funcional-em-java)
      - [3.2.1 As interfaces funcionais em Java](#321-as-interfaces-funcionais-em-java)
      - [3.2.2 Funções de Alta Ordem](#322-funções-de-alta-ordem)
      - [3.2.3 Records](#323-records)
      - [3.2.4 Pattern Matching](#324-pattern-matching)
      - [3.2.5 Comparação e Performance de Métodos Funcionais em Java contra Métodos Clássicos](#325-comparação-e-performance-de-métodos-funcionais-em-java-contra-métodos-clássicos)
  - [X Referencias](#x-referencias)
<!-- TOC -->

## 3 DETALHAMENTO DA LINGUAGEM
### 3.1 Paradigma de Orientação a Objetos em Java

A linguagem Java é um dos exemplos clássicos de linguagens orientadas a objetos, sendo o principal paradigma da linguagem. Portanto, a linguagem é baseada nos 4 pilares da orientação a objetos, são eles, abstração, encapsulamento, herança e polimorfismo.

Abstração é o processo de esconder os detalhes da implementação, expondo somente a funcionalidade para o usuário. Encapsulamento é o processo de agrupar código e dados em uma única unidade (classe). Herança é o processo de onde uma classe herda os atributos e métodos de outra classe. Polimorfismo é a habilidade de um método executar coisas diferentes dependendo do contexto em que for chamado.
 
#### 3.1.1 Definição de classes

Uma classe é um molde para criar objetos. Ela define as características (atributos) e os comportamentos (métodos) que os objetos dessa classe terão.

Para declarar uma classe em Java é necessário usar a palavra reservada *class* seguido do nome da classe. Dentro de uma
classe é possível declarar os seus métodos e atributos. Por exemplo:

```java
package ClassExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileDataReader {

    public final Path filePath;

    public FileDataReader(String filePath) { // Construtor
        this.filePath = Paths.get(filePath);
    }

    public String readFileAsString() throws IOException {
        return Files.readString(filePath);
    }

    public List<String> readFileAsLines() throws IOException {
        return Files.readAllLines(filePath);
    }

    public boolean fileExists() {
        return Files.exists(filePath);
    }

    public long getFileSize() throws IOException {
        return Files.size(filePath);
    }
}
```

Para instanciar uma classe, primeiro é necessário implementar um construtor para a classe. Depois, usa-se o padrão `new NomeDaClasse()`, e, para acessar seus métodos e atributos usa-se,
respectivamente, `nomeDaInstancia.metodo()` e `nomeDaInstancia.atributo`. Por exemplo:

Além de atributos e métodos, também podemos declarar outras classes dentro de uma classe.

Essas classes, podem ser estáticas se declaradas com a palavra reservada `static`, além de permitirem modificadores 
de acesso na sua declaração.

É possível também, declarar classes abstratas, fazendo uso do modificador `abstract`. Classes declaradas desse modo, 
não podem ser instanciadas, mas ainda podem ser herdadas.

Nos métodos da classe, para referenciar a instância atual da classe (permitindo acessar os seus atributos), usa-se a palavra
reservada `this`.

```java
import ClassExample.FileDataReader;
class Main{
    public static void main(String[] args) {
        FileDataReader fileDataReader = new FileDataReader("D:/arquivos/contadeluz.pdf"); // Instanciação da classe FileDataReader
        fileDataReader.fileExists(); // Chamada do método fileExists
        fileDataReader.filePath; // Acesso ao atributo filePath
    }
}
```

#### 3.1.2 Herança
Em Java, existem dois casos onde herança acontece, o caso onde uma classe herda outra e caso onde uma classe
implementa uma interface.

Uma classe herda outra usando a palavra reservada *extends*, desse modo, também recebe os mesmo atributos e 
métodos da classe pai.

> Considera-se como classe filha a classe que herdou de outra e como classe pai a classe do qual foram herdados os 
> métodos e atributos

Para implementar uma interface, usa-se a palavra reservada `implements`. Uma interface é de certa forma semelhante
à uma classe abstrata, porém, todos seus membros são públicos, além disso as variáveis de interfaces também são finais (constantes).

A linguagem não permite herança múltipla, ou seja, uma classe herdar de duas ou mais classes. Porém
uma classe pode implementar quantas interfaces quiser.

Abaixo pode-se observar um exemplo de herança:
```java
package InheritanceExample;

public class ClassePai {
    int atributoClassePai;

    public ClassePai(int atributoClassePai){
        this.atributoClassePai = atributoClassePai;
    }
}
```
```java
package InheritanceExample;

public interface ExemploInterface {
    void escreveMensagem(String mensagem);
}
```
```java
package InheritanceExample;

public class ClasseFilha extends ClassePai implements ExemploInterface{
    int atributoClasseFilha;

    public ClasseFilha(int atributoClassePai) {
        super(atributoClassePai);
    }

    public void testarAcesso(){
        String mensagem = "Atributo da classe filha = " + atributoClasseFilha + "\n Atributo da classe pai = " + atributoClassePai;
    }

    @Override
    public void escreveMensagem(String mensagem) {

        System.out.println(mensagem);
    }
}
```


#### 3.1.3 Encapsulamento

Em Java, o controle do encapsulamento de métodos, classes e atributos é feito usando modificadores de acesso.

`public`: Acessível de qualquer lugar.  
`protected`: Acessível dentro da própria classe, classes do mesmo pacote e subclasses.  
`private`: Acessível apenas dentro da própria classe.  
`default (nenhum modificador)`: Acessível apenas dentro do mesmo pacote.  

### 3.2 Paradigma Funcional em Java

Desde o Java 8, a linguagem começou a suportar construções e desenvolvimentos funcionais através de novas interfaces e objetos entregues pela própria linguagem. Em Java, Funções se tornam Objetos e por sua vez elementos de primeira ordem na linguagem. A seguir, iremos explorar o que estas construções fornecem e como podemos aproveita-las para criar códigos sucintos e fluentes.

#### 3.2.1 As interfaces funcionais em Java

Sendo uma linguagem puramente orientada a objetos em sua concepção, Java não foi formulada com suporte nativo a programação funcional. Porém, com a evolução do mercado e da própria linguagem, o suporte a construções funcionais foi adicionado, tornando-se um método muito prático, principalmente para o consumo de coleções de objetos. Em Java, o pacote java.util.function é o responsável por fornecer as interfaces e objetos relacionados a construções funcionais. Java fornece interfaces para funções de diferentes aridades e métodos; abaixo, veremos alguns exemplos.

Primeiramente, temos a interface Function<T,R>, que permite a implementação de funções de aridade 1, com um único argumento (T) e um único retorno (R). Através do uso de Generics, a interface é polimórfica e permite que tanto implementações quanto consumidores desta interface definam quais tipos são aceitos. Além disso, Java fornece uma extensão natural desta interface, a BiFunction<T, U, R>, que aceita dois argumentos e produz um resultado. Para um número maior de argumentos, o desenvolvedor deve definir suas próprias interfaces.

Java ainda fornece algumas especializações de Function:

- `Predicate<T>`: Uma função do tipo Function<T, Boolean>, permitindo que haja uma interface unificada para testes e validações em cima de argumentos.

- `Consumer<T>`: Uma função do tipo Function<T, void>, representando uma operação terminal que consome um argumento e não possui retorno.

- `Supplier<R>`: Uma função do tipo Function<void, R>, representando uma função que gera ou fornece resultados sem necessitar de nenhuma entrada.

Estas definições não só ajudam desenvolvedores a adicionarem mais intenção e controle sobre seus designs, mas também permitem à linguagem fornecer componentes reutilizáveis, segregando o tipo de função que um método aceita utilizando os próprios recursos da orientação a objetos para validar as interfaces.

Usuários podem também declarar funções anônimas (lambdas) e armazená-las em variáveis, podendo ser passadas entre métodos e armazenadas em objetos, como veremos na seção 3.2.5.

É importante notar que, em Java 8, também foi introduzida a classe Optional<T>, permitindo que usuários evitem o uso de null em seu código. Optional é um contêiner que pode ou não conter um valor não nulo. Esta interface força o desenvolvedor a tratar o caso em que um valor não existe e permite envelopar o retorno de métodos para sinalizar explicitamente a possibilidade de ausência de resultado.

#### 3.2.2 Funções de Alta Ordem

Juntamente com o suporte a interfaces funcionais, o Java 8 introduziu a interface Stream e, com ela, diversas funções de alta ordem familiares a usuários de linguagens funcionais. A interface Stream representa uma sequência de elementos que suporta operações de agregação sequenciais e paralelas. Ela não é uma estrutura de dados, mas sim uma abstração que avalia os dados de maneira lazy (preguiçosa), processando os elementos sob demanda.

Para exemplificar seu uso, veremos o exemplo abaixo, que filtra uma lista de números para manter apenas os pares e, em seguida, calcula o quadrado de cada um. Primeiro, sem o uso de streams:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
List<Integer> quadradosPares = new ArrayList<>();
for (Integer numero : numeros) {
    if (numero % 2 == 0) {
        quadradosPares.add(numero * numero);
    }
}
```

E agora o mesmo exemplo, com o uso de streams:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
List<Integer> quadradosPares = numeros.stream()
    .filter(n -> n % 2 == 0) // Predicate para filtrar os pares
    .map(n -> n * n)         // Function para elevar ao quadrado
    .collect(Collectors.toList()); // Operação terminal para coletar os resultados
```

Podemos ver que não apenas o código se tornou mais sucinto e declarativo, como, caso queiramos executar nosso código de forma paralela, podemos simplesmente trocar a chamada de stream() para parallelStream() e a linguagem irá cuidar da orquestração das threads.

É importante notar que streams são lazy. Nenhuma computação nas operações intermediárias (filter, map) é executada até que uma operação terminal, como collect ou forEach, seja invocada.

Algumas das funções que podemos usar em streams são:

- `map`: Transforma cada elemento do stream em outro objeto, aplicando uma Function.
- `filter`: Filtra os elementos do stream, mantendo apenas aqueles que passam em um teste Predicate.
- `sorted`: Ordena os elementos do stream. Pode usar a ordem natural ou um Comparator customizado.
- `flatMap`: Transforma cada elemento em um stream de outros objetos e, em seguida, "achata" todos esses streams em um único stream. Útil para lidar com listas aninhadas.
- `collect`: Operação terminal que transforma o stream em uma estrutura de dados, como List ou Map.
- `findAny` e `findFirst`: Operações terminais que retornam um Optional contendo o primeiro elemento que encontram. findAny é mais performático em streams paralelos.
- `anyMatch`: Operação terminal que retorna true se ao menos um elemento do stream corresponder ao Predicate fornecido.

Como podemos ver, streams são uma ferramenta fundamental para a programação em Java moderno, trazendo benefícios como:

- Legibilidade e Redigibilidade: Foca no "o que" fazer, e não no "como" fazer.
- Processamento lazy: Operações são executadas apenas quando necessário, otimizando a performance.
- Facilidade de paralelização: Permite processar grandes volumes de dados em hardware multi-core com uma simples mudança de método.
- Composição de funções: Cria um pipeline de operações fluente e expressivo.

#### 3.2.3 Records

Introduzidos como um recurso de preview no Java 14 e finalizados no Java 16, os Records permitem criar classes imutáveis para armazenamento de dados de maneira idiomática, reduzindo o código repetitivo (boilerplate) e adicionando agilidade ao desenvolvimento.

Podemos comparar uma estrutura de dados simples em Java, Empregado, implementada como uma class e como um record:

```java
// Implementação com uma classe tradicional
public final class EmpregadoClass {
    private final String nome;
    private final double salario;

    public EmpregadoClass(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }

    @Override
    public boolean equals(Object obj) { /*...código de equals...*/ }
    @Override
    public int hashCode() { /*...código de hashCode...*/ }
    @Override
    public String toString() { /*...código de toString...*/ }
}

// Implementação com record
public record EmpregadoRecord(String nome, double salario) {}
```

Com uma única linha, o record gera automaticamente um construtor canônico, métodos de acesso (ex: nome(), salario()), e implementações para equals(), hashCode() e toString().

Os principais benefícios de Record são:

- Concissão: Reduz drasticamente a quantidade de código necessário para criar classes de dados.
- Imutabilidade implícita: Os campos de um record são `final` por padrão, promovendo um design mais seguro.
- Clareza de intenção: Ao usar um record, fica explícito que o propósito da classe é apenas carregar dados.

Seus usos mais comuns são como Data Transfer Objects (DTOs), para representar retornos de APIs, ou em qualquer situação onde um agregado de dados imutável é necessário.

#### 3.2.4 Pattern Matching

O Pattern Matching foi introduzido gradualmente em Java, começando com o instanceof no Java 16 e sendo aprimorado para switch expressions em versões posteriores, com grandes melhorias no Java 21. Ele pode ser usado em conjunto com records para desestruturar objetos de forma rápida e segura.

O exemplo a seguir demonstra como o Pattern Matching para switch simplifica a verificação de tipos e a extração de dados:

```java
public record Gerente(String nome, List<String> equipe) {}
public record Desenvolvedor(String nome, String linguagem) {}

// Método que usa pattern matching no switch (Java 21+)
public static String getDetalhes(Object empregado) {
    return switch (empregado) {
        // Desestrutura o Gerente e extrai o nome e o tamanho da equipe
        case Gerente g -> String.format("%s lidera %d pessoas.", g.nome(), g.equipe().size());
        
        // Desestrutura o Desenvolvedor e extrai a linguagem
        case Desenvolvedor d -> String.format("%s programa em %s.", d.nome(), d.linguagem());
        
        // Cláusula para tratar o caso nulo de forma segura
        case null -> "Empregado não informado.";
        
        // Cláusula padrão
        default -> "Tipo de empregado desconhecido.";
    };
}
```

Este código é mais seguro e legível do que uma cadeia de if-else com instanceof e casts manuais, pois o compilador pode verificar se todos os casos foram cobertos.

#### 3.2.5 Comparação e Performance de Métodos Funcionais em Java contra Métodos Clássicos

Agora, iremos unir tudo o que vimos na seção 3.2 e comparar um exemplo simples em Java clássico e em Java moderno. Dada uma lista de objetos do tipo Empregado, queremos filtrar apenas os desenvolvedores que programam em "Java" e calcular a soma de seus salários.

```java
public record Empregado(String nome, double salario, String cargo, String linguagem) {}

List<Empregado> empregados = Arrays.asList(
    new Empregado("Ana", 7000, "Desenvolvedor", "Java"),
    new Empregado("Bruno", 8500, "Gerente", ""),
    new Empregado("Carlos", 6500, "Desenvolvedor", "Python"),
    new Empregado("Daniela", 9000, "Desenvolvedor", "Java")
);

// --- Abordagem Clássica ---
double somaSalariosClassico = 0;
for (Empregado emp : empregados) {
    if ("Desenvolvedor".equals(emp.cargo()) && "Java".equals(emp.linguagem())) {
        somaSalariosClassico += emp.salario();
    }
}

// --- Abordagem Funcional ---
double somaSalariosModerno = empregados.stream()
    .filter(emp -> "Desenvolvedor".equals(emp.cargo()))
    .filter(emp -> "Java".equals(emp.linguagem()))
    .mapToDouble(Empregado::salario) // Usa uma função de alta ordem
    .sum(); // Operação terminal de soma
```

Em termos de performance, para coleções pequenas e operações sequenciais simples, o laço for clássico pode ser marginalmente mais rápido por ter menos sobrecarga (overhead) de criação de objetos (streams, lambdas). No entanto, a abordagem funcional com streams oferece vantagens que geralmente superam essa pequena diferença:

- Legibilidade: O código funcional é mais expressivo e fácil de entender.
- Paralelização Simples: Com parallelStream(), a mesma lógica pode ser executada em múltiplos núcleos, oferecendo um ganho de performance massivo para grandes conjuntos de dados, algo complexo de implementar manualmente com laços for.
- Menos Erros: A abordagem declarativa e a ausência de gerenciamento manual de estado (como o acumulador somaSalariosClassico) reduzem a chance de bugs.

Portanto, a escolha pela abordagem funcional em Java moderno é, na maioria dos casos, uma decisão que favorece a qualidade, clareza e escalabilidade do código.

## X Referencias

https://www.oracle.com/br/technical-resources/articles/java/processing-streams-java-se-8.html [Vou ajustar ainda]
https://docs.oracle.com/en/java/javase/22/language/record-patterns.html
https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
https://www.baeldung.com/java-streams-vs-loops
https://openjdk.org/jeps/395
https://openjdk.org/jeps/441