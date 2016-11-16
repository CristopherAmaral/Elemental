/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.tipoElemento;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabTipoElemento implements ItfFabrica {

    FOGO,
    TERRA,
    AGUA,
    AR,
    NEUTRO;

    @Override
    public TipoElemento getRegistro() {

        TipoElemento tipoElementoAtual = new TipoElemento();

        switch (this) {
            case FOGO:

                tipoElementoAtual.setNome("Fogo");
                tipoElementoAtual.setDescricao("A carta deste elemento retira seu poder das chamas");

                return tipoElementoAtual;

            case TERRA:

                tipoElementoAtual.setNome("Terra");
                tipoElementoAtual.setDescricao("A carta deste elemento retira seu poder das planicies");

                return tipoElementoAtual;

            case AGUA:

                tipoElementoAtual.setNome("Agua");
                tipoElementoAtual.setDescricao("A carta deste elemento retira seu poder das aguas");

                return tipoElementoAtual;

            case AR:

                tipoElementoAtual.setNome("Ar");
                tipoElementoAtual.setDescricao("A carta deste elemento retira seu poder dos ventos");

                return tipoElementoAtual;

            case NEUTRO:

                tipoElementoAtual.setNome("Neutro");
                tipoElementoAtual.setDescricao("A carta deste elemento retira seu poder do monstro e sua arma");

                return tipoElementoAtual;

            default:
                throw new AssertionError(this.name());

        }

    }

}
