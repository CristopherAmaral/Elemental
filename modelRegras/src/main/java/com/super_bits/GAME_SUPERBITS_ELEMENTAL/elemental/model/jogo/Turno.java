/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogador.Jogador;
import java.util.List;

/**
 *
 * @author cristopher
 */
public class Turno {

    private int id;

    private Jogo jogo;

    private Jogador jogador;

    private List<Jogada> jogada;

    public Turno(Jogador pJogador, Jogo pJogo) {

        jogador = pJogador;

        jogo = pJogo;

        getJogador().incrementarQtdTurnos();

        // O JOGADOR DO TURNO SACA CARTA COMO É O PRIMEIRO TURNO RECEBE 5 CARTAS
        //
        sacarCartaInicioTurno();

    }

    private boolean colocouMonstroNoCampo;

    public boolean getTemMaisQueCincoCartasMao() {

        if (jogo.getTurnoAtual().getJogador().getMao().size() > 5) {

            return true;

        } else {

            return false;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public final Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public List<Jogada> getJogada() {
        return jogada;
    }

    public void setJogada(List<Jogada> jogada) {
        this.jogada = jogada;
    }

    private void sacarCartaInicioTurno() {

        if (jogador.getQtdTurno() > 1) {

            sacarCartaJogadorAtual();

        } else {

            for (int i = 0; i < 5; i++) {

                sacarCartaJogadorAtual();

            }

        }

    }

    private void sacarCartaJogadorAtual() {

        jogador.getMao().add(jogador.getBaralhoPartida().getCartasBaralho().get(0));
        jogador.getBaralhoPartida().getCartasBaralho().remove(0);

    }

}
