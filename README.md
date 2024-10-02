# Projeto: Árvore Binária de Código Morse

A árvore é montada usando os símbolos **"."** (ponto) e **"-"** (traço), onde:
- **"." (ponto)** indica o filho esquerdo do nó.
- **"-" (traço)** indica o filho direito do nó.

## Estrutura do Projeto

1. **ArvoreBinariaMorse**: criação da árvore, inserção, exibição e busca de caracteres em codigo morse.
2. **Nodo**: nó da árvore, contendo um caractere e referências para os filhos esquerdo e direito.
3. **Morse**: menu principal, onde o usuário pode interagir com a árvore.

## Como Usar
### Menu
Ao executar o programa, o usuário tem as seguintes opções:
- **1. Buscar Código Morse**: O usuário digita um código Morse (usando "." e "-") e recebe o caractere correspondente. Para buscar várias letras, é necessário separar os códigos Morse com espaços.
- **2. Exibir Árvore Morse**: Exibe toda a estrutura da árvore com os códigos Morse e seus caracteres.
- **3. Sair**: Encerra o programa.

### Exemplo de Entrada e Saída
1. **Inserção de caracteres**:
    - Código Morse: `. -` representa a letra "A".
    - Esse padrão é usado para todas as letras e números.

2. **Busca de códigos Morse**:
    - Entrada: `.- ... -.-`
    - Saída: `ASK`
  
3. **Exibir a árvore**:
    - A árvore será mostrada com cada nó e seu respectivo código Morse.

### Tabela de Códigos Morse

Ao iniciar a árvore, os seguintes códigos Morse estão mapeados:

| Código Morse | Caractere |
|--------------|-----------|
| .-           | A         |
| -...         | B         |
| -.-.         | C         |
| -..          | D         |
| .            | E         |
| ..-.         | F         |
| --.          | G         |
| ....         | H         |
| ..           | I         |
| .---         | J         |
| -.-          | K         |
| .-..         | L         |
| --           | M         |
| -.           | N         |
| ---          | O         |
| .--.         | P         |
| --.-         | Q         |
| .-.          | R         |
| ...          | S         |
| -            | T         |
| ..-          | U         |
| ...-         | V         |
| .--          | W         |
| -..-         | X         |
| -.--         | Y         |
| --..         | Z         |
| .----        | 1         |
| ..---        | 2         |
| ...--        | 3         |
| ....-        | 4         |
| .....        | 5         |
| -....        | 6         |
| --...        | 7         |
| ---..        | 8         |
| ----.        | 9         |
| -----        | 0         |

## Como Rodar

1. Faça o download ou clone o repositório.
2. Compile e execute o arquivo **Morse.java**.
3. Siga as instruções no menu para interagir com a árvore Morse.
