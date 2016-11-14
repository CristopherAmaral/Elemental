/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.baralho.Baralho;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Carta;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogador.Jogador;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.usuario.Usuario;
import java.util.List;

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

    private Turno turnoAtual;

    private List<Turno> turnosRealizados;

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

    public void iniciarJogo() {

    }

    public void embaralharBaralho(Baralho pBaralho) {

    }

    public void iniciarPartida() {

        if (jogador1 == null || jogador2 == null) {

            throw new UnsupportedOperationException("FALTAM JOGADORES PARA INCIAR A PARTIDA! ");

        }

        getJogador1().setVida(100);

        getJogador2().setVida(100);

        // ANTES DE INICIAR A PARTIDA OS BARALHOS SÃO EMBARALHADOS
        //
        embaralharBaralho(jogador1.getBaralhoPartida());
        embaralharBaralho(jogador2.getBaralhoPartida());

        turnoAtual = new Turno(jogador1, this);

    }

    public void jogar(Acao pAcaoSelecionada, Carta pCartaAcao, TipoAlvo pAlvo, Carta pCartaAlvo) {

    }

    public Turno getTurnoAtual() {
        return turnoAtual;
    }

    public void setTurnoAtual(Turno turnoAtual) {
        this.turnoAtual = turnoAtual;
    }

    public List<Turno> getTurnosRealizados() {
        return turnosRealizados;
    }

    public void setTurnosRealizados(List<Turno> turnosRealizados) {
        this.turnosRealizados = turnosRealizados;
    }

}
