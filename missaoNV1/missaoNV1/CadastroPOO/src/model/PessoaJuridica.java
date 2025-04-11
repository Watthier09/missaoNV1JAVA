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

public class PessoaJuridica extends Pessoa implements Serializable {

    private String cnpj;

    // Construtor padrão
    public PessoaJuridica() {
        super();  // Chama o construtor da classe Pessoa
    }

    // Construtor completo
    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);  // Chama o construtor da classe Pessoa
        this.cnpj = cnpj;
    }

    // Getter e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Sobrescrita do método exibir
    @Override
    public void exibir() {
        System.out.println("Pessoa Jurídica - ID: " + getId() + ", Nome: " + getNome() + ", CNPJ: " + cnpj);
    }
}
