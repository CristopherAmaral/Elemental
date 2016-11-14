/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Item;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Monstro;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogador.Jogador;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.tipoClasse.FabTipoClasse;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.usuario.Usuario;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabDadosTest implements ItfFabrica {

    USUARIO1,
    USUARIO2,
    CARTA_MONSTRO1,
    CARTA_MONSTRO2,
    CARTA_MONSTRO3,
    CARTA_ITEM1,
    CARTA_ITEM2,
    CARTA_ITEM3;

    @Override
    public Object getRegistro() {

        switch (this) {
            case USUARIO1:

                Usuario usuario1 = new Usuario();

                usuario1.setId(1);
                usuario1.setEmail("jogador1@email.com");
                usuario1.setNome("Girfrid o Cavaleiro de Ferro");

                return usuario1;

            case USUARIO2:

                Usuario usuario2 = new Usuario();

                usuario2.setId(2);
                usuario2.setEmail("jogador2@email.com");
                usuario2.setNome("Gaia o matador de Dragões");

                return usuario2;

            case CARTA_MONSTRO1:

                Monstro monstro1 = new Monstro();

                monstro1.setNome("");
                monstro1.setTipoClasse(FabTipoClasse.);
                monstro1.setClasse(classe);
                monstro1.setAtk(1);
                monstro1.setDef(1);

                return monstro1;

            case CARTA_MONSTRO2:

                Monstro monstro2 = new Monstro();

                return monstro2;

            case CARTA_MONSTRO3:

                Monstro monstro3 = new Monstro();

                return monstro3;

            case CARTA_ITEM1:

                Item item1 = new Item();

                return item1;

            case CARTA_ITEM2:

                Item item2 = new Item();

                return item2;

            case CARTA_ITEM3:

                Item item3 = new Item();

                return item3;

            default:

                throw new AssertionError(this.name());

        }

    }

}
