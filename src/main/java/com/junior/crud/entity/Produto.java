package com.junior.crud.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nome_banco")
    private String nome;

    @Column(name="preco_produto")
    private BigDecimal preco;
    private Integer estoque;

    public Produto() {}

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
