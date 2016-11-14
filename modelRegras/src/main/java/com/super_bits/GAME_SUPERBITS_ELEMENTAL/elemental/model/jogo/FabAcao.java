/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabAcao implements ItfFabrica {

    ATACAR,
    DEFENDER,
    USAR_ITEM,
    PASSAR_VEZ,
    DESISTIR;

    @Override
    public Object getRegistro() {

        Acao acaoAtual = new Acao();

        switch (this) {
            case ATACAR:

                acaoAtual.setNome("Atacar");
                acaoAtual.setDescricao("Faz com que o Monstro selecionado desfira um ataque contra o oponente");

                return acaoAtual;

            case DEFENDER:

                acaoAtual.setNome("Defender");
                acaoAtual.setDescricao("Faz com que o Monstro selecionado entre em postura defensiva");

                return acaoAtual;

            case USAR_ITEM:

                acaoAtual.setNome("Usar Item");
                acaoAtual.setDescricao("Permite o jogador usar o efeito de um item mágico selecionado");

                return acaoAtual;

            case PASSAR_VEZ:

                acaoAtual.setNome("Passar Vez");
                acaoAtual.setDescricao("Encerra o Turno e passa a vez para o proximo jogador");

                return acaoAtual;

            case DESISTIR:

                acaoAtual.setNome("Desistir");
                acaoAtual.setDescricao("Faz com que a partida seja encerrada definindo o oponente como vencedor");

                return acaoAtual;

            default:
                throw new AssertionError(this.name());

        }

    }

}
