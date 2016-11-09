/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta;

/**
 *
 * @author cristopher
 */
public class CartaMesa {

    private int id;

    private Carta carta;

    private PosicaoCartaMesa modoCarta;

    private int rodadasNaMesa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public PosicaoCartaMesa getModoCarta() {
        return modoCarta;
    }

    public void setModoCarta(PosicaoCartaMesa modoCarta) {
        this.modoCarta = modoCarta;
    }

    public int getRodadasNaMesa() {
        return rodadasNaMesa;
    }

    public void setRodadasNaMesa(int rodadasNaMesa) {
        this.rodadasNaMesa = rodadasNaMesa;
    }

}
