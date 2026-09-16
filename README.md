# Oficina Mecânica - Camada de Persistência

**Aluno:** Kelvin de Oliveira  
**Disciplina:** Software para Persistência de Dados  
**Instituto:** Instituto de Informática - Universidade Federal de Goiás (UFG)  
**Semestre:** 2026.2  
**Professor:** Marcelo Akira

---

## Sobre este repositório

Este repositório contém os artefatos referentes à entrega parcial da atividade de modelagem e persistência de dados (Atividade 0909), especificamente os itens:

- **Camada de persistência:** classes Java mapeadas em tabelas utilizando ORMLite e SQLite, conforme os diagramas de classes e entidade-relacionamento já entregues anteriormente.
- **Notebooks Jupyter:** testes interativos da camada de persistência, avaliando o funcionamento das operações CRUD e demonstrando a serialização dos dados.

Os artefatos anteriores (diagrama de classes e diagrama E-R) foram entregues separadamente. 

**Aviso ao professor:** Estou no grupo  com os integrantes:

- Nicole - 202302625
- Victor Gabriel - 202302631
- Matheus Augusto - 202305532
- Marcello Ronald - 202302618
- Kelvin de Oliveira - 202105042

Os quais fizeram entrega parcial dos outros dois artefatos ainda no dia 09/09/20264

---

## Estrutura do projeto

```
oficina/
├── src/
│   └── main/
│       └── java/
│           └── br/edu/ufg/oficina/
│               ├── domain/         # Classes de domínio (entidades)
│               └── repository/     # Classes de repositório (persistência)
├── notebooks/
│   ├── testes.ipynb                # Testes CRUD de todas as entidades
│   ├── serializacao.ipynb          # Serialização e desserialização JSON
│   └── fluxo.ipynb                 # Simulação de fluxo real de atendimento
├── pom.xml
└── README.md
```

---

## Notebooks

### testes.ipynb

Testa todas as operações CRUD (Create, Read, Update, Delete) para cada uma das 10 entidades do domínio: `Cliente`, `Veiculo`, `Mecanico`, `Servico`, `Peca`, `OrdemServico`, `OrdemMecanico`, `ItemServico`, `ItemPeca` e `NotaFiscal`. Os testes são organizados em seções e utilizam laços para criar múltiplos registros, tornando a validação mais abrangente.

### serializacao.ipynb

Demonstra a serialização dos dados persistidos no banco para o formato JSON utilizando a biblioteca Gson, e a desserialização dos arquivos JSON de volta para objetos Java. Os arquivos JSON são salvos na pasta `notebooks/`. A desserialização reconstrói os objetos em memória mas não os repersiste no banco, pois os relacionamentos entre entidades seriam corrompidos pela geração de novos IDs.

### fluxo.ipynb

Simula um atendimento completo em uma oficina mecânica, desde o cadastro do cliente e do veículo, passando pela abertura da ordem de serviço, adição de serviços e peças, cálculo do valor total, até a emissão da nota fiscal. Ao final, exibe um resumo completo do atendimento.

---

## Como executar os notebooks

### Pré-requisitos

- Python instalado (versão 3.8 ou superior)
- Java JDK 11 ou superior instalado
- Maven instalado

### 1. Criar e ativar um ambiente virtual Python

**Windows**
```bash
python -m venv oficina
oficina\Scripts\activate
```

**Linux e macOS**
```bash
python3 -m venv oficina
source oficina/bin/activate
```

### 2. Instalar o Jupyter Lab

```bash
pip install jupyterlab
```

### 3. Instalar o kernel Java (IJava)

Baixe o arquivo `ijava-1.3.0.zip` em:  
https://github.com/SpencerPark/IJava/releases

Extraia o conteúdo do zip e, dentro da pasta extraída, execute:

**Windows**
```bash
python install.py --sys-prefix
```

**Linux e macOS**
```bash
python3 install.py --sys-prefix
```

Para confirmar que o kernel foi instalado:

```bash
jupyter kernelspec list
```

O kernel `java` deve aparecer na lista.

### 4. Compilar o projeto

Na raiz do projeto:

```bash
mvn compile
```

### 5. Executar o Jupyter Lab

Na raiz do projeto:

```bash
jupyter lab
```

O navegador abrirá automaticamente. Navegue até a pasta `notebooks/` e abra o notebook desejado.

### 6. Selecionar o kernel Java

Ao abrir um notebook, clique em **Select Kernel** no canto superior direito e escolha **Java**.

### 7. Ordem de execução recomendada

1. `testes.ipynb`: execute todas as células em ordem com `Shift+Enter`
2. `serializacao.ipynb`: execute após o `testes.ipynb` antes da celula de delete, ou seja, com o banco populado
3. `fluxo.ipynb`: pode ser executado de forma independente

> As células devem ser executadas sempre de cima para baixo, pois variáveis de células anteriores são utilizadas nas seguintes.