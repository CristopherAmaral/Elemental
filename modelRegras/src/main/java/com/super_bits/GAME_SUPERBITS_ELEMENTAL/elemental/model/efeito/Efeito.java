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
public class Efeito {

    private int id;

    private int valor;

    private TipoEfeito tipoEfeito;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoEfeito getTipoEfeito() {
        return tipoEfeito;
    }

    public void setTipoEfeito(TipoEfeito tipoEfeito) {
        this.tipoEfeito = tipoEfeito;
    }

}
