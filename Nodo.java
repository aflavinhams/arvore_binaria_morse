public class Nodo {
    
    private Character caractere;  
    private Nodo filhoEsquerdo;   
    private Nodo filhoDireito;    
    
    public Nodo() {
        this.caractere = null;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    public Character getCaractere() {
        return caractere;
    }

   
    public void setCaractere(Character caractere) {
        this.caractere = caractere;
    }

    
    public Nodo getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    
    public void setFilhoEsquerdo(Nodo filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    
    public Nodo getFilhoDireito() {
        return filhoDireito;
    }

    
    public void setFilhoDireito(Nodo filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
}
