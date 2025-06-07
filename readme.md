# INF01121-Trabalho-Final

<!-- TOC -->
* [INF01121-Trabalho-Final](#inf01121-trabalho-final)
  * [3 DETALHAMENTO DA LINGUAGEM](#3-detalhamento-da-linguagem)
    * [3.2 Paradigma de Orientação a Objetos em Java](#32-paradigma-de-orientação-a-objetos-em-java)
      * [3.1.1 Definição de classes](#311-definição-de-classes)
      * [3.1.2 Herança](#312-herança)
      * [3.1.3 Encapsulamento](#313-encapsulamento)
<!-- TOC -->

## 3 DETALHAMENTO DA LINGUAGEM
### 3.2 Paradigma de Orientação a Objetos em Java

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





