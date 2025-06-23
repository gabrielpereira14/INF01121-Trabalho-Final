# INF01121-Trabalho-Final

<!-- TOC -->
- [INF01121-Trabalho-Final](#inf01121-trabalho-final)
  - [2 VISÃO GERAL DA LINGUAGEM](#2-visão-geral-da-linguagem-java)
    - [2.1 Origens e inspirações](#21-origens-e-inspirações)
    - [2.2 Principais características](#22-principais-características)
    - [2.3 Funcionalidades](#23-funcionalidades)
    - [2.4 Benefícios](#24-benefícios)
    - [2.5 Principais Aplicações](#25-principais-aplicações)
  - [3 DETALHAMENTO DA LINGUAGEM](#3-detalhamento-da-linguagem)
    - [3.1 Paradigma de Orientação a Objetos em Java](#31-paradigma-de-orientação-a-objetos-em-java)
      - [3.1.1 Definição de classes](#311-definição-de-classes)
      - [3.1.2 Herança](#312-herança)
      - [3.1.3 Encapsulamento](#313-encapsulamento)
      - [3.1.4 Composição](#314-composição)
      - [3.1.5 Organização de Código em Java](#315-organização-de-código-em-java)
      - [3.1.6 Polimorfismo Ad-Hoc e Universal](#316-polimorfismo-ad-hoc-e-universal)
        - [Polimorfismo Ad-Hoc](#polimorfismo-ad-hoc)
        - [Polimorfismo Universal](#polimorfismo-universal)
    - [3.2 Paradigma Funcional em Java](#32-paradigma-funcional-em-java)
      - [3.2.1 As interfaces funcionais em Java](#321-as-interfaces-funcionais-em-java)
      - [3.2.2 Funções de Alta Ordem](#322-funções-de-alta-ordem)
      - [3.2.3 Records](#323-records)
      - [3.2.4 Pattern Matching](#324-pattern-matching)
      - [3.2.5 Comparação e Performance de Métodos Funcionais em Java contra Métodos Clássicos](#325-comparação-e-performance-de-métodos-funcionais-em-java-contra-métodos-clássicos)
      - [3.2.6 Imutabilidade](#326-imutabilidade)
  - [4 ANÁLISE CRITÍCA](#4-análise-critíca)
    - [4.1 Simplicidade](#41-simplicidade)
    - [4.2 Ortogonalidade](#42-ortogonalidade)
    - [4.3 Estruturas de Controle](#43-estruturas-de-controle)
    - [4.4 Mecanismos de definição e gerência de escopo](#44-mecanismos-de-definição-e-gerência-de-escopo)
    - [4.5 Expressividade](#45-expressividade)
    - [4.6 Mecanismos de Especificação e Verificação de Tipos](#46-mecanismos-de-especificação-e-verificação-de-tipos)
    - [4.7 Suporte ao tratamento de exceções](#47-suporte-ao-tratamento-de-exceções)
    - [4.8 Reusabilidade](#48-reusabilidade)
    - [4.9 Suporte a documentação](#49-suporte-a-documentação)
    - [4.10 Generalidade](#410-generalidade)
    - [4.11 Portabilidade, longevidade](#411-portabilidade-longevidade)
    - [4.12 Escalabilidade e desempenho](#412-escalabilidade-e-desempenho)
    - [4.13 Custo](#413-custo)
    - [4.14 Confiabilidade](#414-confiabilidade)
    - [4.15 Legibilidade](#415-legibilidade)
    - [4.16 Redigibilidade](#416-redigibilidade)
  - [5 CONCLUSÃO](#5-conclusão)
  - [6 BIBLIOGRAFIA](#6-bibliografia)
<!-- TOC -->

## 2 Visão Geral da Linguagem Java
### 2.1 Origens e inspirações 

Em 1991, um grupo de programadores da Sun Microsystems se juntou com uma missão ambiciosa: criar algo novo e que pudesse ser usado em um futuro onde os aparelhos eletrônicos das casas estariam conectados aos computadores. Esse grupo ficou conhecido como Green Team.

Naquela época, sempre que se criava um programa, era preciso fazer versões diferentes para cada sistema operacional ou tipo de máquina. Isso era trabalhoso e limitava a portabilidade dos softwares. Então, o Green Team teve uma ideia inovadora: criar uma linguagem de programação que funcionasse em qualquer lugar, sem precisar de adaptações. Eles se basearam no C++ e criaram uma nova linguagem chamada GreenTalk.

Com essa linguagem, desenvolveram um projeto chamado StarSeven — um controle remoto com tela sensível ao toque que podia se comunicar com os aparelhos da sala de estar. A linguagem evoluiu e passou a se chamar Oak. O projeto era bastante inovador, mas acabou não seguindo adiante porque o mercado ainda não estava pronto para esse tipo de tecnologia.

A grande virada veio em 1994, quando a internet começou a se espalhar. O time resolveu adaptar a linguagem Oak para o desenvolvimento de aplicações web, criando um navegador chamado WebRunner, que trazia interatividade para a web. Foi nessa fase que decidiram mudar o nome da linguagem. James Gosling, um dos criadores, perguntou à equipe o que os motivava durante o trabalho, e a resposta foi: Java Coffee, um tipo de café forte que eles adoravam. Assim, em 1995, nasceu o Java, com a ideia de escrever o código uma vez e rodar em qualquer lugar — o famoso lema: “Write Once, Run Anywhere”.

### 2.2 Principais Características

Java virou referência por algumas razões bem práticas e técnicas:

- Independência de plataforma: o código é compilado para bytecode, que roda em qualquer sistema com a JVM (Java Virtual Machine).

- Orientação a objetos: tudo é tratado como objeto, com suporte completo a herança, polimorfismo, encapsulamento e abstração.

- Robustez e segurança: inclui coleta automática de lixo (garbage collection), tratamento de exceções e ausência de ponteiros.

- Multithreading: permite rodar várias tarefas ao mesmo tempo com suporte nativo a threads.

- Compilação otimizada: o JIT (Just-In-Time compiler) da JVM melhora significativamente o desempenho.

- Ampla biblioteca padrão: oferece APIs para diversas finalidades como manipulação de arquivos, redes, interfaces gráficas, criptografia, etc.

Além disso, Java possui tipagem estática e forte (os tipos são verificados em tempo de compilação), escopo léxico (variáveis seguem o escopo onde foram declaradas) e um modelo de execução baseado em vinculação profunda — ou seja, o significado de variáveis e métodos é resolvido com base na estrutura estática do programa, não no fluxo dinâmico da execução.

### 2.3 Funcionalidades

Entre as funcionalidades modernas da linguagem, destacam-se:

- Coleta automática de lixo (Garbage Collection): gerencia a memória automaticamente, liberando objetos que não estão mais sendo utilizados, o que evita vazamentos e melhora a eficiência do sistema.

- Tratamento de erros por exceção: permite capturar e lidar com erros de forma controlada, usando `try`, `catch`, `finally` e `throw`, o que aumenta a robustez das aplicações.

- APIs de concorrência: fornece ferramentas como `java.util.concurrent` para trabalhar com threads, sincronização, filas e pools de execução, facilitando o desenvolvimento de programas paralelos e eficientes.

- Uso de reflexão (Reflection API): permite inspecionar e manipular classes, métodos e atributos em tempo de execução, o que é útil para frameworks, testes e ferramentas de desenvolvimento.

- Modularização (Java 9+): introduz o sistema de módulos (`module-info.java`), que organiza o código em unidades reutilizáveis e mais seguras, facilitando a manutenção e o controle de dependências.

- Expressões lambda e Streams (Java 8): adicionam suporte à programação funcional, permitindo trabalhar com coleções de forma mais concisa, expressiva e eficiente, usando filtros, mapeamentos e reduções.

### 2.4 Benefícios 

Os benefícios do Java são muitos:

- Portabilidade real: roda em qualquer sistema com a JVM;

- Segurança reforçada: ideal para aplicações que lidam com dados sensíveis;

- Bom desempenho, graças ao compilador JIT e otimizações da máquina virtual;

- Escalabilidade: ótimo para sistemas grandes e distribuídos;

- Ampla comunidade: com vasta documentação, frameworks, ferramentas, tutoriais, bibliotecas e oportunidades no mercado de trabalho.

### 2.5 Principais Aplicações

Java é amplamente utilizado em diferentes áreas da computação, como:

- Desenvolvimento web: com frameworks como Spring, JSF, Servlets e REST APIs;

- Aplicações Android: foi a linguagem principal por muitos anos;

- Sistemas corporativos: como bancos, ERPs, CRMs e sistemas de grande porte;

- Computação em nuvem: com suporte em plataformas como AWS, GCP e Azure;

- Big Data: com ferramentas como Hadoop e Spark;

- IoT e dispositivos embarcados: principalmente usando Java ME;

- Aplicações científicas e espaciais: como a missão Gaia da ESA (Agência Espacial Europeia);

- Aplicações desktop e até jogos.

## 3 DETALHAMENTO DA LINGUAGEM
### 3.1 Paradigma de Orientação a Objetos em Java

A linguagem Java é um dos exemplos clássicos de linguagens orientadas a objetos, sendo o principal paradigma da linguagem. 
Portanto, a linguagem é baseada nos 4 pilares da orientação a objetos, são eles, abstração, encapsulamento, herança e polimorfismo.

Abstração é o processo de esconder os detalhes da implementação, expondo somente a funcionalidade para o usuário. 
Encapsulamento é o processo de agrupar código e dados em uma única unidade (classe). 
Herança é o processo de onde uma classe herda os atributos e métodos de outra classe. 
Polimorfismo é a habilidade de um método executar coisas diferentes dependendo do contexto em que for chamado.
 
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

#### 3.1.4 Composição
É um princípio de design de software que envolve construir objetos complexos a partir de objetos mais simples.
Em vez de uma classe herdar o comportamento de outra (herança), ela "tem um" objeto de outra classe e delega a ele
parte de suas responsabilidades. É uma relação "tem um" (has-a) em oposição à relação "é um" (is-a) da herança.

Em Java, o controle do encapsulamento de métodos, classes e atributos é feito usando modificadores de acesso.

Exemplo:
Imagine que você está criando um jogo. Um objeto Jogador pode não precisar herdar de uma classe Arma, mas pode ter uma Arma.

Observe as seguintes classes: 

```java
class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public void usar() {
        System.out.println("Usando " + nome + " para causar " + dano + " de dano.");
    }
}

class Jogador {
    private String nome;
    private Arma armaEquipada; // Jogador "tem uma" Arma

    public Jogador(String nome, Arma arma) {
        this.nome = nome;
        this.armaEquipada = arma;
    }

    public void atacar() {
        System.out.print(nome + " ataca! ");
        if (armaEquipada != null) {
            armaEquipada.usar();
        } else {
            System.out.println("Mas não tem uma arma equipada.");
        }
    }
}
```

Com essas classes é possível "dar" ao jogador armas, assim o jogador é composto por seus atributos, métodos e uma arma.  
Exemplo de uso:
```java
class ExemploComposicao {
  public static void main(String[] args) {
    Arma espada = new Arma("Espada Longa", 20);
    Jogador heroi = new Jogador("Arthur", espada);
    heroi.atacar();

    Jogador mago = new Jogador("Merlin", null);
    mago.atacar();
  }
}
```

#### 3.1.5 Organização de Código em Java

Em java, os principais mecanismos para organizar o código são pacotes e módulos.

Pacotes em Java são uma forma de agrupar classes e interfaces relacionadas. Eles servem para:

* Organização: Estruturam o código de forma lógica, tornando-o mais fácil de encontrar e gerenciar.
* Controle de Acesso: Definem a visibilidade de classes e membros. Classes no mesmo pacote podem acessar membros com visibilidade default (package-private).
* Prevenção de Conflitos de Nomes: Permitem que você tenha classes com o mesmo nome em pacotes diferentes sem gerar erros. Por exemplo, você pode ter com.meuapp.model.Usuario e com.outrapp.servico.Usuario.

Como usar:
Pacotes são definidos usando a palavra-chave package no início de cada arquivo de classe Java.
```java
package com.meuapp.model;
```

Módulos foram introduzidos no Java 9 com o Java Platform Module System (JPMS) (também conhecido como Projeto Jigsaw). 
Eles permitem agrupar pacotes e definir dependências explícitas entre eles.

Como usar:
Um módulo é definido por um arquivo module-info.java na raiz do diretório do módulo.

Por exemplo:
```java
module meu.aplicativo {
    requires java.sql; // Depende do módulo java.sql
    exports com.meuapp.api; // Exporta o pacote 'com.meuapp.api'
}
```

Benefícios dos Módulos:

* Encapsulamento Forte: Um módulo define quais pacotes ele exporta (torna visíveis para outros módulos) e de quais pacotes ele depende. Isso impede que partes internas de um módulo sejam acessadas acidentalmente.
* Configurabilidade: Ajuda a criar aplicações mais leves, pois o JRE (Java Runtime Environment) pode incluir apenas os módulos necessários para a aplicação.
* Melhor Desempenho: O JRE pode otimizar a carga de classes.
* Confiabilidade: As dependências explícitas facilitam identificar problemas de dependência em tempo de compilação.

#### 3.1.6 Polimorfismo Ad-Hoc e Universal
Permite que um método com o mesmo nome se comportem de maneira diferente dependendo do contexto.


##### Polimorfismo Ad-Hoc 
Também conhecido como sobrecarga de métodos, o polimorfismo ad-hoc ocorre ao ter vários métodos com o mesmo 
nome em uma única classe, mas com diferentes assinaturas (número, tipo ou ordem dos parâmetros). 
O compilador decide qual método chamar com base nos argumentos fornecidos em tempo de compilação.

```java
class Calculadora {
  // Soma dois inteiros
  public int somar(int a, int b) {
    return a + b;
  }

  // Soma três inteiros
  public int somar(int a, int b, int c) {
    return a + b + c;
  }

  // Soma dois doubles
  public double somar(double a, double b) {
    return a + b;
  }
}
```

Considerando essa classe o seguinte trecho de código se torna possível:
```java
Calculadora calc = new Calculadora();
System.out.println(calc.somar(5, 10));       // Chama somar(int, int)
System.out.println(calc.somar(5, 10, 15));   // Chama somar(int, int, int)
System.out.println(calc.somar(2.5, 3.5));    // Chama somar(double, double)
```
##### Polimorfismo Universal
O polimorfismo universal permite que um objeto de uma subclasse seja tratado como um objeto da sua superclasse, 
mas o método invocado é aquele da subclasse. Isso pode ser alcançado através de interfaces ou pela sobrescrita (overriding).

Com a sobrescrita uma subclasse fornece uma implementação específica para um método que já é 
definido na sua superclasse. A decisão de qual método chamar é feita em tempo de execução (polimorfismo dinâmico).

Exemplo de definição:
```java
class Animal {
  public void fazerSom() {
    System.out.println("O animal faz um som.");
  }
}

class Cachorro extends Animal {
  @Override // Anotação opcional, mas boa prática
  public void fazerSom() {
    System.out.println("O cachorro late: Au au!");
  }
}

class Gato extends Animal {
  @Override
  public void fazerSom() {
    System.out.println("O gato mia: Miau!");
  }
}
```
Exemplo de uso:
```java
Animal meuAnimal = new Animal();
Animal meuCachorro = new Cachorro(); 
Animal meuGato = new Gato();        

meuAnimal.fazerSom();  // Saída: O animal faz um som.
meuCachorro.fazerSom();// Saída: O cachorro late: Au au! (Método do Cachorro é chamado)
meuGato.fazerSom();    // Saída: O gato mia: Miau! (Método do Gato é chamado)
```

No caso das interfaces, elas definem um contrato de métodos que as classes devem implementar. Então, uma variável 
pode ser declarada com o tipo de interface, e consegue referenciar qualquer objeto de uma classe que implemente essa interface. 

Exemplo de definição:
```java
interface Forma {
    double calcularArea();
    void desenhar();
}

class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

class Retangulo implements Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo.");
    }
}
```
Exemplo de uso:
```java
Forma forma1 = new Circulo(5.0);
Forma forma2 = new Retangulo(4.0, 6.0);

System.out.println("Área do círculo: " + forma1.calcularArea());
forma1.desenhar();

System.out.println("Área do retângulo: " + forma2.calcularArea());
forma2.desenhar();
```

### 3.2 Paradigma Funcional em Java

Desde o Java 8, a linguagem começou a suportar construções e desenvolvimentos funcionais através de novas interfaces e objetos entregues pela própria linguagem. Em Java, Funções se tornam Objetos e por sua vez elementos de primeira ordem na linguagem. A seguir, iremos explorar o que estas construções fornecem e como podemos aproveita-las para criar códigos sucintos e fluentes.

#### 3.2.1 As interfaces funcionais em Java

Sendo uma linguagem puramente orientada a objetos em sua concepção, Java não foi formulada com suporte nativo a programação funcional. Porém, com a evolução do mercado e da própria linguagem, o suporte a construções funcionais foi adicionado, tornando-se um método muito prático, principalmente para o consumo de coleções de objetos. Em Java, o pacote java.util.function é o responsável por fornecer as interfaces e objetos relacionados a construções funcionais. Java fornece interfaces para funções de diferentes aridades e métodos; abaixo, veremos alguns exemplos.

Primeiramente, temos a interface Function<T,R>, que permite a implementação de funções de aridade 1, com um único argumento (T) e um único retorno (R). Através do uso de Generics, a interface é polimórfica e permite que tanto implementações quanto consumidores desta interface definam quais tipos são aceitos. Além disso, Java fornece uma extensão natural desta interface, a BiFunction<T, U, R>, que aceita dois argumentos e produz um resultado. Para um número maior de argumentos, o desenvolvedor deve definir suas próprias interfaces.

Java ainda fornece algumas especializações de Function:

- `Predicate<T>`: Uma função do tipo Function<T, Boolean>, permitindo que haja uma interface unificada para testes e validações em cima de argumentos.

- `Consumer<T>`: Uma função do tipo Function<T, void>, representando uma operação terminal que consome um argumento e não possui retorno.

- `Supplier<R>`: Uma função do tipo Function<void, R>, representando uma função que gera ou fornece resultados sem necessitar de nenhuma entrada.

Estas definições não só ajudam desenvolvedores a adicionarem mais intenção e controle sobre seus designs, como também permitem à linguagem fornecer componentes reutilizáveis, segregando o tipo de função que um método aceita utilizando os próprios recursos da orientação a objetos para validar as interfaces.

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

#### 3.2.6 Imutabilidade 

Porém, mesmo com a adição de suporte a construções funcionais, Java por natureza não consegue garantir a imutabilidade completa de seus objetos ou a null-safety da linguagem, sendo possivel criar construçoes que violam esses principios dentro de abordagens funcionais, como segue o exemplo abaixo:

```java
import java.util.List;
import java.util.ArrayList;

public record Pessoa(String nome, List<String> telefones) {}

public class ExemploImutabilidade {
    public static void main(String[] args) {
        List<String> telefones = new ArrayList<>();
        telefones.add("99999-0000");
        Pessoa pessoa = new Pessoa("João", telefones);

        pessoa.telefones().add("88888-1111");
        System.out.println(pessoa.telefones()); // Saída: [99999-0000, 88888-1111]
    }
}
```

No exemplo acima, mesmo utilizando um `record` (que é imutável em sua estrutura), o campo `telefones` é uma lista mutável. Isso permite que o conteúdo da lista seja alterado após a criação do objeto, violando o princípio da imutabilidade profunda. Além disso, Java não impede o uso de `null` como valor, o que pode causar exceções em tempo de execução:

```java
Pessoa pessoaNula = new Pessoa(null, null);
System.out.println(pessoaNula.nome()); // Saída: null 
```

Entretanto, ainda é possível programar como se a linguagem fosse funcional e imutável de fato, tornando Java uma linguagem ainda mais competitiva e robusta no cenário de desenvolvimento de software.

## 4 ANÁLISE CRITÍCA

Seguindo o modelo visto em aula, neste capitulo iremos análisar algumas caracteristicas da linguagem do ponto de vista do grupo.

### 4.1 Simplicidade

Java não está entre as linguagens mais simples que possuimos, principalmente devido a sua constante evolução e crescimento da linguagem, entretanto, ela ainda é considerada uma linguagem de fácil aprendizado, principalmente para quem já possui alguma experiência com linguagens orientadas a objetos. A sintaxe não foge do padrão de outras linguagens como C e C#, permitindo uma fácil transição entre estas linguagens, mesmo com seu vocabulário extenso e notações próprias, como o `this` (mais comum em Javascript) e o uso de Generics, que podem ser um pouco confusos para iniciantes.

### 4.2 Ortogonalidade

Java é uma linguagem ortogonal, pois suas construções são independentes e podem ser combinadas de várias maneiras sem causar efeitos colaterais inesperados. Por exemplo, o uso de herança, interfaces, classes abstratas e métodos concretos pode ser combinado livremente para criar hierarquias complexas de classes. Além disso, a linguagem permite a criação de métodos genéricos que podem operar em diferentes tipos de dados, aumentando ainda mais a flexibilidade e a reutilização do código. Inclusive, com a introdução de Generics e interfaces funcionais, a linguagem se tornou ainda mais ortogonal, permitindo que os desenvolvedores criem soluções mais flexíveis e reutilizáveis. 

### 4.3 Estruturas de Controle

Java possui todas as estruturas de controle comuns em linguagens de programação, como condicionais (`if`, `else`, `switch`) e loops (`for`, `while`, `do-while`). Essas estruturas são bem definidas e fáceis de entender, permitindo que os desenvolvedores escrevam código claro e legível. Além disso, a linguagem suporta o uso de expressões lambda e streams, que permitem uma abordagem funcional para manipulação de coleções, tornando o código mais conciso e expressivo.

### 4.4 Mecanismos de definição e gerência de escopo

Java possui um sistema de escopo bem definido, onde variáveis e métodos são acessíveis dentro do escopo em que foram declarados. O escopo pode ser definido por blocos de código, classes, pacotes e módulos. A linguagem também suporta modificadores de acesso (`public`, `private`, `protected`, `default`) que controlam a visibilidade dos membros da classe, permitindo uma gerência eficaz do escopo e encapsulamento. Além disso, com a introdução de módulos no Java 9, o controle de escopo foi aprimorado, permitindo que os desenvolvedores definam quais pacotes são acessíveis fora do módulo. Com o uso de frameworks como Spring e Maven, a gerência de escopo se torna ainda mais robusta, permitindo a criação de aplicações modulares e escaláveis.

### 4.5 Expressividade

Java é uma linguagem expressiva, permitindo que os desenvolvedores escrevam código claro e conciso. A introdução de recursos como expressões lambda, streams e records aumentou significativamente a expressividade da linguagem, permitindo que os desenvolvedores escrevam código mais declarativo e menos imperativo. Além disso, a linguagem possui uma rica biblioteca padrão (Java Standard Library) que fornece uma ampla gama de funcionalidades prontas para uso, o que reduz a necessidade de escrever código boilerplate. A sintaxe da linguagem é clara e consistente, o que facilita a leitura e compreensão do código por outros desenvolvedores.

### 4.6 Mecanismos de Especificação e Verificação de Tipos

Sendo uma linguagem estaticamente tipada, Java possui um sistema de tipos forte e bem definido. Os tipos são verificados em tempo de compilação, o que ajuda a evitar erros comuns relacionados a tipos. A linguagem suporta herança, interfaces e generics, permitindo mais controle ao desenvolvedor definir o quão estreito ou amplo será a gama de tipos que aceita. Além disso, com a introdução de records e pattern matching, a verificação de tipos se tornou ainda mais robusta, permitindo que os desenvolvedores escrevam código mais seguro e expressivo. A linguagem também possui suporte a anotações (annotations), que permitem adicionar metadados ao código e podem ser usadas para validação em tempo de compilação ou em tempo de execução. 

Porém, o fato de todos os objetos poderem ser tratados como Object, e a possibilidade de usar o operador `instanceof` para verificar o tipo de um objeto em tempo de execução, pode levar a erros sutis se não for usado corretamente. Além disso, a linguagem não possui suporte nativo a tipos union ou intersection, o que pode limitar a expressividade em alguns casos.

### 4.7 Suporte ao tratamento de exceções

Java possui um sistema robusto de tratamento de exceções, que permite aos desenvolvedores capturar e tratar erros de forma controlada. A linguagem distingue entre exceções verificadas (checked exceptions) e não verificadas (unchecked exceptions). Exceções verificadas devem ser declaradas no método ou capturadas dentro de um bloco try-catch, enquanto exceções não verificadas (como NullPointerException) não precisam ser declaradas. Java usa uma tabela estática de exceções, onde cada exceção é mapeada para um tipo específico. Isso permite que os desenvolvedores tratem exceções de forma específica e personalizada, melhorando a robustez do código. Além disso, a linguagem suporta o uso de blocos try-with-resources, que garantem o fechamento automático de recursos como arquivos e conexões de banco de dados, evitando vazamentos de recursos.

### 4.8 Reusabilidade

Java é uma linguagem altamente reutilizável, principalmente devido ao seu forte suporte a orientação a objetos e modularidade. A linguagem permite a criação de classes e interfaces que podem ser reutilizadas em diferentes partes do código ou em diferentes projetos. Além disso, o uso de pacotes e módulos facilita a organização e reutilização de código, sendo uma das linguagens mais populares para desenvolvimento de bibliotecas e frameworks reutilizáveis. A combinação do uso de interfaces e controle da visibilidade dos membros da classe permite que os desenvolvedores criem APIs limpas e bem definidas, promovendo a reutilização de código e seguindo o principio SOLID de Interface Segregation, garantindo um reuso limpo.

### 4.9 Suporte a documentação

O sistema de documentaçao em Java já é integrado diretamente a linguagem, o Javadoc, permite que os desenvolvedores escrevam documentação diretamente no código-fonte usando comentários especiais. Essa documentação pode ser gerada automaticamente em formato HTML, facilitando a leitura e compreensão do código por outros desenvolvedores. Além disso, o Javadoc suporta tags especiais para documentar parâmetros, retornos, exceções e outros aspectos dos métodos e classes, permitindo que IDEs e geradores de documentação tornem o acesso a essas informações um processo rápido e sem um grande overhead para o desenvolvedor que a escreve ou consome.

### 4.10 Generalidade

Java pode (e é) usada para uma ampla variedade de aplicações, desde aplicativos desktop, web, movéis, sistemas embarcados, back-ends em micro-serviços e até mesmo jogos. Devido a JVM, a linguagem é portável e pode ser executada em qualquer plataforma que suporte a máquina virtual Java, o que a torna uma escolha popular para desenvolvimento multiplataforma.

### 4.11 Portabilidade, longevidade

Novamente, devido a JVM, Java é altamente portátil e pode ser executada em qualquer sistema operacional que suporte a máquina virtual Java. A linguagem foi projetada para ser independente de plataforma desde o início, o que a torna uma escolha popular para desenvolvimento de aplicações empresariais e sistemas distribuídos. Além disso, a linguagem tem uma longa história e uma grande base de usuários, o que garante sua longevidade no mercado. A evolução constante da linguagem, com novas versões sendo lançadas regularmente, também contribui para sua relevância e continuidade no futuro, conseguindo sair de aplicações baseadas em servidores on-premise e sendo uma linguagem predominante em aplicações distribuídas também.

### 4.12 Escalabilidade e desempenho

Java é uma linguagem escalavel, principalmente devido ao seu forte suporte a orientação a objetos, modularidade e paralelização. A linguagem permite que os desenvolvedores criem aplicações que podem ser facilmente escaladas para lidar com grandes volumes de dados e usuários. Além disso, o uso de threads e a capacidade de executar código em paralelo (com streams) permitem que as aplicações Java aproveitem ao máximo os recursos do hardware moderno, como processadores multi-core, mesmo com um pequeno esforço por parte do desenvolvedor.

A JVM também possui um sistema de gerenciamento de memória eficiente, com coleta de lixo (garbage collection) automática, o que ajuda a evitar vazamentos de memória e melhora o desempenho geral das aplicações. No entanto, é importante notar que o desempenho pode variar dependendo da implementação da JVM e das configurações de execução, não sendo uma linguagem de alto desempenho em comparação com linguagens como C ou C++.

### 4.13 Custo

Java é uma linguagem de código aberto e gratuita, o que a torna acessível para desenvolvedores e empresas. A Oracle, que mantém o desenvolvimento da linguagem, oferece uma versão comercial da JVM com suporte pago, mas a maioria dos desenvolvedores utiliza versões gratuitas e de código aberto, como OpenJDK. Porém, o consumo de recursos da JVM e a necessidade de hardware mais potente para executar aplicações Java em grande escala podem aumentar os custos operacionais, especialmente em ambientes de produção. Além disso, o custo de desenvolvimento pode ser maior devido à complexidade da linguagem e à necessidade de uma equipe de desenvolvedores experientes para criar e manter aplicações Java de alta qualidade, o que é atenuado pelo grande ecossistema de bibliotecas e frameworks disponíveis, que podem reduzir o tempo de desenvolvimento e os custos associados.

### 4.14 Confiabilidade

Devido a presença de null na linguagem, Java não pode ser considerada totalmente confiável em runtime, com o famoso NullPointerExcepetion sendo comum em Java. Porém, a linguagem possui um sistema de tipos forte e bem definido, o que ajuda a evitar muitos erros comuns relacionados a tipos. Além disso, o sistema de tratamento de exceções permite que os desenvolvedores capturem e tratem erros de forma controlada, melhorando a robustez do código. A introdução de recursos como Optional e pattern matching também contribui para aumentar a confiabilidade do código, permitindo que os desenvolvedores escrevam código mais seguro e expressivo, porém está carga ainda é deixada para o desenvolvedor, ao contrário de linguagens como Rust, que possuem um sistema de tipos que garante a ausência de null em tempo de compilação.

### 4.15 Legibilidade

Java é tão legível quanto os programadores a permitem ser. Apeas do custo inicial de absorver a sintaxe da linguagem, o código Java costuma ser padronizado e de fácil assimilação devido a sua sintaxe forte e estrita. Porém, más práticas de programação, como o uso excessivo de comentários, nomes de variáveis pouco descritivos e código complexo, podem tornar o código Java difícil de ler e entender, bem como o uso exagerado de Generics. A introdução de recursos como expressões lambda, streams e records aumentou significativamente a legibilidade da linguagem, permitindo que os desenvolvedores escrevam código mais declarativo e mais parecido com prosa. Além disso, o uso de Javadoc e outras ferramentas de documentação ajuda a manter o código bem documentado e fácil de entender por outros desenvolvedores.

### 4.16 Redigibilidade

A redigibilidade em Java é boa, apesar de verbosa. Porém, com o uso de IDEs modernas e ferramentas como o Lombok (que permite a criação automática de código boilerplate) e o uso de records, essa verbosidade pode ser significativamente reduzida. A linguagem também possui uma forte convenção de nomenclatura e estilo de código, o que ajuda a manter o código consistente e fácil de ler. Além disso, o uso de ferramentas de formatação automática e linters ajuda a garantir que o código siga as convenções de estilo e seja fácil de entender por outros desenvolvedores, permitindo que formatação sejá parte do processo de compilação e não uma tarefa manual, por exemplo usando o plugin checkstyle em Maven.

## 5 CONCLUSÃO

## 6 BIBLIOGRAFIA 

ORACLE. Processing Streams in Java SE 8. Disponível em: <https://www.oracle.com/br/technical-resources/articles/java/processing-streams-java-se-8.html>. Acesso em: 20 jun. 2025.

ORACLE. Record Patterns (Java SE 22 & JDK 22). Disponível em: <https://docs.oracle.com/en/java/javase/22/language/record-patterns.html>. Acesso em: 20 jun. 2025.

ORACLE. java.util.function (Java SE 8 & JDK 8). Disponível em: <https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html>. Acesso em: 20 jun. 2025.

BAELDUNG. Java Streams vs Loops. Disponível em: <https://www.baeldung.com/java-streams-vs-loops>. Acesso em: 20 jun. 2025.

OPENJDK. JEP 395: Records. Disponível em: <https://openjdk.org/jeps/395>. Acesso em: 20 jun. 2025.

OPENJDK. JEP 441: Pattern Matching for switch. Disponível em: <https://openjdk.org/jeps/441>. Acesso em: 20 jun. 2025.

ORACLE. Java Technology History. Disponível em: <https://www.oracle.com/java/technologies/javase/java-history.html>. Acesso em: 20 jun. 2025.

ORACLE. Java Platform, Standard Edition Documentation. Disponível em: <https://docs.oracle.com/en/java>. Acesso em: 20 jun. 2025.

GEEKSFORGEEKS. History of Java. Disponível em: <https://www.geeksforgeeks.org/history-of-java>. Acesso em: 20 jun. 2025.

BAELDUNG. A Java Timeline. Disponível em: <https://www.baeldung.com/java-timeline>. Acesso em: 20 jun. 2025.

ORACLE. The Java™ Tutorials – Concurrency. Disponível em: <https://docs.oracle.com/javase/tutorial/essential/concurrency>. Acesso em: 20 jun. 2025.

ORACLE. The Reflection API. Disponível em: <https://docs.oracle.com/javase/tutorial/reflect>. Acesso em: 20 jun. 2025.

ORACLE. Introduction to Lambda Expressions. Disponível em: <https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html>. Acesso em: 20 jun. 2025.

ORACLE. Project Jigsaw: Module System Quick-Start Guide. Disponível em: <https://openjdk.org/projects/jigsaw/quick-start>. Acesso em: 20 jun. 2025.

ESA. Gaia: ESA’s billion-star surveyor. Disponível em: <https://www.esa.int/Science_Exploration/Space_Science/Gaia_overview>. Acesso em: 20 jun. 2025.

