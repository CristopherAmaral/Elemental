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
public enum FabTipoAlvo implements ItfFabrica {

    MONSTRO_OPONENTE,
    MONSTRO_JOGADOR,
    ITEM_OPONENTE,
    ITEM_JOGADOR,
    CAMPO_OPONENTE,
    CAMPO_JOGADOR,
    CAMPO_PARTIDA,
    JOGADOR,
    OPONENTE,
    CEMITERIO_OPONENTE,
    CEMITERIO_JOGADOR,
    BARALHO_OPONENTE,
    BARALHO_JOGADOR,
    MAO_OPONENTE,
    MAO_JOGADOR;

    @Override
    public Object getRegistro() {

        TipoAlvo tipoAlvoAtual = new TipoAlvo();

        switch (this) {
            case MONSTRO_OPONENTE:

                tipoAlvoAtual.setNome("Monstro Oponente");
                tipoAlvoAtual.setDescricao("Define que um Monstro Oponente será o Alvo na Jogada ");

                return tipoAlvoAtual;

            case MONSTRO_JOGADOR:

                tipoAlvoAtual.setNome("Monstro seu");
                tipoAlvoAtual.setDescricao("Define que um Monstro seu será o Alvo na Jogada");

                return tipoAlvoAtual;

            case ITEM_OPONENTE:

                tipoAlvoAtual.setNome("Item Oponente");
                tipoAlvoAtual.setDescricao("Define que um Item Oponente será o Alvo na Jogada");

                return tipoAlvoAtual;

            case ITEM_JOGADOR:

                tipoAlvoAtual.setNome("Item seu");
                tipoAlvoAtual.setDescricao("Define que um Item seu será Alvo na Jogada");

                return tipoAlvoAtual;

            case CAMPO_OPONENTE:

                tipoAlvoAtual.setNome("Campo Oponente");
                tipoAlvoAtual.setDescricao("Define que o Campo Oponente será Alvo na Jogada");

                return tipoAlvoAtual;

            case CAMPO_JOGADOR:

                tipoAlvoAtual.setNome("seu Campo");
                tipoAlvoAtual.setDescricao("Define que o seu Campo será o Alvo na Jogada");

                return tipoAlvoAtual;

            case CAMPO_PARTIDA:

                tipoAlvoAtual.setNome("Campo Partida");
                tipoAlvoAtual.setDescricao("Define que o Campo da Partida será o Alvo na Jogada");

                return tipoAlvoAtual;

            case JOGADOR:

                tipoAlvoAtual.setNome("Jogador");
                tipoAlvoAtual.setDescricao("Define que o Jogador será o Alvo na Jogada");

                return tipoAlvoAtual;

            case OPONENTE:

                tipoAlvoAtual.setNome("Oponente");
                tipoAlvoAtual.setDescricao("Define que o Oponente será o Alvo na Jogada");

                return tipoAlvoAtual;

            case CEMITERIO_OPONENTE:

                tipoAlvoAtual.setNome("Cemitério Oponente");
                tipoAlvoAtual.setDescricao("Define que o Cemitério Oponente será o Alvo na Jogada");

                return tipoAlvoAtual;
            case CEMITERIO_JOGADOR:

                tipoAlvoAtual.setNome("seu Cemitério");
                tipoAlvoAtual.setDescricao("Define que o seu Cemitério será o Alvo na Jogada");

                return tipoAlvoAtual;

            case BARALHO_OPONENTE:

                tipoAlvoAtual.setNome("Baralho Oponente");
                tipoAlvoAtual.setDescricao("Define que o Baralho Oponente será o Alvo na Jogada");

                return tipoAlvoAtual;

            case BARALHO_JOGADOR:

                tipoAlvoAtual.setNome("seu Baralho");
                tipoAlvoAtual.setDescricao("Define que o seu Baralho será o Alvo na Jogada");

                return tipoAlvoAtual;

            case MAO_OPONENTE:

                tipoAlvoAtual.setNome("Mão Oponente");
                tipoAlvoAtual.setDescricao("Define que a Mão Oponente será o Alvo na Jogada");

                return tipoAlvoAtual;

            case MAO_JOGADOR:

                tipoAlvoAtual.setNome("sua Mão");
                tipoAlvoAtual.setDescricao("Define que a sua Mão será o Alvo na Jogada");

                return tipoAlvoAtual;

            default:
                throw new AssertionError(this.name());

        }

    }

}
