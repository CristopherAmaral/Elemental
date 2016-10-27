/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.efeito;

/**
 *
 * @author cristopher
 */
public class TipoEfeito {

    private int id;

    private String nome;

    private String descricao;

    private FabTipoEfeito enumTipo;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public FabTipoEfeito getEnumTipo() {
        return enumTipo;
    }

    public void setEnumTipo(FabTipoEfeito enumTipo) {
        this.enumTipo = enumTipo;
    }

}
