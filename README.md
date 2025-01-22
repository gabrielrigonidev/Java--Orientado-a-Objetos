---
description: >-
  Nessa seção estará listados por TÓPICOS os principais pontos desse paradigma
  tão importante do mundo Java
---

# Conteúdos POO

## Classes e Objetos

* **O que são classes**: moldes ou formas que definem características e comportamentos, mas sem valores concretos.
* **O que são objetos**: instâncias concretas das classes, onde características ganham valores específicos e os comportamentos podem ser observados.

Para facilitar o entendimento, usamos exemplos do cotidiano:

1. **Caneta** como classe: define características (cor, tamanho) e comportamentos (escrever).
   * **CanetaAzul** e **CanetaVermelha** como objetos: cada um com valores específicos para suas características, como a cor, mas compartilhando o mesmo comportamento.
2. **Bolo** como classe: um molde que descreve características como sabor e cobertura e o comportamento de "servir".
   * **BoloChocolate** e **BoloCenoura** como objetos: implementações concretas dessa classe, cada um com seus valores específicos.

## **Atributos e Métodos**

* **Atributos:** Representam os **dados** ou características do objeto.
  * Exemplo: Na classe `Caneta`, os atributos podem ser `cor` e `marca`.
* **Métodos:** São as **ações** que o objeto pode executar.
  * Exemplo: O método `escrever()` permite que o objeto `CanetaAzul` ou `CanetaVermelha` simule a ação de escrever.

**Palavra Reservada `this`**

A palavra `this` é usada dentro de uma classe para se referir ao próprio objeto em questão. Ela é especialmente útil quando os parâmetros de um método têm o mesmo nome que os atributos da classe, para evitar confusão.

```
public void tampar() {  
    this.tampada = true;
}
```

**Instanciação de Objetos**

Para criar um objeto no Java, utilizamos a palavra reservada `new`.

```
Caneta canetaAzul = new Caneta();  
canetaAzul.cor = "Azul";  
canetaAzul.marca = "BIC";
```

***

## **Visibilidades em Detalhes**&#x20;

(A visibilidade se aplica tanto as classes quanto aos métodos!)

* **Public (`+`):**
  * Membros com essa visibilidade podem ser acessados por qualquer classe.
  * Usado para métodos e atributos que precisam ser amplamente acessíveis.
* **Private (`-`):**
  * Restrito à própria classe.
  * Indicado para atributos e métodos que não devem ser acessados diretamente de fora da classe.
* **Protected (`#`):**
  * Pode ser acessado por subclasses ou classes dentro do mesmo pacote.
  * Útil em hierarquias de herança.
* **Default (sem símbolo):**
  * Apenas classes do mesmo pacote têm acesso.
  * Ideal para modularidade e encapsulamento dentro de um mesmo pacote.

***

## **Anatomia de um Método Java**

* **Visibilidade** (`public`, `private`, etc.).
* **Tipo de retorno** (void, int, String, etc.).
* **Nome do método** (seguindo boas práticas de nomenclatura).
* **Parâmetros** (e como defini-los corretamente). Exemplos práticos de criação de métodos com diferentes tipos de retorno e parâmetros.

### **Métodos Especiais em Java**

(Alguns métodos essenciais que facilitam o trabalho com objetos)

* **Construtores**: Iniciam os objetos com valores definidos.
* **Getters e Setters**: Permitem acesso e modificação controlados aos atributos.
* **toString**: Fornece uma representação textual do objeto.
* **equals** e **hashCode**: Garantem comparações e armazenamento corretos em estruturas como HashMap.

***





