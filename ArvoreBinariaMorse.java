public class ArvoreBinariaMorse {
    
    private Nodo raiz;

    // inicializando a raiz 
    public  ArvoreBinariaMorse(){
        raiz = new Nodo();
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    // metodo para inserir elementos
    public void inserir(String codigo_morse, char caractere){
        // definindo a raiz como atual
        Nodo no_atual = raiz;

        // loop para percorrer cada simbolo no codigo
        for(char simbolo : codigo_morse.toCharArray()){
            // se o simbolo for ponto
            if(simbolo == '.'){
                // se o nó atual não tiver filho esquerdo então cria um novo nó
                if(no_atual.getFilhoEsquerdo() == null){
                    no_atual.setFilhoEsquerdo(new Nodo());
                }
                // define esse nó novo como atual
                no_atual = no_atual.getFilhoEsquerdo();
            }
            // se o simbolo for traço
            else if(simbolo == '-'){
                // se o nó atual não tiver um filho direito cria um novo
                if(no_atual.getFilhoDireito() == null){
                    no_atual.setFilhoDireito(new Nodo());
                }
                // define o nó atual como esse filho direito
                no_atual = no_atual.getFilhoDireito();
            }
           
        }
        // define o caracter do nó atual como o passado no parâmetro
        no_atual.setCaractere(caractere);
    }

    // metodo para buscar um único caracter
    public Character buscarChar(String codigo_morse){
        
        Nodo no_atual = raiz;

        // loop para para percorrer cada simbolo
        for(char simbolo : codigo_morse.toCharArray()){
            // se for ponto vai para o filho da esquerda
            if(simbolo == '.'){
                no_atual = no_atual.getFilhoEsquerdo();
            }
            // se for traço vai para o filho da direita
            else if (simbolo == '-'){
                no_atual = no_atual.getFilhoDireito();
            }
            // se não existir retorna null
            if (no_atual == null){
                return null;
            }
           
        }
        // retorna o caractere do nó atual
        return no_atual.getCaractere();
    }

    // método para buscar várias letras
    public String buscar(String codigo_morse){

        // separa as letras a cada espaço e armazena em um array de strings
        String[] letra = codigo_morse.split(" ");
        StringBuilder resultado = new StringBuilder();

        // loop para percorrer cada letra
        for (String l : letra){
            // busca a letra 
            Character character = buscarChar(l);
            // se encontrar, adiciona o character no resultado
            if(character != null){
                resultado.append(character);
            }
            // se não encontrar algum símbolo retorno null
            else{
                return null;
            }
        }

        // retorna o resultado
        return resultado.toString();
        
    }
    public void exibirArvore() {
        exibirRecursivamente(raiz, "");
    }

    // método para exibir a árvore
    private void exibirRecursivamente(Nodo no, String codigoMorse) {
        // se o nó não existir retorna
        if (no == null) {
            return;
        }

        // se o nó existir printa o simbolo e o caracter correspondente
        if (no.getCaractere() != null) {
            System.out.println(codigoMorse + ": " + no.getCaractere());
        }

        // executa a função para os filhos esquerdo e direito
        exibirRecursivamente(no.getFilhoEsquerdo(), codigoMorse + ".");
        exibirRecursivamente(no.getFilhoDireito(), codigoMorse + "-");
    }

    
}
