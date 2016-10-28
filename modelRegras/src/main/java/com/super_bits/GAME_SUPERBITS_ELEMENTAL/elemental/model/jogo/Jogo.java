/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogador.Jogador;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.usuario.Usuario;

/**
 *
 * @author cristopher
 */
public class Jogo {

    public Jogo(Usuario pUsuario) {

        jogador1 = new Jogador(pUsuario);

    }

    private int id;

    private Jogador jogador1;

    private Jogador jogador2;

    private Jogador jogadorAtual;

    private int turno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(Jogador jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void iniciarJogo() {

    }

}
