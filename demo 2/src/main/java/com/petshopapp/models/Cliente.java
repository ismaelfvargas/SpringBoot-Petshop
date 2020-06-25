package com.petshopapp.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

// Model, vai servir para adicionar atributos para serem usados
// @Entity para indicar que a classe é uma entidade do banco de dados
// @Id para indicar que o campo id é o identificador da entidade
// @GeneratedValue que indica que o valor será gerado banco de dados

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String cpf;
    private String idade;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
