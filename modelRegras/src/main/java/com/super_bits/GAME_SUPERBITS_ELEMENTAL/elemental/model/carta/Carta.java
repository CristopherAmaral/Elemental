/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.efeito.Efeito;
import java.util.List;

/**
 *
 * @author cristopher
 */
public class Carta {

    private int id;

    private String nome;

    private String descricao;

    private TipoCarta tipoCarta;

    private List<Efeito> efeitos;

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

    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(TipoCarta tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public List<Efeito> getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(List<Efeito> efeitos) {
        this.efeitos = efeitos;
    }

}
