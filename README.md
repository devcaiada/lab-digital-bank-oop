# Estudo de POO em Java

Criando um Banco Digital com Java e Orientação a Objetos para fins de estudo. Desaio DIO\_ Formação Java Developer.

Vamos utilizar uma implementação de referência no [Github](https://github.com/falvojr/lab-banco-digital-oo) e incremendar alguns atributos e métodos para enriquecer nosso estudo, sempre levando em consideração os 4 pilares da Programação Orientada a Objetos:

# Abstração

Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

# Encapsulamento

Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

# Herança

Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

# Polimorfismo

Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

## Lombok

Uma implementação simples foi a adição do Lombok, que diminui bastante a verbosidade do código, simplificando os _getters_, _setters_ e os _constructors_ em simples expressões como: @Getter e @Setter.

![lombok](https://uploaddeimagens.com.br/images/004/754/665/original/lombok.jpg?1710183344)

Para utilizar o Lombok basta dar **import Lombok** na sua classe e configurar se arquivo POM.xml da seguinte forma:

```xml
<dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.30</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

Com isso reduzimos drasticamente a verbosidade do nosso código, deixando nossas classes muito mais _clean_.

## Melhorias

Foram adicionados alguns outros atributos para deixar as classes mais completas. Uma lista de transações para observarmos melhor no imprimirExtrato, bem como a data de cada transação, bem como algumas exceções para verificar o saldo antes de efetuar alguma transação.

Foi adicionado também o atributo CPF para a classe Cliente e fizemos um contructor da classe, solicitando o nome e o cpf do mesmo para criar um novo objeto.

## Main

O arquivo main ficou da seguinte forma com alguns testes.

![main](https://uploaddeimagens.com.br/images/004/754/677/original/main.jpg?1710184279)

Aqui criamos um Cliente caio e com ele criamos mais 2 objetos: ContaCorrente e ContaPoupanca.

## Saída

E essa foi nosso output no console.

![output](https://uploaddeimagens.com.br/images/004/754/678/original/output.jpg?1710184410)

Lembrando que todo esse código é apenas um estudo de POO, por isso sua simplicidade e execução.
