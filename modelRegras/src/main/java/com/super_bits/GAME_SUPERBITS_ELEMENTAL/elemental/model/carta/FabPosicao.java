/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabPosicao implements ItfFabrica {

    DEFESA_OCULTA,
    DEFESA_VISIVEL,
    ATAQUE,
    ITEM_OCULTO,
    ITEM_REVELADO;

    @Override
    public Posicao getRegistro() {

        Posicao posicaoAtual = new Posicao();

        switch (this) {
            case DEFESA_OCULTA:

                posicaoAtual.setNome("Defesa Oculta");
                posicaoAtual.setDescricao("Coloca um Monstro oculto no Campo na Posição de Defesa");

                return posicaoAtual;

            case DEFESA_VISIVEL:

                posicaoAtual.setNome("Defesa");
                posicaoAtual.setDescricao("Coloca um Monstro no Campo na Posição de Defesa");

                return posicaoAtual;

            case ATAQUE:

                posicaoAtual.setNome("Ataque");
                posicaoAtual.setDescricao("Coloca um Monstro no Campo na Posição de Ataque");

                return posicaoAtual;

            case ITEM_OCULTO:

                posicaoAtual.setNome("Item Oculto");
                posicaoAtual.setDescricao("Coloca um Item oculto no Campo");

                return posicaoAtual;

            case ITEM_REVELADO:

                posicaoAtual.setNome("Item Revelado");
                posicaoAtual.setDescricao("Coloca um Item revelado no Campo");

                return posicaoAtual;

            default:
                throw new AssertionError(this.name());

        }

    }

}
