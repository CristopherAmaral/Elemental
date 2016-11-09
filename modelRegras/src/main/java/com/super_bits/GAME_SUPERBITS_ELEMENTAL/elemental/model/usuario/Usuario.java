/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.usuario;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.baralho.Baralho;
import java.util.List;

/**
 *
 * @author cristopher
 */
public class Usuario {

    private int id;

    private String email;

    private String nome;

    private List<Baralho> baralhos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Baralho> getBaralhos() {
        return baralhos;
    }

    public void setBaralhos(List<Baralho> baralhos) {
        this.baralhos = baralhos;
    }

}
