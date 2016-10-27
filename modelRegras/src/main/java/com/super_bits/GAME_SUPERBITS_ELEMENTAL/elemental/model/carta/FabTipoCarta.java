/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabTipoCarta implements ItfFabrica {

    MONSTRO,
    ITEM;

    @Override
    public Object getRegistro() {
        try {
            TipoCarta tipoAtual = new TipoCarta();

            // DEFINE O ID DO TIPO DA CARTA COFORME A ORDEM DE DECLARAÇÃO
            tipoAtual.setId(this.ordinal() + 1);

            switch (this) {

                case MONSTRO:

                    tipoAtual.setNome("Monstro");
                    tipoAtual.setDescricao("Carta usada para Atacar e Defender");

                    return tipoAtual;

                case ITEM:

                    tipoAtual.setNome("Item");
                    tipoAtual.setDescricao("Carta usada para causar efeitos na partida");

                    return tipoAtual;

                default:
                    throw new AssertionError(this.name());

            }

        } catch (Throwable t) {

            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "NÃO FOI POSSIVEL CRIAR UM TIPO CARTA!", t);

            return null;

        }

    }

}
