public class ArvoreBinariaMorse {
    
    private Nodo raiz;
    
    public  ArvoreBinariaMorse(){
        raiz = new Nodo();
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    
    
    public void inserir(String codigo_morse, char caractere){
        Nodo no_atual = raiz;
        
        for(char simbolo : codigo_morse.toCharArray()){
            if(simbolo == '.'){
                if(no_atual.getFilhoEsquerdo() == null){
                    no_atual.setFilhoEsquerdo(new Nodo());
                }
                no_atual = no_atual.getFilhoEsquerdo();
            }
            else if(simbolo == '-'){
                if(no_atual.getFilhoDireito() == null){
                    no_atual.setFilhoDireito(new Nodo());
                }
                no_atual = no_atual.getFilhoDireito();
            }
           
        }
        no_atual.setCaractere(caractere);
    }
    
    public Character buscarChar(String codigo_morse){
        
        Nodo no_atual = raiz;
        
        for(char simbolo : codigo_morse.toCharArray()){
            if(simbolo == '.'){
                no_atual = no_atual.getFilhoEsquerdo();
            }
            else if (simbolo == '-'){
                no_atual = no_atual.getFilhoDireito();
            }
            if (no_atual == null){
                return null;
            }
           
        }
        return no_atual.getCaractere();
    }
    
    public String buscar(String codigo_morse){
        
        String[] letra = codigo_morse.split(" ");
        StringBuilder resultado = new StringBuilder();
        
        for (String l : letra){
            Character character = buscarChar(l);
            if(character != null){
                resultado.append(character);
            }
            else{
                return null;
            }
        }
        
        return resultado.toString();
        
    }
    public void exibirArvore() {
        exibirRecursivamente(raiz, "");
    }
    
    private void exibirRecursivamente(Nodo no, String codigoMorse) {
        if (no == null) {
            return;
        }

        if (no.getCaractere() != null) {
            System.out.println(codigoMorse + ": " + no.getCaractere());
        }

        exibirRecursivamente(no.getFilhoEsquerdo(), codigoMorse + ".");
        exibirRecursivamente(no.getFilhoDireito(), codigoMorse + "-");
    }

    
}
