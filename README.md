# Sandwich Builder

Este projeto é uma implementação do padrão de design *Builder* combinado com o padrão *Factory Method* em Java. Ele demonstra a criação de diferentes tipos de sanduíches utilizando uma abordagem flexível e extensível para a construção de objetos complexos.

## Descrição

O projeto consiste em um sistema para montar sanduíches utilizando o padrão Builder, onde a construção do sanduíche é delegada a fábricas concretas que definem os tipos específicos dos ingredientes:

- **SanduicheBuilder**: Responsável por construir o sanduíche usando uma fábrica de sanduíches.
- **SanduicheFactory**: Classe abstrata que define a interface para as fábricas concretas.
- **SanduicheArtesanalFactory**: Fábrica concreta que cria um sanduíche artesanal.
- **SanduicheIntegralFactory**: Fábrica concreta que cria um sanduíche integral.
- **SanduicheXTudoFactory**: Fábrica concreta que cria um sanduíche X-Tudo.

## Estrutura do Projeto

- **builder**: Contém a classe `SanduicheBuilder`, responsável pela construção do sanduíche.
- **criadorAbstrato**: Contém a classe abstrata `SanduicheFactory`, que define a interface para as fábricas concretas.
- **criadoresConcretos**: Contém as fábricas concretas que implementam a criação dos ingredientes específicos.
- **interfacesProdutos**: Define as interfaces para os tipos de ingredientes do sanduíche.
- **modelo**: Contém a classe `Sanduiche`, que representa o objeto final construído.
- **produtosConcretos**: Contém as implementações concretas dos ingredientes.
- **testes**: Contém testes unitários para validar a criação dos ingredientes e sanduíches.

## Como Executar

Para executar o projeto, compile e execute a classe `Main`. Ela cria diferentes tipos de sanduíches e imprime os resultados.

```java
public class Main {
    public static void main(String[] args) {
        SanduicheBuilder builder = new SanduicheBuilder();

        // Cria um sanduíche artesanal
        SanduicheArtesanalFactory artesanalFactory = new SanduicheArtesanalFactory();
        Sanduiche sanduicheArtesanal = builder.montaSanduiche(artesanalFactory);
        System.out.println("Sanduíche Artesanal: " + sanduicheArtesanal);

        // Cria um sanduíche integral
        SanduicheIntegralFactory integralFactory = new SanduicheIntegralFactory();
        Sanduiche sanduicheIntegral = builder.montaSanduiche(integralFactory);
        System.out.println("Sanduíche Integral: " + sanduicheIntegral);

        // Cria um sanduíche X-Tudo
        SanduicheXTudoFactory xTudoFactory = new SanduicheXTudoFactory();
        Sanduiche sanduicheXTudo = builder.montaSanduiche(xTudoFactory);
        System.out.println("Sanduíche X-Tudo: " + sanduicheXTudo);
    }
}
