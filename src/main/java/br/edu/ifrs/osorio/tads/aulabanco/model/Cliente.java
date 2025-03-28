package br.edu.ifrs.osorio.tads.aulabanco.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String cpf;
    private String telefone;

    //Com cascade all tira a necessidade de existir previamente um endereco no banco para poder salvar, sendo assim
    //basta salvar um cliente com endereço e o banco vai criar automaticamente o endereço e depois o cliente
    //isso tira a necessidade de um enderecoRepository para salvar este endereco previamente
    @OneToOne (cascade = CascadeType.ALL)
    private Endereco endereco = new Endereco();

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "cliente_id")
    private List<Pedido> pedidos;


    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
