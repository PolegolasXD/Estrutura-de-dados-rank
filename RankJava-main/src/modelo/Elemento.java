/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author fábio
 */
public class Elemento {
    
    private String nome;
    private int quantidadeVotos = 0;
    
    public Elemento(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void receberVotos() {
        this.quantidadeVotos += 1;
    }
}
