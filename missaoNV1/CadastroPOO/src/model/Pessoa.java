/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author emily
 */


import java.io.Serializable;  // Importação para Serializable

public abstract class Pessoa implements Serializable {  // Definição da classe como 'abstract'

    private int id;
    private String nome;

    // Construtor padrão
    public Pessoa() {}

    // Construtor completo
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato 'exibir' que será implementado nas subclasses
    public abstract void exibir();
}
