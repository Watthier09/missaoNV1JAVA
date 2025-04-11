/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model; 

import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable {

    private String cpf;
    private int idade;

    // Construtor padrão
    public PessoaFisica() {
        super();  // Chama o construtor da classe Pessoa
    }

    // Construtor completo
    public PessoaFisica(int id, String nome, String cpf, int idade) {
        super(id, nome);  // Chama o construtor da classe Pessoa
        this.cpf = cpf;
        this.idade = idade;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobrescrita do método exibir
    @Override
    public void exibir() {
        System.out.println("Pessoa Física - ID: " + getId() + ", Nome: " + getNome() + ", CPF: " + cpf + ", Idade: " + idade);
    }
}
