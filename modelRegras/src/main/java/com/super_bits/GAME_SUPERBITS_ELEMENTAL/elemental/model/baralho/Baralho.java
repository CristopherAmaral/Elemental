/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.baralho;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Carta;
import java.util.List;

/**
 *
 * @author cristopher
 */
public class Baralho {

    private int id;

    private String nome;

    private List<Carta> cartasBaralho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carta> getCartasBaralho() {
        return cartasBaralho;
    }

    public void setCartasBaralho(List<Carta> cartasBaralho) {
        this.cartasBaralho = cartasBaralho;
    }

}
