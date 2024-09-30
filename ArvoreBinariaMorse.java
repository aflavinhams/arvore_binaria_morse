/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.morse;

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
                if(no_atual.getFilho_esquerdo() == null){
                    no_atual.setFilho_esquerdo(new Nodo());
                }
                no_atual = no_atual.getFilho_esquerdo();
            }
            else if(simbolo == '-'){
                if(no_atual.getFilho_direito() == null){
                    no_atual.setFilho_direito(new Nodo());
                }
                no_atual = no_atual.getFilho_direito();
            }
           
        }
        no_atual.setCaractere(caractere);
    }
    
    public Character buscarChar(String codigo_morse){
        
        Nodo no_atual = raiz;
        
        for(char simbolo : codigo_morse.toCharArray()){
            if(simbolo == '.'){
                no_atual = no_atual.getFilho_esquerdo();
            }
            else if (simbolo == '-'){
                no_atual = no_atual.getFilho_direito();
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
}
