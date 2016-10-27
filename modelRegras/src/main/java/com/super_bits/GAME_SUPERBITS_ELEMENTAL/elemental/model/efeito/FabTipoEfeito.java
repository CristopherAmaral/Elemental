/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.efeito;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabTipoEfeito implements ItfFabrica {

    REDUCAO_ATK_OPONENTE,
    REDUCAO_ATK_JOGADOR,
    REDUCAO_DEF_OPONENTE,
    REDUCAO_DEF_JOGADOR,
    AUMENTO_ATK_JOGADOR,
    AUMENTO_ATK_OPONENTE,
    AUMENTO_DEF_JOGADOR,
    AUMENTO_DEF_OPONENTE,
    DEFINIR_CAMPO,
    REDUZIR_VIDA_OPONENTE,
    REDUZIR_VIDA_JOGADOR,
    AUMENTAR_VIDA_OPONENTE,
    AUMENTAR_VIDA_JOGADOR,
    REVIVER;

    @Override
    public Object getRegistro() {
        try {
            switch (this) {

                case REDUCAO_ATK_OPONENTE:

                    break;

                case REDUCAO_ATK_JOGADOR:

                    break;

                case REDUCAO_DEF_OPONENTE:

                    break;

                case REDUCAO_DEF_JOGADOR:

                    break;

                case AUMENTO_ATK_JOGADOR:

                    break;

                case AUMENTO_ATK_OPONENTE:

                    break;

                case AUMENTO_DEF_JOGADOR:

                    break;

                case AUMENTO_DEF_OPONENTE:

                    break;

                case DEFINIR_CAMPO:

                    break;

                case REDUZIR_VIDA_OPONENTE:

                    break;

                case REDUZIR_VIDA_JOGADOR:

                    break;

                case AUMENTAR_VIDA_OPONENTE:

                    break;

                case AUMENTAR_VIDA_JOGADOR:

                    break;

                case REVIVER:

                    break;

                default:

                    throw new AssertionError(this.name());

            }

        } catch (Throwable t) {

        }

        return null;

    }
}
