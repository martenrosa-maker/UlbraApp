
# Calculadora de Desconto

Este projeto é uma aplicação simples em **Java** que permite calcular o valor de desconto aplicado a um produto.
O usuário informa o nome do produto, o valor original e o percentual de desconto desejado, e o programa retorna o valor do desconto calculado.

---

##  Funcionalidades

* Solicita ao usuário:

  * Nome do produto
  * Valor do produto
  * Percentual de desconto

* Calcula o valor do desconto com base no percentual informado.

* Exibe o resultado no console.

---
## ▶️ Como executar

1. Certifique-se de ter o **Java** instalado na sua máquina.
   Verifique com:

   ```bash
   java -version
   ```

2. Compile o programa:

   ```bash
   javac CalculadoraDesconto.java
   ```

3. Execute o programa:

   ```bash
   java CalculadoraDesconto
   ```

4. Insira os valores solicitados no terminal.

---


## 🛠️ Tecnologias

* **Linguagem:** Java 8+
* **Biblioteca utilizada:** `java.util.Scanner`

---

---

#  Calculadora de ITBI (Imposto de Transmissão de Bens Imóveis)

Este projeto é uma aplicação em **Java** que calcula o valor do **ITBI** (Imposto de Transmissão de Bens Imóveis).
O programa solicita os valores via **JOptionPane** e retorna o valor do imposto a ser pago com base na maior referência entre o **valor do imóvel** e o **valor venal**.

---

## 🚀 Funcionalidades

* Solicita ao usuário:

  * Valor do imóvel
  * Valor venal do imóvel
  * Taxa do ITBI (%)

* Converte os dados informados (String → Double).

* Calcula a **base de cálculo**:

  * Utiliza o **maior valor** entre o **valor do imóvel** e o **valor venal**.

* Calcula o valor do imposto com base na taxa.

* Exibe o resultado em uma caixa de diálogo (`JOptionPane`).

---

## ▶️ Como executar

1. Certifique-se de ter o **Java** instalado na sua máquina.
   Verifique com:

   ```bash
   java -version
   ```

2. Compile o programa:

   ```bash
   javac CalculadoraITBI.java
   ```

3. Execute o programa:

   ```bash
   java CalculadoraITBI
   ```

4. Insira os valores solicitados nas janelas de entrada (`JOptionPane`).

---

## 🛠️ Tecnologias

* **Linguagem:** Java 8+
* **Interface de entrada/saída:** `javax.swing.JOptionPane`


# 🎓 Sistema Avaliador de Alunos

Este projeto é uma aplicação simples em **Java** que avalia o desempenho de um aluno com base em suas notas.
O programa solicita o **nome do aluno** e suas notas (Prova 1, Prova 2 e Trabalho), calcula a **média aritmética** e determina se o aluno foi **Aprovado** ou **Reprovado**.

---

## 🚀 Funcionalidades

* Solicita via **JOptionPane**:

  * Nome do aluno
  * Nota da Prova 1
  * Nota da Prova 2
  * Nota do Trabalho

* Calcula a média aritmética entre as três notas.

* Avalia a situação do aluno:

  * **Aprovado** → média maior ou igual a 6.0
  * **Reprovado** → média menor que 6.0

* Exibe o resultado em uma caixa de diálogo (`JOptionPane`).

---


## ▶️ Como executar

1. Verifique se o **Java** está instalado:

   ```bash
   java -version
   ```

2. Compile o programa:

   ```bash
   javac SistemaAvaliador.java
   ```

3. Execute o programa:

   ```bash
   java SistemaAvaliador
   ```

4. Informe os dados solicitados nas janelas de entrada (`JOptionPane`).

---


## 🛠️ Tecnologias

* **Linguagem:** Java 8+
* **Interface gráfica:** `javax.swing.JOptionPane`


# 👵👴 Sistema de Aposentadoria

Este projeto é uma aplicação em **Java** que verifica se um contribuinte já está apto a se aposentar de acordo com as regras de idade e tempo de contribuição para **homens** e **mulheres**.

Os dados são coletados via **JOptionPane** e o resultado é exibido em uma caixa de diálogo.

---

## 🚀 Funcionalidades

* Solicita ao usuário:

  * Nome do contribuinte
  * Idade
  * Sexo (M/F)
  * Tempo de contribuição

* Avalia a situação com base nas regras:

  * **Mulheres** → podem se aposentar com **62 anos** ou mais e pelo menos **15 anos de contribuição**.
  * **Homens** → podem se aposentar com **65 anos** ou mais e pelo menos **20 anos de contribuição**.

* Exibe uma mensagem informando se o contribuinte está **pronto para se aposentar** ou **não habilitado**.

---

## ▶️ Como executar

1. Verifique se o **Java** está instalado na sua máquina:

   ```bash
   java -version
   ```

2. Compile o programa:

   ```bash
   javac SistemaAposentadoria.java
   ```

3. Execute o programa:

   ```bash
   java SistemaAposentadoria
   ```

4. Insira os dados solicitados nas janelas exibidas (`JOptionPane`).



## 🛠️ Tecnologias

* **Linguagem:** Java 8+
* **Interface gráfica:** `javax.swing.JOptionPane`


# 🔌 Circuitos Resistivos – Associação em Série

Este projeto é uma aplicação em **Java** que permite calcular a **resistência equivalente** de um circuito resistivo com **quatro resistores em série**.

Os valores dos resistores são informados via **JOptionPane**, e o programa exibe os valores individuais e o resultado final em uma caixa de diálogo.

---

## 🚀 Funcionalidades

* Solicita ao usuário os valores de **4 resistores**.
* Calcula a **resistência equivalente em série**:

$$
R_{eq} = R_1 + R_2 + R_3 + R_4
$$

* Exibe:

  * Os valores individuais de cada resistor.
  * O valor da resistência equivalente do circuito.

---

## ▶️ Como executar

1. Verifique se o **Java** está instalado:

   ```bash
   java -version
   ```

2. Compile o programa:

   ```bash
   javac CircuitosResistivos.java
   ```

3. Execute o programa:

   ```bash
   java CircuitosResistivos
   ```

4. Digite os valores dos resistores quando solicitado.

---


## 🛠️ Tecnologias

* **Linguagem:** Java 8+
* **Interface gráfica:** `javax.swing.JOptionPane`


# 🔐 Sistema de Login

Este projeto é uma aplicação em **Java** que simula um sistema simples de autenticação de usuário.
O programa solicita um **login** e uma **senha**, validando os dados contra credenciais pré-definidas. O usuário possui até **3 tentativas** para acertar, caso contrário, o acesso é bloqueado.

---

## 🚀 Funcionalidades

* Solicita via **JOptionPane**:

  * Nome de usuário (login)
  * Senha

* Valida as credenciais inseridas:

  * **Login correto:**

    * Exibe mensagem de acesso permitido.
  * **Login incorreto:**

    * Reduz o número de tentativas disponíveis.
    * Exibe mensagem de erro com o número de tentativas restantes.
  * **3 tentativas incorretas:**

    * Bloqueia o acesso e exibe mensagem de acesso negado.

---


## ▶️ Como executar

1. Verifique se o **Java** está instalado:

   ```bash
   java -version
   ```

2. Compile o programa:

   ```bash
   javac SistemaLogin.java
   ```

3. Execute o programa:

   ```bash
   java SistemaLogin
   ```

4. Informe o login e a senha quando solicitado nas janelas exibidas (`JOptionPane`).

---



## 🛠️ Tecnologias

* **Linguagem:** Java 8+
* **Interface de entrada/saída:** `javax.swing.JOptionPane`

---
