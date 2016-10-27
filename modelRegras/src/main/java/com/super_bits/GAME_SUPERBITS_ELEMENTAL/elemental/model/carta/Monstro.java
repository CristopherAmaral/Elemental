/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.classe.Classe;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.tipoClasse.TipoClasse;

/**
 *
 * @author cristopher
 */
public class Monstro extends Carta {

    private int atk;

    private int def;

    private Classe classe;

    private TipoClasse tipoClasse;

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public TipoClasse getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(TipoClasse tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

}
