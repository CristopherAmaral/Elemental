/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.jogo;

import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Carta;
import com.super_bits.GAME_SUPERBITS_ELEMENTAL.elemental.model.carta.Posicao;

/**
 *
 * @author cristopher
 */
public class Jogada {

    private int id;

    private Carta cartaJogador;

    private Carta cartaAdversario;

    private Acao acaoSelecionada;

    private TipoAlvo tipoAlvo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carta getCartaJogador() {
        return cartaJogador;
    }

    public void setCartaJogador(Carta cartaJogador) {
        this.cartaJogador = cartaJogador;
    }

    public Carta getCartaAdversario() {
        return cartaAdversario;
    }

    public void setCartaAdversario(Carta cartaAdversario) {
        this.cartaAdversario = cartaAdversario;
    }

    public Acao getAcaoSelecionada() {
        return acaoSelecionada;
    }

    public void setAcaoSelecionada(Acao acaoSelecionada) {
        this.acaoSelecionada = acaoSelecionada;
    }

    public TipoAlvo getTipoAlvo() {
        return tipoAlvo;
    }

    public void setTipoAlvo(TipoAlvo tipoAlvo) {
        this.tipoAlvo = tipoAlvo;
    }

    public void colocarCartaNoCampo(Carta pCarta, Posicao pPosicao) {

    }

    public void atacarMonstroOponente(Carta pSeuMonstro, Carta pMonstroOponente) {

    }

    public void usaItemEmOponente(Carta pItem) {

    }

    public void usarItemEmVoce(Carta pItem) {

    }

    public void atacarOponente(Carta pSeuMonstro) {

    }

    public void defenderOculto(Carta pCarta) {

    }

    public void defender(Carta pCarta) {

    }

    public void passarVez() {

    }

    public void desistir() {

    }

}
