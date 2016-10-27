/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.classe;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author cristopher
 */
public enum FabClasse implements ItfFabrica {

    HUMANO,
    MORTO_VIVO,
    BESTA,
    ALADO;

    @Override
    public Object getRegistro() {
        throw new UnsupportedOperationException("A Fabrica de classes nao foi implementada ainda."); //To change body of generated methods, choose Tools | Templates.
    }

}
